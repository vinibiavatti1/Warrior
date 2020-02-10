package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Atirador;
import Fontes.Unidades.CavaleiroArqueiro;
import Fontes.Unidades.Gladiador;
import Fontes.Unidades.Guardiao;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Castelo extends Construcao
{

    public Castelo(BancoDeDados bd)
    {
        super(bd, 31, "Castelo", "Habilita a criação de novas unidades", 4000, 4000, 19000, 2000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().construcaoConstruida(this.getId()))
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Exercito(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Gladiador(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Guardiao(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Atirador(this.getBd()));
    }

    @Override
    public void acao()
    {

    } 
}
