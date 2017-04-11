package Outros;

import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.reif
 */
public class Msg 
{
    public static void erro(String txt)
    {
        JOptionPane.showMessageDialog(null, txt, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void erroFatal(String txt)
    {
        JOptionPane.showMessageDialog(null, txt, "Erro FATAL", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
    
    public static void informacao(String txt)
    {
        JOptionPane.showMessageDialog(null, txt, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void aviso(String txt)
    {
        JOptionPane.showMessageDialog(null, txt, "Aviso!", JOptionPane.WARNING_MESSAGE);
    }
}
