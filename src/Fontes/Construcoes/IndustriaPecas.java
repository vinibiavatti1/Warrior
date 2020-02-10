package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Atirador;
import Fontes.Unidades.Canhao;
import Fontes.Unidades.CavaleiroArqueiro;
import Fontes.Unidades.HomemClava;
import Fontes.Unidades.Morteiro;
import Fontes.Unidades.Soldado;
import Fontes.Unidades.Tanque;
import Fontes.Unidades.TanqueAnfibio;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class IndustriaPecas extends Construcao
{

    public IndustriaPecas(BancoDeDados bd)
    {
        super(bd, 29, "Industria de Peças", "Habilita a criação de tanques e canhões", 21000, 16450, 15000, 8000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Petrolifera(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Porto(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Aeroporto(this.getBd()));
        
        this.getBd().getListaCatalogoUnidade().add(new Canhao(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Tanque(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new TanqueAnfibio(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Morteiro(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
