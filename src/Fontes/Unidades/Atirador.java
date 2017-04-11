package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Atirador extends Unidade
{

    public Atirador(BancoDeDados bd)
    {
        super(6, "Atirador", 4, 50, 50, 0, 35, bd);
    }

}
