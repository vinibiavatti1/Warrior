package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Cavaleiro extends Unidade
{

    public Cavaleiro(BancoDeDados bd)
    {
        super(28, "Cavaleiro", 6, 20, 50, 15, 100, bd);
    }

}
