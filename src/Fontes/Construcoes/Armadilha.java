package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Armadilha extends Construcao
{

    public Armadilha(BancoDeDados bd)
    {
        super(bd, 30, "Armadilha", "Aumenta a defesa +5", 50, 500, 500, 100);
    }

    @Override
    public void construir()
    {
        this.getBd().addDefesa(5);
    }

    @Override
    public void acao()
    {
        
    } 
}
