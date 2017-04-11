package Fontes.Construcoes;

import Fontes.BancoDeDados;

/**
 *
 * @author vinicius.reif
 */
public class Torre extends Construcao
{

    public Torre(BancoDeDados bd)
    {
        super(bd, 10, "Torre", "Aumenta a defesa +3", 100, 300, 300, 0);
    }

    @Override
    public void construir()
    {
        this.getBd().addDefesa(3);
    }

    @Override
    public void acao()
    {
        
    }
}
