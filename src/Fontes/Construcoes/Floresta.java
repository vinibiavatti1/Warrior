package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Floresta extends Construcao
{

    public Floresta(BancoDeDados bd)
    {
        super(bd, 24, "Floresta", "Aumenta a produção de madeira +30", 1500, 500, 500, 500);
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
        this.getBd().addMadeira(30);
    } 
}
