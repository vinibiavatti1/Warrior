package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Guardiao extends Unidade
{

    public Guardiao(BancoDeDados bd)
    {
        super(5, "Guardião", 3, 5, 50, 50, 50, bd);
    }

}
