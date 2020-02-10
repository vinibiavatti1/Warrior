package Fontes.Construcoes;

import Fontes.BancoDeDados;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Universidade extends Construcao
{

    public Universidade(BancoDeDados bd)
    {
        super(bd, 14, "Universidade", "Habilita a criação de novas estruturas", 10000, 6000, 7000, 1000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Castelo(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new CentroDistribuicao(this.getBd()));
    }

    @Override
    public void acao()
    {

    }
    
}
