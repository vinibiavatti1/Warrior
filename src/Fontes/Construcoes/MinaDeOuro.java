package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class MinaDeOuro extends Construcao
{

    public MinaDeOuro(BancoDeDados bd)
    {
        super(bd, 1, "Mina de Ouro", "Aumenta a produção de ouro +1", 150, 200, 50, 100);
    }

    @Override
    public void construir()
    {
        
    }

    @Override
    public void acao()
    {
        this.getBd().addOuro(1);
    }

}
