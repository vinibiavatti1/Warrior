package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Balao;
import Fontes.Unidades.Barco;
import Fontes.Unidades.BarcoLancaChamas;
import Fontes.Unidades.CavaleiroArqueiro;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Doca extends Construcao
{

    public Doca(BancoDeDados bd)
    {
        super(bd, 32, "Doca", "Habilita a criação de Barcos", 800, 2100, 2100, 100);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoUnidade().add(new Barco(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new BarcoLancaChamas(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
