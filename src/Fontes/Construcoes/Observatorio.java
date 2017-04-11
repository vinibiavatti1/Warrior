package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Observatorio extends Construcao
{

    public Observatorio(BancoDeDados bd)
    {
        super(bd, 22, "Observatorio", "Aumenta a defesa +45", 1000, 500, 500, 0);
    }

    @Override
    public void construir()
    {
        this.getBd().addDefesa(45);
    }

    @Override
    public void acao()
    {
        
    }
}
