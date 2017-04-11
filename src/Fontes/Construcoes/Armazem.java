package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Armazem extends Construcao
{

    public Armazem(BancoDeDados bd)
    {
        super(bd, 5, "Armazem", "Aumenta o armazem +500", 1000, 1000, 1000, 1000);
    }

    @Override
    public void construir()
    {
        this.getBd().addArmazem(500);
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Ferreiro(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Abatedouro(this.getBd()));
    }

    @Override
    public void acao()
    {
        
    }

}
