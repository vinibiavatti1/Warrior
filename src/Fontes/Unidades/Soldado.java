package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Soldado extends Unidade
{

    public Soldado(BancoDeDados bd)
    {
        super(15, "Soldado", 7, 120, 0, 0, 30, bd);
    }

}
