package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Aviao;
import Fontes.Unidades.Balao;
import Fontes.Unidades.Helicoptero;
import Fontes.Unidades.Planador;
import Fontes.Unidades.Soldado;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Aeroporto extends Construcao
{

    public Aeroporto(BancoDeDados bd)
    {
        super(bd, 20, "Aeroporto", "Habilita a criação de aviões", 30000, 15700, 27900, 12500);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new LancaMissil(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Balao(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Aviao(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Helicoptero(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Planador(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
