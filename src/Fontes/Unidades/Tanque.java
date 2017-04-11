package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Tanque extends Unidade
{

    public Tanque(BancoDeDados bd)
    {
        super(21, "Tanque", 28, 700, 700, 500, 100, bd);
    }

}
