package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Madeireira extends Construcao
{

    public Madeireira(BancoDeDados bd)
    {
        super(bd, 2, "Madeireira", "Aumenta a produção de madeira +1", 300, 200, 300, 200);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
    }

    @Override
    public void acao()
    {
        this.getBd().addMadeira(1);
    }

}
