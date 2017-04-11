package Fontes;

import Outros.Msg;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class Lan implements Serializable
{
    private BancoDeDados bd;
    
    public Lan(BancoDeDados bd)
    {
        this.bd = bd;
    }
    
    public void passarMensagem(String jogador, String txt)
    {
        try
        {
            this.escreverArquivo(jogador, "mensagem.txt", "De: " + this.bd.getNome() + "\n" + txt);
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao passar mensagem\n" + ex);
        }
    }
    
    public void limparArquivo(String jogador, String nomeArq) throws FileNotFoundException
    {
        File f = new File(bd.getDir() + "/" + jogador + "/" + nomeArq);
        PrintWriter pw = new PrintWriter(f);
        pw.write("");
        pw.flush();
        pw.close();
    }
    
    public String lerArquivo(String nomeArq) throws FileNotFoundException, IOException
    {
        File f = new File(bd.getDirCompleto() + "/" + nomeArq);
        if(!f.exists())
        {
            f.createNewFile();
        }
        Scanner s = new Scanner(f);
        String conteudo = "";
        while(s.hasNext())
        {
            conteudo += s.nextLine() + "\n";
        }
        s.close();
        return conteudo;
    }
    
    public void escreverArquivo(String jogador, String nomeArq, String txt) throws IOException
    {
        File f = new File(bd.getDir() + "/" + jogador + "/" + nomeArq);
        if(!f.exists())
        {
            f.createNewFile();
        }
        PrintWriter pw = new PrintWriter(f);
        pw.write(txt);
        pw.flush();
        pw.close();
    }
}
