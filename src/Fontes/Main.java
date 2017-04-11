package Fontes;

import Janelas.Intro;
import Janelas.JanelaPrincipal;
import Outros.Msg;
import javax.swing.UIManager;

/**
 *
 * @author vinicius.reif
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception ex)
        {
            Msg.erroFatal("Erro ao definir tema\n" + ex);
        }

        new Intro().setVisible(true);
    }
}
