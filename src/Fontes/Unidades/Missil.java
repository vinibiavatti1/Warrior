package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Missil extends Unidade
{

    public Missil(BancoDeDados bd)
    {
        super(27, "Missil", 500, 5000, 5000, 5000, 5000, bd);
    }

}
