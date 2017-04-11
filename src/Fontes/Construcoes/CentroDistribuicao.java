package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class CentroDistribuicao extends Construcao
{

    public CentroDistribuicao(BancoDeDados bd)
    {
        super(bd, 21, "Centro de Distribuição", "Aumenta o armazem +3200", 5000, 5000, 4500, 3750);
    }

    @Override
    public void construir()
    {
        this.getBd().addArmazem(3200);
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
    }

    @Override
    public void acao()
    {
        
    }

}
