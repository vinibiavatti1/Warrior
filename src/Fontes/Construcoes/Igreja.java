package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Igreja extends Construcao
{

    public Igreja(BancoDeDados bd)
    {
        super(bd, 33, "Igreja", "Restaura a cidade +5", 1750, 1500, 2000, 3000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Catedral(this.getBd()));
    }

    @Override
    public void acao()
    {
        if(new Random().nextInt(50) == 1)
        {
            this.getBd().addVida(5);
        }
    } 
}
