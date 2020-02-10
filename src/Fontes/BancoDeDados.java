package Fontes;

import Fontes.Construcoes.Armazem;
import Fontes.Construcoes.Construcao;
import Fontes.Construcoes.Fazenda;
import Fontes.Construcoes.Madeireira;
import Fontes.Construcoes.MinaDeOuro;
import Fontes.Construcoes.Pedreira;
import Fontes.Unidades.Unidade;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Classe serializável
 * @author vinicius.reif
 */
public class BancoDeDados implements Serializable
{
    //Debug
    public static final boolean DEBUG = false;
    
    //Listas
    private CopyOnWriteArrayList<Construcao> listaCatalogoConstrucao = new CopyOnWriteArrayList<>();
    private ConcurrentHashMap<Integer, Integer> listaConstrucao = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<Unidade> listaCatalogoUnidade = new CopyOnWriteArrayList<>();
    private ConcurrentHashMap<Integer, Integer> listaUnidade = new ConcurrentHashMap<>();
    
    //Recursos
    private int ouro = 1000;
    private int madeira = 1000;
    private int pedra = 1000;
    private int comida = 1000;
    private int forca = 0;
    private int defesa = 0;
    private int vida;
    private int armazem = 1000;
    private int vidaMax;
    
    //Exploradores
    private int exploradores = 0;
    
    //Configurações
    private String dir;
    private String nome;

    //Construtor
    public BancoDeDados(String dir, String nome, int vidaMax)
    {
        this.vidaMax = vidaMax;
        this.vida = vidaMax;
        
        if(DEBUG)
        {
            this.ouro = 90000;
            this.madeira = 90000;
            this.pedra = 90000;
            this.comida = 90000;
            this.forca = 90000;
            this.defesa = 20;
            this.vida = 5000;
            this.armazem = 100000;
        }
        //Configurações
        this.dir = dir;
        this.nome = nome;
        
        this.listaCatalogoConstrucao.add(new MinaDeOuro(this));
        this.listaCatalogoConstrucao.add(new Madeireira(this));
        this.listaCatalogoConstrucao.add(new Pedreira(this));
        this.listaCatalogoConstrucao.add(new Fazenda(this));
        this.listaCatalogoConstrucao.add(new Armazem(this));
        
        this.listaConstrucao.put(new MinaDeOuro(this).getId(), 1);
        this.listaConstrucao.put(new Pedreira(this).getId(), 1);
        this.listaConstrucao.put(new Madeireira(this).getId(), 1);
        this.listaConstrucao.put(new Fazenda(this).getId(), 1);
    }

    //Metodos
    public CopyOnWriteArrayList<Construcao> getListaCatalogoConstrucao()
    {
        return listaCatalogoConstrucao;
    }

    public void setListaCatalogoConstrucao(CopyOnWriteArrayList<Construcao> listaCatalogoConstrucao)
    {
        this.listaCatalogoConstrucao = listaCatalogoConstrucao;
    }

    public ConcurrentHashMap<Integer, Integer> getListaConstrucao()
    {
        return listaConstrucao;
    }

    public void setListaConstrucao(ConcurrentHashMap<Integer, Integer> listaConstrucao)
    {
        this.listaConstrucao = listaConstrucao;
    }

    public Construcao getConstrucaoCatalogo(int id)
    {
        for(Construcao c : this.getListaCatalogoConstrucao())
        {
            if(c.getId() == id)
            {
                return c;
            }
        }
        return null;
    }
    
    public Construcao getConstrucaoCatalogo(String nome)
    {
        for(Construcao c : this.getListaCatalogoConstrucao())
        {
            if(c.getNome().equals(nome))
            {
                return c;
            }
        }
        return null;
    }
    
    public void chamarAcaoContrucoes()
    {
        for (Map.Entry<Integer, Integer> entry : this.getListaConstrucao().entrySet()) {
            Integer id = entry.getKey();
            Integer amount = entry.getValue();
            Construcao construcao = getConstrucaoCatalogo(id);
            if(construcao != null) {
                for(int i = 0; i < amount; i++) {
                    construcao.acao();
                }
            }
        }
    }
    
    public Unidade getUnidadeCatalogo(int id)
    {
        for(Unidade u : this.getListaCatalogoUnidade())
        {
            if(u.getId() == id)
            {
                return u;
            }
        }
        return null;
    }
    
    public int getQtdConstrucao(int id)
    {
        Integer amount = this.getListaConstrucao().get(id);
        if(amount == null) {
            return 0;
        }
        return amount;
    }
    
    public boolean compararPrecoConstrucao(int id)
    {
        Construcao c = this.getConstrucaoCatalogo(id);
        return  this.getOuro() >= c.getOuro() &&
                this.getMadeira() >= c.getMadeira() &&
                this.getPedra() >= c.getPedra() &&
                this.getComida() >= c.getComida();
    }
    
    public boolean compararPrecoUnidade(int id)
    {
        Unidade u = this.getUnidadeCatalogo(id);
        return  this.getOuro() >= u.getOuro() &&
                this.getMadeira() >= u.getMadeira() &&
                this.getPedra() >= u.getPedra() &&
                this.getComida() >= u.getComida();
    }
    
