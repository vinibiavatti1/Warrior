package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Arqueiro;
import Fontes.Unidades.Besta;
import Fontes.Unidades.Catapulta;
import Fontes.Unidades.Guerreiro;
import Fontes.Unidades.HomemClava;
import Fontes.Unidades.Lanceiro;
import Fontes.Unidades.Soldado;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Quartel extends Construcao
{

    public Quartel(BancoDeDados bd)
    {
        super(bd, 8, "Quartel", "Habilita a criação de guerreiros", 4000, 4000, 4000, 4000);
    }

    @Override
    public void construir()
    {
        if(this.getBd().getConstrucao(this.getId()) != null)
        {
            return;
        }
        this.getBd().getListaCatalogoConstrucao().add(new Torre(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Armadilha(this.getBd()));
        this.getBd().getListaCatalogoConstrucao().add(new Doca(this.getBd())); 
        
        this.getBd().getListaCatalogoUnidade().add(new HomemClava(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Arqueiro(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Lanceiro(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Guerreiro(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Catapulta(this.getBd()));
        this.getBd().getListaCatalogoUnidade().add(new Besta(this.getBd()));
    }

    @Override
    public void acao()
    {
        
    }
}
