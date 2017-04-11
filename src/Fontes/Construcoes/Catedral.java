package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Catedral extends Construcao
{

    public Catedral(BancoDeDados bd)
    {
        super(bd, 25, "Catedral", "Restaura a cidade +10", 3000, 1800, 4000, 2700);
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
        if(new Random().nextInt(50) <= 25)
        {
            this.getBd().addVida(10);
        }
    } 
}
