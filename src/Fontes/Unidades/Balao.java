package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Balao extends Unidade
{

    public Balao(BancoDeDados bd)
    {
        super(14, "Balão", 16, 100, 300, 100, 750, bd);
    }

}
