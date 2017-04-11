package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Pedreira extends Construcao
{

    public Pedreira(BancoDeDados bd)
    {
        super(bd, 3, "Pedreira", "Aumenta a produção de pedra +1", 200, 400, 50, 250);
    }

    @Override
    public void construir()
    {
        
    }

    @Override
    public void acao()
    {
        this.getBd().addPedra(1);
    }

}
