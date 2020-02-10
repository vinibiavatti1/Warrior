package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Cavaleiro;
import Fontes.Unidades.CavaleiroArqueiro;
import Fontes.Unidades.Guerreiro;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Estabulo extends Construcao
{

    public Estabulo(BancoDeDados bd)
    {
        super(bd, 9, "Estabulo", "Habilita a criação de cavaleiros", 1800, 1600, 300, 1800);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoUnidade().add(new Cavaleiro(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new CavaleiroArqueiro(this.getBd()));
    }

    @Override
    public void acao()
    {
        
    }
}
