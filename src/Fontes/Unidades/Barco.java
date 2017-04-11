package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Barco extends Unidade
{

    public Barco(BancoDeDados bd)
    {
        super(10, "Barco", 15, 0, 600, 200, 0, bd);
    }

}
