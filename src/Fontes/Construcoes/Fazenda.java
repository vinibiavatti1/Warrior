package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Fazenda extends Construcao
{

    public Fazenda(BancoDeDados bd)
    {
        super(bd, 4, "Fazenda", "Aumenta o estoque de comida +1", 300, 200, 200, 200);
    }

    @Override
    public void construir()
    {
        
    }

    @Override
    public void acao()
    {
        this.getBd().addComida(1);
    }

}
