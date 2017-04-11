package Fontes.Unidades;

import Fontes.BancoDeDados;
import java.io.Serializable;

/**
 *
 * @author Vinicius
 */
public abstract class Unidade implements Serializable
{
    private int id;
    private String nome;
    private int forca;
    private int ouro;
    private int madeira;
    private int pedra;
    private int comida;
    private BancoDeDados bd;

    public Unidade(int id, String nome, int forca, int ouro, int madeira, int pedra, int comida, BancoDeDados bd)
    {
        this.id = id;
        this.nome = nome;
        this.forca = forca;
        this.ouro = ouro;
        this.madeira = madeira;
        this.pedra = pedra;
        this.comida = comida;
        this.bd = bd;
    }
    
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

    public int getForca()
    {
        return forca;
    }

    public void setForca(int forca)
    {
        this.forca = forca;
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
