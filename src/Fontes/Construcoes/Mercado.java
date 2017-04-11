package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Mercado extends Construcao
{

    public Mercado(BancoDeDados bd)
    {
        super(bd, 15, "Mercado", "Permite realizar trocas", 1800, 2000, 1000, 3000);
    }

    @Override
    public void construir()
    {
        
    }

    @Override
    public void acao()
    {
        
    }
}
