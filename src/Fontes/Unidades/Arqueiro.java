package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Arqueiro extends Unidade
{

    public Arqueiro(BancoDeDados bd)
    {
        super(2, "Arqueiro", 2, 15, 5, 0, 15, bd);
    }

}
