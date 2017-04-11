package Fontes;

import Janelas.JanelaPrincipal;
import Outros.Msg;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius.reif
 */
public class AutomacaoUnidade implements Runnable
{
    private JanelaPrincipal jp;
    private BancoDeDados bd;
    private int idUnidade;
    private boolean loop = true;
    
    public AutomacaoUnidade(JanelaPrincipal jp, BancoDeDados bd, int idUnidade)
    {
        this.jp = jp;
        this.bd = bd;
        this.idUnidade = idUnidade;
        new Thread(this).start();
    }
    
    @Override
    public void run()
    {
        jp.txtSaida.setText("Automação da unidade " + this.bd.getUnidadeCatalogo(idUnidade).getNome() + " iniciada!\n" + jp.txtSaida.getText());
        while(loop)
        {
            try
            {
                if(bd.criar(idUnidade))
                {
                    jp.txtSaida.setText("Unidade " + this.bd.getUnidadeCatalogo(idUnidade).getNome() + " criada!\n" + jp.txtSaida.getText());
                }
                else
                {
                    jp.txtSaida.setText("Unidade " + this.bd.getUnidadeCatalogo(idUnidade).getNome() + " não criada. Recursos insuficientes!\n"  + jp.txtSaida.getText());
                }
                
                Thread.sleep(((int)(jp.spTempo.getValue()) * 1000));
            } 
            catch (InterruptedException ex)
            {
                Msg.erro("Erro ao automatizar Unidade\n" + ex);
            }
        }
        jp.txtSaida.setText("Automação da unidade " + this.bd.getUnidadeCatalogo(idUnidade).getNome() + " encerrada!\n" + jp.txtSaida.getText());
    }
    
    public void parar()
    {
        this.loop = false;
    }
}
