package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Atirador;
import Fontes.Unidades.HomemClava;
import Fontes.Unidades.LancaChamas;
import Fontes.Unidades.Sniper;
import Fontes.Unidades.Soldado;
import Fontes.Unidades.Suicida;
import Fontes.Unidades.Tanque;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Exercito extends Construcao
{

    public Exercito(BancoDeDados bd)
    {
        super(bd, 19, "Exército", "Habilita a criação de soldados", 8900, 7500, 6000, 7450);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Academia(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new IndustriaPecas(this.getBd()));
        
        this.getBd().getListaCatalogoUnidade().add(new Soldado(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Sniper(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Suicida(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new LancaChamas(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
