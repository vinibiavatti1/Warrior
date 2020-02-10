package Janelas;

import Fontes.BancoDeDados;
import Fontes.Lan;
import Fontes.Sistema;
import Outros.Msg;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author vinicius.reif
 */
public class Intro extends javax.swing.JFrame
{

    public Intro()
    {
        initComponents();
        
        readDefaultServerFile();
        readDefaultLifeFile();
    }
    
    private void readDefaultServerFile() {
        File f = new File("ServidorPadrao.txt");
        try
        {
            if(!f.exists())
            {
                f.createNewFile();
            }
            Scanner s = new Scanner(f);
            String txt = "";
            while(s.hasNext())
            {
                txt += s.nextLine();
            }
            if(!txt.equals(""))
            {
                this.txtDir.setText(txt);
                this.txtDir.setEditable(false);
                this.btPesqDir.setEnabled(false);
            }
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao criar arquivo servidorPadrao.txt\n" + ex);
        }
    }
    
    private void readDefaultLifeFile() {
        File f = new File("VidaPadrao.txt");
        try
        {
            if(!f.exists())
            {
                f.createNewFile();
            }
            Scanner s = new Scanner(f);
            String txt = "";
            while(s.hasNext())
            {
                txt += s.nextLine();
            }
            if(!txt.equals(""))
            {
                this.txtVida.setValue(Integer.parseInt(txt));
                this.txtVida.setEnabled(false);
            }
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao criar arquivo vidaPadrao.txt\n" + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        btPesqDir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtVida = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCarregar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Sistema.TITULO + " " + Sistema.VERSAO);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(Sistema.TITULO + " " + Sistema.VERSAO);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nome Cidade:");

        jLabel3.setText("Diretório Compartilhado:");

        btPesqDir.setBackground(new java.awt.Color(255, 255, 255));
        btPesqDir.setText("...");
        btPesqDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqDirActionPerformed(evt);
            }
        });

        jLabel4.setText("Vida Inicial:");

        txtVida.setModel(new javax.swing.SpinnerNumberModel(10000, 100, 9999999, 1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesqDir))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 302, Short.MAX_VALUE))
                    .addComponent(txtVida)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesqDir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Novo", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("Carregar:");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Carregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCarregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 372, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(110, 110, 110)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Carregar", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesqDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btPesqDirActionPerformed
    {//GEN-HEADEREND:event_btPesqDirActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            this.txtDir.setText(jfc.getSelectedFile() + "");
        }
    }//GEN-LAST:event_btPesqDirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        try
        {
            if(this.txtDir.getText().equals(""))
            {
                Msg.informacao("Informe um Diretório");
                return;
            }
            if(this.txtNome.getText().equals(""))
            {
                Msg.informacao("Informe um nome para a Cidade");
                return;
            }
            String dir = this.txtDir.getText();
            String nome = this.txtNome.getText();
            File f = new File(dir);
            if(!f.exists())
            {
                Msg.erro("Diretório especificado não é válido, não existe ou não possui acesso permitido");
                return;
            }
            File[] arquivosDir = f.listFiles();
            for(File fl : arquivosDir)
            {
                if(fl.getName().equals(nome))
                {
                    Msg.informacao("Já existe este nome de cidade neste diretório");
                    return;
                }
            }
            f = new File(dir + "/" + nome);
            f.mkdir();
            String dirCompleto = dir + "/" + nome;

            //Criar arquivos
            this.criarArquivos(dirCompleto);
            
            //Iniciar
            new JanelaPrincipal(new BancoDeDados(dir, nome, (int)this.txtVida.getValue())).setVisible(true);
            this.dispose();
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao iniciar novo jogo\n" + ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("Dados Salvos Warrior", "dat"));
        if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            this.txtCarregar.setText(jfc.getSelectedFile() + "");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        File f = new File(this.txtCarregar.getText());
        if(!f.exists())
        {
            Msg.erro("Arquivo especificado não existe");
            return;
        }
        try
        {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(f));
            BancoDeDados bd = (BancoDeDados) is.readObject();
            new JanelaPrincipal(bd).setVisible(true);
            this.dispose();
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao carregar jogo\n" + ex);
        } 
        catch (ClassNotFoundException ex)
        {
            Msg.erro("Erro ao carregar jogo\n" + ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void criarArquivos(String dirCompleto) throws IOException
    {
        File f = new File(dirCompleto + "/mercado.txt");
        f.createNewFile();
        f = new File(dirCompleto + "/ataque.txt");
        f.createNewFile();
        f = new File(dirCompleto + "/mensagem.txt");
        f.createNewFile();
        f = new File(dirCompleto + "/explorador.txt");
        f.createNewFile();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesqDir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCarregar;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtVida;
    // End of variables declaration//GEN-END:variables
}
