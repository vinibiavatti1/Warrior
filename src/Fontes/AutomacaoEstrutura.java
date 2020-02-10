package Fontes;

import Janelas.JanelaPrincipal;
import Outros.Msg;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vinicius.reif
 */
public class AutomacaoEstrutura extends Automacao
{
    private JanelaPrincipal jp;
    private BancoDeDados bd;
    private int idEstrutura;
    private boolean loop = true;
    
    public AutomacaoEstrutura(JanelaPrincipal jp, BancoDeDados bd, int idEstrutura)
    {
        this.jp = jp;
        this.bd = bd;
        this.idEstrutura = idEstrutura;
        new Thread(this).start();
    }
    
    @Override
    public void run()
    {
        if(this.jp.isLogHabilitado()) {
            jp.txtSaida.setText("Automação da estrutura " + this.bd.getConstrucaoCatalogo(idEstrutura).getNome() + " iniciada!\n" + jp.txtSaida.getText());
        }
        while(loop)
        {
            try
            {
                if(bd.construir(idEstrutura))
                {
                    if(this.jp.isLogHabilitado()) {
                        jp.txtSaida.setText(makeLogText("Estrutura " + this.bd.getConstrucaoCatalogo(idEstrutura).getNome() + " criada!\n" + jp.txtSaida.getText()));
                    }
                }
                else
                {
                    if(this.jp.isLogHabilitado()) {
                        jp.txtSaida.setText(makeLogText("Estrutura " + this.bd.getConstrucaoCatalogo(idEstrutura).getNome() + " não criada. Recursos insuficientes!\n" + jp.txtSaida.getText()));
                    }
                }
                
                Thread.sleep(((int)(jp.spTempo.getValue()) * 1000));
            } 
            catch (InterruptedException ex)
            {
                Msg.erro("Erro ao automatizar Estrutura\n" + ex);
            }
        }
        if(this.jp.isLogHabilitado()) {
            jp.txtSaida.setText("Automação da estrutura " + this.bd.getConstrucaoCatalogo(idEstrutura).getNome() + " encerrada!\n" + jp.txtSaida.getText());
        }
    }

    public void parar()
    {
        this.loop = false;
    }
}
