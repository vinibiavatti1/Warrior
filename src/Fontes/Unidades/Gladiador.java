package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class Gladiador extends Unidade
{

    public Gladiador(BancoDeDados bd)
    {
        super(12, "Gladiador", 5, 50, 0, 60, 20, bd);
    }

}
