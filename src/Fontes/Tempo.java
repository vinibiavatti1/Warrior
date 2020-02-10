package Fontes;

import Fontes.Construcoes.Construcao;
import Fontes.Unidades.Unidade;
import Janelas.JanelaPrincipal;
import Outros.Msg;
import java.io.IOException;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius.reif
 */
public class Tempo implements Runnable
{
    private boolean loop = true;
    private int delay = 1000;
    
    private JanelaPrincipal jp;
    private BancoDeDados bd;
    private Lan lan;
    
    public Tempo(BancoDeDados bd, JanelaPrincipal jp)
    {
        this.bd = bd;
        this.jp = jp;
        this.lan = new Lan(bd);
        new Thread(this).start();
    }

    @Override
    public void run()
    {
        while(this.loop)
        {
            try
            {
                Thread.sleep(this.delay);
                this.bd.chamarAcaoContrucoes();
                
                //Campos
                this.setCampos();
                
                //Produção
                this.setPgRecursos();
                
                //Mercado
                this.mercado();
                
                //Mensagens
                this.lerMensagens();
                
                //Explorador
                this.explorador();
                
                //Ataque
                this.ataque();
                
                // Memory
                this.jp.calcMemory();
            } 
            catch (InterruptedException ex)
            {
                Msg.erro("Erro no processamento do tempo do jogo\n" + ex);
            }
        }
    }
    
    public void explorador()
    {
        try
        {
            String txt = lan.lerArquivo("explorador.txt");
            if(txt.equals(""))
            {
                return;
            }
            txt= txt.split("\n")[0];
            lan.limparArquivo(this.bd.getNome(), "explorador.txt");
            
            String msg = "RESULTADO DA EXPLORAÇÃO\nCidade: " + this.bd.getNome() + "\n\n";
            msg += "CONSTRUÇÕES:\n";
            for (Map.Entry<Integer, Integer> entry : this.bd.getListaConstrucao().entrySet()) {
                Integer id = entry.getKey();
                Integer amount = entry.getValue();
                Construcao c = this.bd.getConstrucaoCatalogo(id);
                msg += c.getNome() + " (" + amount + ")\n";
            }
            msg += "\n";
            
            msg += "UNIDADES:\n";
            for (Map.Entry<Integer, Integer> entry : this.bd.getListaUnidade().entrySet()) {
                Integer id = entry.getKey();
                Integer amount = entry.getValue();
                Unidade u = this.bd.getUnidadeCatalogo(id);
                msg += u.getNome() + " (" + amount + ")\n";
            }
            msg += "\n";
            
            msg += "RECURSOS:\n";
            msg += "Ouro: " + this.bd.getOuro() + "\n";
            msg += "Madeira: " + this.bd.getMadeira()+ "\n";
            msg += "Pedra: " + this.bd.getPedra()+ "\n";
            msg += "Comida: " + this.bd.getComida()+ "\n";
            msg += "Armazém: " + this.bd.getArmazem()+ "\n";
            msg += "Força: " + this.bd.getForca()+ "\n";
            msg += "Defesa: " + this.bd.getDefesa()+ "\n";
            msg += "Vida: " + this.bd.getVida()+ "\n";
            msg += "\n";
            
            msg += "ESTRUTURAS DE PRODUÇÃO DE:\n";
            msg += "Ouro: " + (bd.getQtdConstrucao(1) + bd.getQtdConstrucao(16) + bd.getQtdConstrucao(17)) + "\n";
            msg += "Madeira: " + (bd.getQtdConstrucao(2) + bd.getQtdConstrucao(24)) + "\n";
            msg += "Pedra: " + (bd.getQtdConstrucao(3)) + "\n";
            msg += "Comida: " + (bd.getQtdConstrucao(4) + bd.getQtdConstrucao(7) + bd.getQtdConstrucao(26) + bd.getQtdConstrucao(13)) + "\n";
            msg += "\n";
            
            msg += "EXPLORADORES:\n";
            msg += "Quantidade: " + this.bd.getExploradores();
            msg += "\n";

            lan.passarMensagem(txt, msg);
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao ler arquivo explorador.txt\n" + ex);
        }
        
    }
    
    public void lerMensagens()
    {
        try
        {
            String txt = lan.lerArquivo("mensagem.txt");
            if(txt.equals(""))
            {
                return;
            }
            lan.limparArquivo(this.bd.getNome(), "mensagem.txt");
            DefaultTableModel dtm = (DefaultTableModel) this.jp.msgTabela.getModel();
            dtm.addRow(new Object[]{txt});
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao ler arquivo de mensagens\n" + ex);
        }
    }
    
