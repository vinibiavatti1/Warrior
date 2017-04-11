package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Moinho extends Construcao
{

    public Moinho(BancoDeDados bd)
    {
        super(bd, 26, "Moinho", "Aumenta a produção de comida +15 e auxilia na comercialização", 1000, 3500, 2000, 500);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Mercado(this.getBd()));
    }

    @Override
    public void acao()
    {
        if(new Random().nextBoolean())
        {
            this.getBd().addComida(15);
        }
    } 
}
