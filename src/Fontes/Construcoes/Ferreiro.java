package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Arqueiro;
import Fontes.Unidades.HomemClava;
import Fontes.Unidades.Lanceiro;

/**
 *
 * @author vinicius.reif
 */
public class Ferreiro extends Construcao
{

    public Ferreiro(BancoDeDados bd)
    {
        super(bd, 6, "Ferreiro", "Cria armas e artefatos de guerra", 700, 500, 340, 150);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Quartel(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Estabulo(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Muro(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Represa(this.getBd()));
    }

    @Override
    public void acao()
    {
        
    }

}
