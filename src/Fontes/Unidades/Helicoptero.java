package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Helicoptero extends Unidade
{

    public Helicoptero(BancoDeDados bd)
    {
        super(22, "Helicoptero", 30, 1400, 300, 500, 800, bd);
    }

}
