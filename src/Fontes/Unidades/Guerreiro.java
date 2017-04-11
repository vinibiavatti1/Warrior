package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Guerreiro extends Unidade
{

    public Guerreiro(BancoDeDados bd)
    {
        super(4, "Guerreiro", 3, 30, 0, 20, 10, bd);
    }

}
