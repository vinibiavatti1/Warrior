package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Petrolifera extends Construcao
{

    public Petrolifera(BancoDeDados bd)
    {
        super(bd, 16, "Pretrolifera", "Aumenta o estoque de ouro +6 com sorte +2", 1000, 3700, 2500, 2000);
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
        this.getBd().addOuro(6);
        if(new Random().nextBoolean())
        {
            this.getBd().addOuro(2);
        }
    }
    
}
