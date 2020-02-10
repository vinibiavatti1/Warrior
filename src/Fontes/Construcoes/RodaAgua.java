package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class RodaAgua extends Construcao
{

    public RodaAgua(BancoDeDados bd)
    {
        super(bd, 13, "Roda da Água", "Aumenta a produção de comida +3 ou +4", 500, 2000, 100, 100);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new MinaDiamante(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Floresta(this.getBd()));
    }

    @Override
    public void acao()
    {
        if(new Random().nextBoolean())
        {
            this.getBd().addComida(3);
        }
        else
        {
            this.getBd().addComida(4);
        }
    }
    
}