    private void setCampos()
    {
        jp.txtOuro.setText(bd.getOuro() + "");
        jp.txtMadeira.setText(bd.getMadeira() + "");
        jp.txtPedra.setText(bd.getPedra() + "");
        jp.txtComida.setText(bd.getComida() + "");
        jp.txtForca.setText(bd.getForca() + "");
        jp.txtDefesa.setText(bd.getDefesa()+ "");
        jp.txtArmazem.setText(bd.getArmazem() + "");
        
        jp.txtPOuro.setText((bd.getQtdConstrucao(1) + bd.getQtdConstrucao(16) + bd.getQtdConstrucao(17)) + "");
        jp.txtPMadeira.setText((bd.getQtdConstrucao(2) + bd.getQtdConstrucao(24)) + "");
        jp.txtPPedra.setText(bd.getQtdConstrucao(3) + "");
        jp.txtPComida.setText((bd.getQtdConstrucao(4) + bd.getQtdConstrucao(7) + bd.getQtdConstrucao(26) + bd.getQtdConstrucao(13)) + "");
        
        jp.pgVida.setValue(bd.getVida());
        
        jp.pgVida.setToolTipText(this.bd.getVida() + "/" + this.bd.getVidaMax());
    }
    
    private void setPgRecursos()
    { 
        this.jp.pgOuro.setMaximum(bd.getArmazem());
        this.jp.pgMadeira.setMaximum(bd.getArmazem());
        this.jp.pgPedra.setMaximum(bd.getArmazem());
        this.jp.pgComida.setMaximum(bd.getArmazem());
        this.jp.pgOuro.setValue(bd.getOuro());
        this.jp.pgMadeira.setValue(bd.getMadeira());
        this.jp.pgPedra.setValue(bd.getPedra());
        this.jp.pgComida.setValue(bd.getComida());
    }
    
    public void mercado() 
    {
        try
        {
            String txt = lan.lerArquivo("mercado.txt");
            if(txt.equals(""))
            {
                return;
            }
            lan.limparArquivo(this.bd.getNome(), "mercado.txt");
            String[] array = txt.split("\n");
            if(array[0].equals("Ouro"))
            {
                this.bd.addOuro(Integer.parseInt(array[1]));
            }
            else if(array[0].equals("Madeira"))
            {
                this.bd.addMadeira(Integer.parseInt(array[1]));
            }
            else if(array[0].equals("Pedra"))
            {
                this.bd.addPedra(Integer.parseInt(array[1]));
            }
            else
            {
                this.bd.addComida(Integer.parseInt(array[1]));
            }
            Msg.informacao("Você recebeu " + array[1] + " de " + array[0]);
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao ler arquivo mercado.txt\n" + ex);
        }
    }
 
    public void ataque()
    {
        try
        {
            String txt = lan.lerArquivo("ataque.txt");
            if(txt.equals(""))
            {
                return;
            }
            lan.limparArquivo(this.bd.getNome(), "ataque.txt");
            String[] array = txt.split("\n");
            Msg.aviso("Ataque!\n" + array[0] + " atacou você com força: " + array[1]);
            if(this.bd.getDefesa() >= Integer.parseInt(array[1]))
            {
                Msg.informacao("Sua defesa venceu esta batalha!");
                lan.passarMensagem(array[0], "Você perdeu a batalha contra " + this.bd.getNome());
                return;
            }
            int diferenca = Integer.parseInt(array[1]) - this.bd.getDefesa();
            this.bd.setVida(this.bd.getVida() - diferenca);
            if(this.bd.getVida() <= 0)
            {
                Msg.aviso("Você perdeu esta batalha e foi derrotado!");
                lan.passarMensagem(array[0], "O jogador " + this.bd.getNome() + " está derrotado!");
                System.exit(0);
            }
            Msg.informacao("Você perdeu esta batalha e teve um dano de " + diferenca + " de vida");
            lan.passarMensagem(array[0], "Você venceu a batalha contra " + this.bd.getNome());
        }
        catch (IOException ex)
        {
            Msg.erro("Erro ao ler arquivo ataque.txt\n" + ex);
        }
    }
    
    //Parar Loop
    public void parar()
    {
        this.loop = false;
    }
}
