package Fontes.Construcoes;

import Fontes.BancoDeDados;
import Fontes.Unidades.Explorador;
import Fontes.Unidades.Soldado;
import Outros.Msg;
import java.util.Random;

/**
 *
 * @author vinicius.reif
 */
public class Academia extends Construcao
{

    public Academia(BancoDeDados bd)
    {
        super(bd, 23, "Academia", "Habilita criação de Exploradores", 15000, 12000, 12000, 12000);
    }

    @Override
    public void construir()
    {

    }

    @Override
    public void acao()
    {

    } 
}
