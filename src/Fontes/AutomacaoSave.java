package Fontes;

import Janelas.JanelaPrincipal;
import Outros.Msg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author vinicius.reif
 */
public class AutomacaoSave implements Runnable
{
    private JanelaPrincipal jp;
    private BancoDeDados bd;
    private boolean loop = true;
    
    public AutomacaoSave(JanelaPrincipal jp, BancoDeDados bd)
    {
        this.jp = jp;
        this.bd = bd;
        new Thread(this).start();
    }
    
    @Override
    public void run()
    {
        this.jp.txtSaidaSave.setText("Iniciado processo automatico de salvamento\n" + this.jp.txtSaidaSave.getText());
        while(loop)
        {
            try
            {
                File f = new File(jp.txtdir.getText());
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
                os.writeObject(this.bd);
                os.flush();
                os.close();
                this.jp.txtSaidaSave.setText(new Date() + " Jogo salvo com sucesso!\n" + this.jp.txtSaidaSave.getText());
                
                Thread.sleep(((int)(jp.spTempoSave.getValue()) * 1000));
            } 
            catch (InterruptedException ex)
            {
                Msg.erro("Erro ao automatizar salvamento\n" + ex);
                this.jp.pararSave();
            }
            catch (IOException ex)
            {
                Msg.erro("Erro ao salvar jogo\n" + ex);
                this.jp.pararSave();
            }
        }
        this.jp.txtSaidaSave.setText("Processo de salvamento encerrado!\n" + this.jp.txtSaidaSave.getText());
    }

    public void parar()
    {
        this.loop = false;
    }
}
