package Fontes.Unidades;

import Fontes.BancoDeDados;

/**
 *
 * @author Vinicius
 */
public class PortaAviao extends Unidade
{

    public PortaAviao(BancoDeDados bd)
    {
        super(24, "Porta Aviões", 50, 1500, 900, 900, 500, bd);
    }

}
