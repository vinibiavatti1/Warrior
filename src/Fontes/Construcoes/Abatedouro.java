package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Abatedouro extends Construcao
{

    public Abatedouro(BancoDeDados bd)
    {
        super(bd, 7, "Abatedouro", "Aumenta a produção de comida +1 ou +2", 500, 300, 200, 150);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Moinho(this.getBd()));
    }

    @Override
    public void acao()
    {
        if(new Random().nextBoolean())
        {
            this.getBd().addComida(1);
        }
        else
        {
            this.getBd().addComida(2);
        }
    }
}
