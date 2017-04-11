package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Muro extends Construcao
{

    public Muro(BancoDeDados bd)
    {
        super(bd, 11, "Muro", "Aumenta a defesa +2", 30, 200, 200, 0);
    }

    @Override
    public void construir()
    {
        this.getBd().addDefesa(2);
    }

    @Override
    public void acao()
    {
        
    }
}