    public boolean compararPrecoUnidade(Unidade u)
    {
        return  this.getOuro() >= u.getOuro() &&
                this.getMadeira() >= u.getMadeira() &&
                this.getPedra() >= u.getPedra() &&
                this.getComida() >= u.getComida();
    }
    
    public boolean construcaoConstruida(int id)
    {
        return this.getListaConstrucao().get(id) != null;
    }
    
    public boolean construcaoConstruida(String name)
    {
        for (Map.Entry<Integer, Integer> entry : this.getListaConstrucao().entrySet()) {
            Integer id = entry.getKey();
            Construcao c = this.getConstrucaoCatalogo(id);
            if(c.getNome().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void limparUnidades()
    {
        this.listaUnidade.clear();
    }
    
    public synchronized boolean criar(int id)
    {
        if(this.compararPrecoUnidade(id))
        {
            Integer amount = this.listaUnidade.get(id);
            if(amount == null) amount = 0;
            this.listaUnidade.put(id, amount + 1);
            this.ouro -= this.getUnidadeCatalogo(id).getOuro();
            this.madeira -= this.getUnidadeCatalogo(id).getMadeira();
            this.pedra -= this.getUnidadeCatalogo(id).getPedra();
            this.comida -= this.getUnidadeCatalogo(id).getComida();
            this.addForca(this.getUnidadeCatalogo(id).getForca());
            return true;
        }
        return false;
    }
    
    public synchronized boolean construir(int id)
    {
        if(this.compararPrecoConstrucao(id))
        {
            this.getConstrucaoCatalogo(id).construir();
            
            Integer amount = this.listaConstrucao.get(id);
            if(amount == null) amount = 0;
            this.listaConstrucao.put(id, amount + 1);
            this.ouro -= this.getConstrucaoCatalogo(id).getOuro();
            this.madeira -= this.getConstrucaoCatalogo(id).getMadeira();
            this.pedra -= this.getConstrucaoCatalogo(id).getPedra();
            this.comida -= this.getConstrucaoCatalogo(id).getComida();
            return true;
        }
        return false;
    }
    
    public void addOuro(int qtd)
    {
        if(this.ouro + qtd > this.armazem)
        {
            this.ouro = this.armazem;
            return;
        }
        this.ouro += qtd;
    }
    
    public void addMadeira(int qtd)
    {
        if(this.madeira + qtd > this.armazem)
        {
            this.madeira = this.armazem;
            return;
        }
        this.madeira += qtd;
    }
    
    public void addPedra(int qtd)
    {
        if(this.pedra + qtd > this.armazem)
        {
            this.pedra = this.armazem;
            return;
        }
        this.pedra += qtd;
    }
    
    public void addComida(int qtd)
    {
        if(this.comida + qtd > this.armazem)
        {
            this.comida = this.armazem;
            return;
        }
        this.comida += qtd;
    }
    
    public void addArmazem(int qtd)
    {
        this.armazem += qtd;
    }
    
    public void addForca(int qtd)
    {
        this.forca += qtd;
    }
    
    public void addDefesa(int qtd)
    {
        this.defesa += qtd;
    }
    
    public void addVida(int qtd)
    {
        if((this.vida + qtd) > this.vidaMax)
        {
            this.vida = this.vidaMax;
        }
        else
        {
            this.vida += qtd;
        }
    }
    
    //Get e Set
    public int getOuro()
    {
        return ouro;
    }

    public void setOuro(int ouro)
    {
        this.ouro = ouro;
    }

    public int getMadeira()
    {
        return madeira;
    }

    public void setMadeira(int madeira)
    {
        this.madeira = madeira;
    }

    public int getPedra()
    {
        return pedra;
    }

    public void setPedra(int pedra)
    {
        this.pedra = pedra;
    }

    public int getComida()
    {
        return comida;
    }

    public void setComida(int comida)
    {
        this.comida = comida;
    }

    public int getForca()
    {
        return forca;
    }

    public void setForca(int forca)
    {
        this.forca = forca;
    }

    public int getDefesa()
    {
        return defesa;
    }

    public void setDefesa(int defesa)
    {
        this.defesa = defesa;
    }

    public int getVida()
    {
        return vida;
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public int getArmazem()
    {
        return armazem;
    }

    public void setArmazem(int armazem)
    {
        this.armazem = armazem;
    }

    public String getDir()
    {
        return dir;
    }
    
    public String getDirCompleto()
    {
        return dir + "/" + nome;
    }

    public void setDir(String dir)
    {
        this.dir = dir;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public CopyOnWriteArrayList<Unidade> getListaCatalogoUnidade()
    {
        return listaCatalogoUnidade;
    }

    public void setListaCatalogoUnidade(CopyOnWriteArrayList<Unidade> listaCatalogoUnidade)
    {
        this.listaCatalogoUnidade = listaCatalogoUnidade;
    }

    public ConcurrentHashMap<Integer, Integer> getListaUnidade()
    {
        return listaUnidade;
    }

    public void setListaUnidade(ConcurrentHashMap<Integer, Integer> listaUnidade)
    {
        this.listaUnidade = listaUnidade;
    }

    public int getVidaMax()
    {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax)
    {
        this.vidaMax = vidaMax;
    }

    public int getExploradores()
    {
        return exploradores;
    }

    public void setExploradores(int exploradores)
    {
        this.exploradores = exploradores;
    }
}
