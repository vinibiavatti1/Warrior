package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Planador extends Unidade
{

    public Planador(BancoDeDados bd)
    {
        super(19, "Planador", 32, 1000, 800, 800, 50, bd);
    }

}
