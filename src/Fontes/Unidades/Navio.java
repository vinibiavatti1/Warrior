package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Navio extends Unidade
{

    public Navio(BancoDeDados bd)
    {
        super(11, "Navio", 25, 0, 800, 800, 0, bd);
    }

}
