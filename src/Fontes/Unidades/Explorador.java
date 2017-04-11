package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Explorador extends Unidade
{

    public Explorador(BancoDeDados bd)
    {
        super(20, "Explorador", 0, 10000, 10000, 10000, 10000, bd);
    }

}
