package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Aviao extends Unidade
{

    public Aviao(BancoDeDados bd)
    {
        super(18, "Avião", 40, 1500, 1400, 1000, 50, bd);
    }

}
