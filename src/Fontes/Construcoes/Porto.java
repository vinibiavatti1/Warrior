package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.CavaleiroArqueiro;
import Fontes.Unidades.Navio;
import Fontes.Unidades.PortaAviao;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Porto extends Construcao
{

    public Porto(BancoDeDados bd)
    {
        super(bd, 27, "Porto", "Habilita a criação de Navios", 21000, 15100, 15000, 2000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoUnidade().add(new Navio(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new PortaAviao(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
