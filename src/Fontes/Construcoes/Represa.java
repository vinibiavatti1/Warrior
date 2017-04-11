package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Represa extends Construcao
{

    public Represa(BancoDeDados bd)
    {
        super(bd, 18, "Represa", "Produção de Energia", 5000, 5000, 5000, 5000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Laboratorio(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Igreja(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
