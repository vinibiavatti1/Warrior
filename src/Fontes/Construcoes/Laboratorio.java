package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Laboratorio extends Construcao
{

    public Laboratorio(BancoDeDados bd)
    {
        super(bd, 12, "Laboratorio", "Realiza novos estudos", 8500, 3000, 3000, 500);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new RodaAgua(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Universidade(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Observatorio(this.getBd()));
    }

    @Override
    public void acao()
    {
        
    }
}
