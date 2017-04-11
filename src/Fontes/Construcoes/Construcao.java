package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.io.Serializable;

/**
 *
 * @author vinicius.reif
 */
public abstract class Construcao implements Serializable
{
    private int id;
    private String nome;
    private String desc;
    private int ouro;
    private int madeira;
    private int pedra;
    private int comida;
    private BancoDeDados bd;

    public Construcao(BancoDeDados bd, int id, String nome, String desc, int ouro, int madeira, int pedra, int comida)
    {
        this.bd = bd;
        this.id = id;
        this.nome = nome;
        this.desc = desc;
        this.ouro = ouro;
        this.madeira = madeira;
        this.pedra = pedra;
        this.comida = comida;
    }

    /**
     * Método chamado apenas na hora da construção
     */
    public abstract void construir();
    
    /**
     * Método chamado ao decorrer do tempo do jogo
     */
    public abstract void acao();

        
    //Get e Set
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getDesc()
    {
        return desc;
    }

    public void setDesc(String desc)
    {
        this.desc = desc;
    }

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

    public BancoDeDados getBd()
    {
        return bd;
    }

    public void setBd(BancoDeDados bd)
    {
        this.bd = bd;
    }

    
}
