package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Missil;
import Fontes.Unidades.Soldado;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class LancaMissil extends Construcao
{

    public LancaMissil(BancoDeDados bd)
    {
        super(bd, 28, "Lança Misseis", "Habilita o lançamento de Misseis", 100000, 100000, 100000, 100000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoUnidade().add(new Missil(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
