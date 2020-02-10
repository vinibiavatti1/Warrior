package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class MinaDiamante extends Construcao
{

    public MinaDiamante(BancoDeDados bd)
    {
        super(bd, 17, "Mina de Diamantes", "Aumenta o estoque de ouro +10.000 (Chance 0.1%)", 2500, 2100, 2100, 1200);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
    }

    @Override
    public void acao()
    {
        if(new Random().nextInt(1000) == 1)
        {
            this.getBd().addOuro(10000);
        }
    }
    
}
