package Janelas;

import Fontes.AutomacaoEstrutura;
import Fontes.AutomacaoSave;
import Fontes.AutomacaoUnidade;
import Fontes.BancoDeDados;
import Fontes.Construcoes.Construcao;
import Fontes.Lan;
import Fontes.Sistema;
import Fontes.Tempo;
import Fontes.Unidades.Explorador;
import Fontes.Unidades.Unidade;
import Outros.Msg;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinicius.reif
 */
public class JanelaPrincipal extends javax.swing.JFrame
{
    private BancoDeDados bd;
    private Lan lan;
    
    private AutomacaoEstrutura ae1;
    private AutomacaoEstrutura ae2;
    private AutomacaoEstrutura ae3;
    private AutomacaoEstrutura ae4;
    private AutomacaoUnidade au5;
    private AutomacaoUnidade au6;
    private AutomacaoUnidade au7;
    private AutomacaoUnidade au8;
    
    private AutomacaoSave as;
   
    public JanelaPrincipal(BancoDeDados bd)
    {
        this.bd = bd;
        this.lan = new Lan(bd);
        initComponents();
        new Tempo(this.bd, this);
        this.preencherTabelas();
        this.setTitle(Sistema.TITULO + " " + Sistema.VERSAO + " - " + this.bd.getNome());
        this.txtOuroExp.setText(new Explorador(this.bd).getOuro() + "");
        this.txtMadeiraExp.setText(new Explorador(this.bd).getMadeira()+ "");
        this.txtPedraExp.setText(new Explorador(this.bd).getPedra()+ "");
        this.txtComidaExp.setText(new Explorador(this.bd).getComida()+ "");
        this.pgVida.setMaximum(this.bd.getVidaMax());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConstrucao = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUnidadeCriar = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbContrucao = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbUnidade = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaJogadores2 = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        msgTabela = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtRecebida = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtEnviar = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbAtaque = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtForcaTotal = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaJogadores3 = new javax.swing.JList();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        pgOuro = new javax.swing.JProgressBar();
        pgMadeira = new javax.swing.JProgressBar();
        jLabel25 = new javax.swing.JLabel();
        pgPedra = new javax.swing.JProgressBar();
        jLabel26 = new javax.swing.JLabel();
        pgComida = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtPMadeira = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtPComida = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtPPedra = new javax.swing.JTextField();
        txtPOuro = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        listaJogadores4 = new javax.swing.JList();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tbExploradores = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtOuroExp = new javax.swing.JTextField();
        txtPedraExp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMadeiraExp = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtComidaExp = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbMercado = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        qtdMercado = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaJogadores1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton13 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        cbRecursoInterno = new javax.swing.JComboBox();
        jLabel62 = new javax.swing.JLabel();
        txtCalc = new javax.swing.JTextField();
        txtCalc1 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        spTempo = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        spId1 = new javax.swing.JSpinner();
        btParar1 = new javax.swing.JButton();
        btIniciar1 = new javax.swing.JButton();
        pg1 = new javax.swing.JProgressBar();
        btParar2 = new javax.swing.JButton();
        btIniciar2 = new javax.swing.JButton();
        pg2 = new javax.swing.JProgressBar();
        jLabel43 = new javax.swing.JLabel();
        spId2 = new javax.swing.JSpinner();
        btParar3 = new javax.swing.JButton();
        btIniciar3 = new javax.swing.JButton();
        pg3 = new javax.swing.JProgressBar();
        jLabel44 = new javax.swing.JLabel();
        spId3 = new javax.swing.JSpinner();
        btParar4 = new javax.swing.JButton();
        btIniciar4 = new javax.swing.JButton();
        pg4 = new javax.swing.JProgressBar();
        jLabel45 = new javax.swing.JLabel();
        spId4 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        spId5 = new javax.swing.JSpinner();
        btParar5 = new javax.swing.JButton();
        btIniciar5 = new javax.swing.JButton();
        pg5 = new javax.swing.JProgressBar();
        jLabel48 = new javax.swing.JLabel();
        spId6 = new javax.swing.JSpinner();
        btParar6 = new javax.swing.JButton();
        btIniciar6 = new javax.swing.JButton();
        pg6 = new javax.swing.JProgressBar();
        jLabel49 = new javax.swing.JLabel();
        spId7 = new javax.swing.JSpinner();
        btParar7 = new javax.swing.JButton();
        btIniciar7 = new javax.swing.JButton();
        pg7 = new javax.swing.JProgressBar();
        jLabel50 = new javax.swing.JLabel();
        spId8 = new javax.swing.JSpinner();
        btParar8 = new javax.swing.JButton();
        btIniciar8 = new javax.swing.JButton();
        pg8 = new javax.swing.JProgressBar();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtSaida = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        txtdir = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        btIniciarSave = new javax.swing.JButton();
        btPararSave = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        spTempoSave = new javax.swing.JSpinner();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtSaidaSave = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtOuro = new javax.swing.JTextField();
        txtPedra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMadeira = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtComida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtArmazem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pgVida = new javax.swing.JProgressBar();
        txtForca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDefesa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Sistema.TITULO + " " + Sistema.VERSAO);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabelaConstrucao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nome", "Descrição", "Ouro", "Madeira", "Pedra", "Comida"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tabelaConstrucao.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tabelaConstrucao);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Construir");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Construções", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tbUnidadeCriar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nome", "Força", "Ouro", "Madeira", "Pedra", "Comida"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbUnidadeCriar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(tbUnidadeCriar);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Criar");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Unidades", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("Construções");

        tbContrucao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Construção", "Descrição"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbContrucao);

        tbUnidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Unidade", "Força"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbUnidade);

        jLabel16.setText("Exércitos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cidade", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane6.setViewportView(listaJogadores2);

        jLabel17.setText("Jogador");

        msgTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Mensagem"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        msgTabela.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                msgTabelaMouseReleased(evt);
            }
        });
        jScrollPane7.setViewportView(msgTabela);

        jLabel18.setText("Mensagens Recebidas");

        txtRecebida.setEditable(false);
        txtRecebida.setBackground(new java.awt.Color(249, 249, 249));
        txtRecebida.setColumns(20);
        txtRecebida.setLineWrap(true);
        txtRecebida.setRows(5);
        jScrollPane8.setViewportView(txtRecebida);

        jLabel19.setText("Mensagem Recebida");

        jLabel20.setText("Nova Mensagem");

        txtEnviar.setColumns(20);
        txtEnviar.setLineWrap(true);
        txtEnviar.setRows(5);
        jScrollPane9.setViewportView(txtEnviar);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Enviar");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Atualizar");
        jButton7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton7ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Apagar");
        jButton14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel17)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mensagens", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setText("Jogador");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Atacar!");
        jButton5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }
        });

        tbAtaque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Unidade", "Força"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tbAtaque);

        jLabel22.setText("Tropas");

        jLabel23.setText("Força total:");

        txtForcaTotal.setEditable(false);
        txtForcaTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtForcaTotal.setText("0");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Atualizar");
        jButton8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton8ActionPerformed(evt);
            }
        });

        jScrollPane12.setViewportView(listaJogadores3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtForcaTotal))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel23)
                    .addComponent(txtForcaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ataque", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setText("Ouro");

        pgOuro.setForeground(new java.awt.Color(255, 255, 153));
        pgOuro.setStringPainted(true);

        pgMadeira.setForeground(new java.awt.Color(153, 255, 153));
        pgMadeira.setStringPainted(true);

        jLabel25.setText("Madeira");

        pgPedra.setForeground(new java.awt.Color(102, 204, 255));
        pgPedra.setStringPainted(true);

        jLabel26.setText("Pedra");

        pgComida.setForeground(new java.awt.Color(255, 153, 153));
        pgComida.setStringPainted(true);

        jLabel27.setText("Comida");

        jLabel28.setText("Armazém max");

        txtPMadeira.setEditable(false);
        txtPMadeira.setBackground(new java.awt.Color(255, 255, 255));

        jLabel33.setText("Pedra:");

        txtPComida.setEditable(false);
        txtPComida.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setText("Madeira:");

        txtPPedra.setEditable(false);
        txtPPedra.setBackground(new java.awt.Color(255, 255, 255));

        txtPOuro.setEditable(false);
        txtPOuro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setText("Quantidade de estruturas de produção de:");

        jLabel36.setText("Comida:");

        jLabel37.setText("Ouro:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(txtPMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(txtPPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(txtPComida, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pgOuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pgMadeira, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                            .addComponent(pgPedra, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                            .addComponent(pgComida, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel35))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgComida, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPOuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPPedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produção", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane13.setViewportView(listaJogadores4);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Atualizar");
        jButton9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Explorar!");
        jButton10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel29.setText("Jogador");

        jLabel11.setText("Exploradores");

        tbExploradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Quantidade de Exploradores"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(tbExploradores);

        jLabel12.setText("Ouro:");

        txtOuroExp.setEditable(false);
        txtOuroExp.setBackground(new java.awt.Color(255, 255, 255));

        txtPedraExp.setEditable(false);
        txtPedraExp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Pedra:");

        txtMadeiraExp.setEditable(false);
        txtMadeiraExp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setText("Madeira:");

        txtComidaExp.setEditable(false);
        txtComidaExp.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setText("Comida:");

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Criar");
        jButton12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOuroExp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMadeiraExp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPedraExp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtComidaExp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10)
                        .addComponent(jButton12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOuroExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel30)
                        .addComponent(txtMadeiraExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtPedraExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(txtComidaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Exploração", jPanel9);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Recurso");

        cbMercado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ouro", "Madeira", "Pedra", "Comida" }));

        jLabel10.setText("Quantidade");

        qtdMercado.setModel(new javax.swing.SpinnerNumberModel(10, 1, 9999999, 10));

        jLabel14.setText("Jogador");

        jScrollPane3.setViewportView(listaJogadores1);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Enviar");
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Atualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel56.setText("Comércio Local");

        jLabel57.setText("Comércio Global");

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Comprar");
        jButton13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel60.setText("Comprar ");

        jLabel61.setText("Recurso");

        cbRecursoInterno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Madeira", "Pedra", "Comida" }));

        jLabel62.setText("Preço em Ouro");

        txtCalc.setEditable(false);
        txtCalc.setText("1000");

        txtCalc1.setEditable(false);
        txtCalc1.setText("100");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRecursoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(cbMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(qtdMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))))
                        .addGap(0, 391, Short.MAX_VALUE))
                    .addComponent(jSeparator5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRecursoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtdMercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(239, 239, 239)
                        .addComponent(jButton6)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mercado", jPanel4);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setText("Criação automatizada de estruturas e unidades");

        spTempo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6000, 1));

        jLabel39.setText("Tempo de espera:");

        jLabel40.setText("Estruturas");

        jLabel41.setText("Estrutura (ID):");

        jLabel42.setText("segundos");

        btParar1.setBackground(new java.awt.Color(255, 255, 255));
        btParar1.setText("Parar");
        btParar1.setEnabled(false);
        btParar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar1ActionPerformed(evt);
            }
        });

        btIniciar1.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar1.setText("Iniciar");
        btIniciar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar1ActionPerformed(evt);
            }
        });

        btParar2.setBackground(new java.awt.Color(255, 255, 255));
        btParar2.setText("Parar");
        btParar2.setEnabled(false);
        btParar2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar2ActionPerformed(evt);
            }
        });

        btIniciar2.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar2.setText("Iniciar");
        btIniciar2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar2ActionPerformed(evt);
            }
        });

        jLabel43.setText("Estrutura (ID):");

        btParar3.setBackground(new java.awt.Color(255, 255, 255));
        btParar3.setText("Parar");
        btParar3.setEnabled(false);
        btParar3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar3ActionPerformed(evt);
            }
        });

        btIniciar3.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar3.setText("Iniciar");
        btIniciar3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar3ActionPerformed(evt);
            }
        });

        jLabel44.setText("Estrutura (ID):");

        btParar4.setBackground(new java.awt.Color(255, 255, 255));
        btParar4.setText("Parar");
        btParar4.setEnabled(false);
        btParar4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar4ActionPerformed(evt);
            }
        });

        btIniciar4.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar4.setText("Iniciar");
        btIniciar4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar4ActionPerformed(evt);
            }
        });

        jLabel45.setText("Estrutura (ID):");

        jLabel46.setText("Unidades");

        jLabel47.setText("Unidade (ID):");

        btParar5.setBackground(new java.awt.Color(255, 255, 255));
        btParar5.setText("Parar");
        btParar5.setEnabled(false);
        btParar5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar5ActionPerformed(evt);
            }
        });

        btIniciar5.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar5.setText("Iniciar");
        btIniciar5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar5ActionPerformed(evt);
            }
        });

        jLabel48.setText("Unidade (ID):");

        btParar6.setBackground(new java.awt.Color(255, 255, 255));
        btParar6.setText("Parar");
        btParar6.setEnabled(false);
        btParar6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar6ActionPerformed(evt);
            }
        });

        btIniciar6.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar6.setText("Iniciar");
        btIniciar6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar6ActionPerformed(evt);
            }
        });

        jLabel49.setText("Unidade (ID):");

        btParar7.setBackground(new java.awt.Color(255, 255, 255));
        btParar7.setText("Parar");
        btParar7.setEnabled(false);
        btParar7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar7ActionPerformed(evt);
            }
        });

        btIniciar7.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar7.setText("Iniciar");
        btIniciar7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar7ActionPerformed(evt);
            }
        });

        jLabel50.setText("Unidade (ID):");

        btParar8.setBackground(new java.awt.Color(255, 255, 255));
        btParar8.setText("Parar");
        btParar8.setEnabled(false);
        btParar8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btParar8ActionPerformed(evt);
            }
        });

        btIniciar8.setBackground(new java.awt.Color(255, 255, 255));
        btIniciar8.setText("Iniciar");
        btIniciar8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciar8ActionPerformed(evt);
            }
        });

        txtSaida.setEditable(false);
        txtSaida.setColumns(20);
        txtSaida.setLineWrap(true);
        txtSaida.setRows(5);
        jScrollPane10.setViewportView(txtSaida);

        jLabel51.setText("Informações");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spId8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btParar8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciar8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pg8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel46)
                            .addComponent(jLabel51))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(spTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(spId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar1)
                    .addComponent(btIniciar1)
                    .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(spId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar2)
                    .addComponent(btIniciar2)
                    .addComponent(pg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(spId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar3)
                    .addComponent(btIniciar3)
                    .addComponent(pg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(spId4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar4)
                    .addComponent(btIniciar4)
                    .addComponent(pg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(spId5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar5)
                    .addComponent(btIniciar5)
                    .addComponent(pg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(spId6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar6)
                    .addComponent(btIniciar6)
                    .addComponent(pg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(spId7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar7)
                    .addComponent(btIniciar7)
                    .addComponent(pg7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(spId8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btParar8)
                    .addComponent(btIniciar8)
                    .addComponent(pg8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Automação", jPanel11);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel32.setText("Diretório:");

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("...");
        jButton11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton11ActionPerformed(evt);
            }
        });

        btSave.setBackground(new java.awt.Color(255, 255, 255));
        btSave.setText("Salvar");
        btSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btSaveActionPerformed(evt);
            }
        });

        jLabel52.setText("Salvamento automático:");

        btIniciarSave.setBackground(new java.awt.Color(255, 255, 255));
        btIniciarSave.setText("Iniciar");
        btIniciarSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIniciarSaveActionPerformed(evt);
            }
        });

        btPararSave.setBackground(new java.awt.Color(255, 255, 255));
        btPararSave.setText("Parar");
        btPararSave.setEnabled(false);
        btPararSave.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btPararSaveActionPerformed(evt);
            }
        });

        jLabel53.setText("Tempo de espera:");

        spTempoSave.setModel(new javax.swing.SpinnerNumberModel(60, 1, 600, 1));

        jLabel54.setText("segundos");

        jLabel55.setText("Informações");

        txtSaidaSave.setEditable(false);
        txtSaidaSave.setColumns(20);
        txtSaidaSave.setLineWrap(true);
        txtSaidaSave.setRows(5);
        jScrollPane15.setViewportView(txtSaidaSave);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(txtdir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btIniciarSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPararSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spTempoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                        .addComponent(btSave))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel55))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(jLabel52)
                    .addComponent(btIniciarSave)
                    .addComponent(btPararSave)
                    .addComponent(jLabel53)
                    .addComponent(spTempoSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Salvar", jPanel10);

        jLabel1.setText("Ouro:");

        txtOuro.setEditable(false);
        txtOuro.setBackground(new java.awt.Color(255, 255, 255));

        txtPedra.setEditable(false);
        txtPedra.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Pedra:");

        txtMadeira.setEditable(false);
        txtMadeira.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Madeira:");

        txtComida.setEditable(false);
        txtComida.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Comida:");

        jLabel5.setText("Vida:");

        txtArmazem.setEditable(false);
        txtArmazem.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Armazém:");

        pgVida.setForeground(new java.awt.Color(255, 102, 102));
        pgVida.setMaximum(10000);
        pgVida.setStringPainted(true);

        txtForca.setEditable(false);
        txtForca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Força:");

        txtDefesa.setEditable(false);
        txtDefesa.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Defesa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtOuro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtPedra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtComida, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArmazem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtForca, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(pgVida, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMadeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtArmazem)
                                    .addComponent(pgVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPedra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtForca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDefesa)))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        int linha = this.tabelaConstrucao.getSelectedRow();
        if(linha != -1)
        {
            int id = Integer.parseInt(this.tabelaConstrucao.getValueAt(linha, 0) + "");
            boolean construiu = this.bd.construir(id);
            if(!construiu)
            {
                Construcao c = this.bd.getConstrucaoCatalogo(id);
                new DialogoRecursos(this.bd, c.getOuro(), c.getMadeira(), c.getPedra(), c.getComida()).setVisible(true);
            }
        }
        this.preencherTabelas();
        this.tabelaConstrucao.addRowSelectionInterval(linha, linha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton6ActionPerformed
    {//GEN-HEADEREND:event_jButton6ActionPerformed
        this.atualizarListaJogadores();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton7ActionPerformed
    {//GEN-HEADEREND:event_jButton7ActionPerformed
        this.atualizarListaJogadores();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton8ActionPerformed
    {//GEN-HEADEREND:event_jButton8ActionPerformed
        this.atualizarListaJogadores();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
        try
        {
            if(this.bd.getConstrucao("Mercado") == null)
            {
                Msg.informacao("É necessário possuir um mercado construido para realizar trocas");
                return;
            }
            if(this.listaJogadores1.getSelectedIndex() == -1)
            {
                Msg.informacao("Nenhum jogador selecionado");
                return;
            }
            if((cbMercado.getSelectedItem() + "").equals("Ouro"))
            {
                if(((int)qtdMercado.getValue()) > this.bd.getOuro())
                {
                    Msg.informacao("Você não possui a quantidade de recursos informada");
                    return;
                }
            }
            else if((cbMercado.getSelectedItem() + "").equals("Madeira"))
            {
                if(((int)qtdMercado.getValue()) > this.bd.getMadeira())
                {
                    Msg.informacao("Você não possui a quantidade de recursos informada");
                    return;
                }
            }
            else if((cbMercado.getSelectedItem() + "").equals("Pedra"))
            {
                if(((int)qtdMercado.getValue()) > this.bd.getPedra())
                {
                    Msg.informacao("Você não possui a quantidade de recursos informada");
                    return;
                }
            }
            else
            {
                if(((int)qtdMercado.getValue()) > this.bd.getComida())
                {
                    Msg.informacao("Você não possui a quantidade de recursos informada");
                    return;
                }
            }
            String jogador = this.listaJogadores1.getSelectedValue() + "";
            lan.escreverArquivo(jogador, "mercado.txt", this.cbMercado.getSelectedItem() + "\n" + this.qtdMercado.getValue());
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao escrever no arquivo de mercado do jogador\n" + ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void msgTabelaMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_msgTabelaMouseReleased
    {//GEN-HEADEREND:event_msgTabelaMouseReleased
        if(this.msgTabela.getSelectedRow() != -1)
        {
            String msg = this.msgTabela.getValueAt(this.msgTabela.getSelectedRow(), 0) + "";
            this.txtRecebida.setText(msg);
        }
    }//GEN-LAST:event_msgTabelaMouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        if(this.listaJogadores2.getSelectedIndex() != -1)
        {
            lan.passarMensagem(this.listaJogadores2.getSelectedValue() + "", this.txtEnviar.getText());
            this.txtEnviar.setText("");
        }
        else
        {
            Msg.informacao("Nenhum jogador selecionado");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
        int linha = this.tbUnidadeCriar.getSelectedRow();
        if(linha != -1)
        {
            int id = Integer.parseInt(this.tbUnidadeCriar.getValueAt(linha, 0) + "");
            boolean criou = this.bd.criar(id);
            if(!criou)
            {
                Unidade u = this.bd.getUnidadeCatalogo(id);
                new DialogoRecursos(this.bd, u.getOuro(), u.getMadeira(), u.getPedra(), u.getComida()).setVisible(true);
            }
        }
        this.preencherTabelas();
        this.tbUnidadeCriar.addRowSelectionInterval(linha, linha);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton5ActionPerformed
    {//GEN-HEADEREND:event_jButton5ActionPerformed
        if(this.txtForcaTotal.getText().equals("0") || this.txtForcaTotal.getText().equals(""))
        {
            Msg.informacao("Você não possui nenhuma unidade para efetuar o ataque");
            return;
        }
        if(this.listaJogadores3.getSelectedIndex() == -1)
        {
            Msg.informacao("Nenhum jogador selecionado");
            return;
        }
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja mesmo atacar o oponente " + this.listaJogadores3.getSelectedValue() + " com força " + this.txtForcaTotal.getText() + "?", "Confirmação", JOptionPane.OK_CANCEL_OPTION);
        if(opcao == JOptionPane.CANCEL_OPTION)
        {
            return;
        }
        try
        {
            lan.escreverArquivo(this.listaJogadores3.getSelectedValue() + "", "ataque.txt", this.bd.getNome() + "\n" + this.txtForcaTotal.getText());
            this.bd.limparUnidades();
            this.preencherTabelas();
            this.bd.setForca(0);
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao efetuar ataque\n" + ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton9ActionPerformed
    {//GEN-HEADEREND:event_jButton9ActionPerformed
        this.atualizarListaJogadores();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton10ActionPerformed
    {//GEN-HEADEREND:event_jButton10ActionPerformed
        if(this.bd.getExploradores() == 0)
        {
            Msg.informacao("Você não possui exploradores");
            return;
        }
        if(this.listaJogadores4.getSelectedIndex() == -1)
        {
            Msg.informacao("Selecione um jogador para ser explorado");
            return;
        }
        try
        {
            this.lan.escreverArquivo(this.listaJogadores4.getSelectedValue()+"", "explorador.txt", this.bd.getNome());
            this.bd.setExploradores(this.bd.getExploradores() -1);
            this.preencherTabelas();
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao escrever no arquivo explorador.txt\n" + ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    //Explorador
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton12ActionPerformed
    {//GEN-HEADEREND:event_jButton12ActionPerformed
        //23 - Academia
        if(!this.bd.construcaoConstruida(23))
        {
            Msg.informacao("A Academia deve ser construida para possibilitar a criação de exploradores");
            return;
        }
        Explorador e = new Explorador(bd);
        if(!this.bd.compararPrecoUnidade(e))
        {
            new DialogoRecursos(bd, e.getOuro(), e.getMadeira(), e.getPedra(), e.getComida()).setVisible(true);
            return;
        }
        this.bd.setOuro(this.bd.getOuro() - e.getOuro());
        this.bd.setMadeira(this.bd.getMadeira()- e.getMadeira());
        this.bd.setPedra(this.bd.getPedra()- e.getPedra());
        this.bd.setComida(this.bd.getComida()- e.getComida());
        this.bd.setExploradores(this.bd.getExploradores() + 1);
        this.preencherTabelas();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton11ActionPerformed
    {//GEN-HEADEREND:event_jButton11ActionPerformed
        JFileChooser jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("Dados Salvos Warrior", ".dat"));
        if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            this.txtdir.setText(jfc.getSelectedFile() + ".dat");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btSaveActionPerformed
    {//GEN-HEADEREND:event_btSaveActionPerformed
        File f = new File(this.txtdir.getText());
        try
        {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
            os.writeObject(this.bd);
            os.flush();
            os.close();
            Msg.informacao("Jogo salvo com sucesso");
        } 
        catch (IOException ex)
        {
            Msg.erro("Erro ao salvar jogo\n" + ex);
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton14ActionPerformed
    {//GEN-HEADEREND:event_jButton14ActionPerformed
        if(msgTabela.getSelectedRow() != -1)
        {
            DefaultTableModel dtm = (DefaultTableModel) msgTabela.getModel();
            dtm.removeRow(msgTabela.getSelectedRow());
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btIniciar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar1ActionPerformed
    {//GEN-HEADEREND:event_btIniciar1ActionPerformed
        int idEstrutura = (int)this.spId1.getValue();
        if(this.bd.getConstrucaoCatalogo(idEstrutura) == null)
        {
            Msg.informacao("Você não possui esta estrutura disponível no catálogo de construções");
            return;
        }
        this.spId1.setEnabled(false);
        this.btIniciar1.setEnabled(false);
        this.btParar1.setEnabled(true);
        this.pg1.setIndeterminate(true);
        this.ae1 = new AutomacaoEstrutura(this, this.bd, idEstrutura);
    }//GEN-LAST:event_btIniciar1ActionPerformed

    private void btParar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar1ActionPerformed
    {//GEN-HEADEREND:event_btParar1ActionPerformed
        this.ae1.parar();
        this.spId1.setEnabled(true);
        this.btIniciar1.setEnabled(true);
        this.btParar1.setEnabled(false);
        this.pg1.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar1ActionPerformed

    private void btIniciar2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar2ActionPerformed
    {//GEN-HEADEREND:event_btIniciar2ActionPerformed
        int idEstrutura = (int)this.spId2.getValue();
        if(this.bd.getConstrucaoCatalogo(idEstrutura) == null)
        {
            Msg.informacao("Você não possui esta estrutura disponível no catálogo de construções");
            return;
        }
        this.spId2.setEnabled(false);
        this.btIniciar2.setEnabled(false);
        this.btParar2.setEnabled(true);
        this.pg2.setIndeterminate(true);
        this.ae2 = new AutomacaoEstrutura(this, this.bd, idEstrutura);
    }//GEN-LAST:event_btIniciar2ActionPerformed

    private void btIniciar3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar3ActionPerformed
    {//GEN-HEADEREND:event_btIniciar3ActionPerformed
        int idEstrutura = (int)this.spId3.getValue();
        if(this.bd.getConstrucaoCatalogo(idEstrutura) == null)
        {
            Msg.informacao("Você não possui esta estrutura disponível no catálogo de construções");
            return;
        }
        this.spId3.setEnabled(false);
        this.btIniciar3.setEnabled(false);
        this.btParar3.setEnabled(true);
        this.pg3.setIndeterminate(true);
        this.ae3 = new AutomacaoEstrutura(this, this.bd, idEstrutura);
    }//GEN-LAST:event_btIniciar3ActionPerformed

    private void btIniciar4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar4ActionPerformed
    {//GEN-HEADEREND:event_btIniciar4ActionPerformed
        int idEstrutura = (int)this.spId4.getValue();
        if(this.bd.getConstrucaoCatalogo(idEstrutura) == null)
        {
            Msg.informacao("Você não possui esta estrutura disponível no catálogo de construções");
            return;
        }
        this.spId4.setEnabled(false);
        this.btIniciar4.setEnabled(false);
        this.btParar4.setEnabled(true);
        this.pg4.setIndeterminate(true);
        this.ae4 = new AutomacaoEstrutura(this, this.bd, idEstrutura);
    }//GEN-LAST:event_btIniciar4ActionPerformed

    private void btParar2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar2ActionPerformed
    {//GEN-HEADEREND:event_btParar2ActionPerformed
        this.ae2.parar();
        this.spId2.setEnabled(true);
        this.btIniciar2.setEnabled(true);
        this.btParar2.setEnabled(false);
        this.pg2.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar2ActionPerformed

    private void btParar3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar3ActionPerformed
    {//GEN-HEADEREND:event_btParar3ActionPerformed
        this.ae3.parar();
        this.spId3.setEnabled(true);
        this.btIniciar3.setEnabled(true);
        this.btParar3.setEnabled(false);
        this.pg3.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar3ActionPerformed

    private void btParar4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar4ActionPerformed
    {//GEN-HEADEREND:event_btParar4ActionPerformed
        this.ae4.parar();
        this.spId4.setEnabled(true);
        this.btIniciar4.setEnabled(true);
        this.btParar4.setEnabled(false);
        this.pg4.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar4ActionPerformed

    private void btIniciar5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar5ActionPerformed
    {//GEN-HEADEREND:event_btIniciar5ActionPerformed
        int idUnidade = (int)this.spId5.getValue();
        if(this.bd.getUnidadeCatalogo(idUnidade) == null)
        {
            Msg.informacao("Você não possui esta unidade disponível no catálogo de unidades");
            return;
        }
        this.spId5.setEnabled(false);
        this.btIniciar5.setEnabled(false);
        this.btParar5.setEnabled(true);
        this.pg5.setIndeterminate(true);
        this.au5 = new AutomacaoUnidade(this, this.bd, idUnidade);
    }//GEN-LAST:event_btIniciar5ActionPerformed

    private void btParar5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar5ActionPerformed
    {//GEN-HEADEREND:event_btParar5ActionPerformed
        this.au5.parar();
        this.spId5.setEnabled(true);
        this.btIniciar5.setEnabled(true);
        this.btParar5.setEnabled(false);
        this.pg5.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar5ActionPerformed

    private void btIniciar6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar6ActionPerformed
    {//GEN-HEADEREND:event_btIniciar6ActionPerformed
        int idUnidade = (int)this.spId6.getValue();
        if(this.bd.getUnidadeCatalogo(idUnidade) == null)
        {
            Msg.informacao("Você não possui esta unidade disponível no catálogo de unidades");
            return;
        }
        this.spId6.setEnabled(false);
        this.btIniciar6.setEnabled(false);
        this.btParar6.setEnabled(true);
        this.pg6.setIndeterminate(true);
        this.au6 = new AutomacaoUnidade(this, this.bd, idUnidade);
    }//GEN-LAST:event_btIniciar6ActionPerformed

    private void btIniciar7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar7ActionPerformed
    {//GEN-HEADEREND:event_btIniciar7ActionPerformed
        int idUnidade = (int)this.spId7.getValue();
        if(this.bd.getUnidadeCatalogo(idUnidade) == null)
        {
            Msg.informacao("Você não possui esta unidade disponível no catálogo de unidades");
            return;
        }
        this.spId7.setEnabled(false);
        this.btIniciar7.setEnabled(false);
        this.btParar7.setEnabled(true);
        this.pg7.setIndeterminate(true);
        this.au7 = new AutomacaoUnidade(this, this.bd, idUnidade);
    }//GEN-LAST:event_btIniciar7ActionPerformed

    private void btIniciar8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciar8ActionPerformed
    {//GEN-HEADEREND:event_btIniciar8ActionPerformed
        int idUnidade = (int)this.spId8.getValue();
        if(this.bd.getUnidadeCatalogo(idUnidade) == null)
        {
            Msg.informacao("Você não possui esta unidade disponível no catálogo de unidades");
            return;
        }
        this.spId8.setEnabled(false);
        this.btIniciar8.setEnabled(false);
        this.btParar8.setEnabled(true);
        this.pg8.setIndeterminate(true);
        this.au8 = new AutomacaoUnidade(this, this.bd, idUnidade);
    }//GEN-LAST:event_btIniciar8ActionPerformed

    private void btParar6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar6ActionPerformed
    {//GEN-HEADEREND:event_btParar6ActionPerformed
        this.au6.parar();
        this.spId6.setEnabled(true);
        this.btIniciar6.setEnabled(true);
        this.btParar6.setEnabled(false);
        this.pg6.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar6ActionPerformed

    private void btParar7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar7ActionPerformed
    {//GEN-HEADEREND:event_btParar7ActionPerformed
        this.au7.parar();
        this.spId7.setEnabled(true);
        this.btIniciar7.setEnabled(true);
        this.btParar7.setEnabled(false);
        this.pg7.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar7ActionPerformed

    private void btParar8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btParar8ActionPerformed
    {//GEN-HEADEREND:event_btParar8ActionPerformed
        this.au8.parar();
        this.spId8.setEnabled(true);
        this.btIniciar8.setEnabled(true);
        this.btParar8.setEnabled(false);
        this.pg8.setIndeterminate(false);
        this.preencherTabelas();
    }//GEN-LAST:event_btParar8ActionPerformed

    private void btIniciarSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btIniciarSaveActionPerformed
    {//GEN-HEADEREND:event_btIniciarSaveActionPerformed
        this.btIniciarSave.setEnabled(false);
        this.btPararSave.setEnabled(true);
        this.as = new AutomacaoSave(this, bd);
    }//GEN-LAST:event_btIniciarSaveActionPerformed

    private void btPararSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btPararSaveActionPerformed
    {//GEN-HEADEREND:event_btPararSaveActionPerformed
        this.as.parar();
        this.btIniciarSave.setEnabled(true);
        this.btPararSave.setEnabled(false);
    }//GEN-LAST:event_btPararSaveActionPerformed

    //Mercado Interno
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton13ActionPerformed
    {//GEN-HEADEREND:event_jButton13ActionPerformed
        if(this.bd.getConstrucao("Mercado") == null)
        {
            Msg.informacao("É necessário possuir um mercado construido para realizar trocas");
            return;
        }
        if(this.bd.getOuro() >= 1000)
        {
            this.bd.setOuro(this.bd.getOuro() - 1000);
            if((this.cbRecursoInterno.getSelectedItem() + "").equals("Madeira"))
            {
                this.bd.addMadeira(100);
            }
            else if((this.cbRecursoInterno.getSelectedItem() + "").equals("Pedra"))
            {
                this.bd.addPedra(100);
            }
            else
            {
                this.bd.addComida(100);
            }
        }
        else
        {
            Msg.informacao("Ouro insuficiente");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    public void pararSave()
    {
        this.btPararSaveActionPerformed(null);
    }
    
    public void preencherTabelas()
    {
        //Tabela de Construções
        DefaultTableModel modeloTabelaConstrucao = (DefaultTableModel) this.tabelaConstrucao.getModel();
        while(modeloTabelaConstrucao.getRowCount() > 0)
        {
            modeloTabelaConstrucao.removeRow(0);
        }
        for(Construcao c : this.bd.getListaCatalogoConstrucao())
        {
            modeloTabelaConstrucao.addRow(new Object[]{c.getId(), c.getNome(), c.getDesc(), c.getOuro(), c.getMadeira(), c.getPedra(), c.getComida()});
        }
        
        //Tabela de Construções Criadas
        DefaultTableModel modeloTabelaConstrucaoCriada = (DefaultTableModel) this.tbContrucao.getModel();
        while(modeloTabelaConstrucaoCriada.getRowCount() > 0)
        {
            modeloTabelaConstrucaoCriada.removeRow(0);
        }
        for(Construcao c : this.bd.getListaConstrucao())
        {
            modeloTabelaConstrucaoCriada.addRow(new Object[]{c.getId(), c.getNome(), c.getDesc()});
        }
        
        //Tabela Unidades
        DefaultTableModel modeloTabelaUnidadeCriar = (DefaultTableModel) this.tbUnidadeCriar.getModel();
        while(modeloTabelaUnidadeCriar.getRowCount() > 0)
        {
            modeloTabelaUnidadeCriar.removeRow(0);
        }
        for(Unidade u : this.bd.getListaCatalogoUnidade())
        {
            modeloTabelaUnidadeCriar.addRow(new Object[]{u.getId(), u.getNome(), u.getForca(), u.getOuro(), u.getMadeira(), u.getPedra(), u.getComida()});
        }
        
        //Tabela de Unidades Criadas
        DefaultTableModel modeloTabelaUnidade = (DefaultTableModel) this.tbUnidade.getModel();
        while(modeloTabelaUnidade.getRowCount() > 0)
        {
            modeloTabelaUnidade.removeRow(0);
        }
        for(Unidade u : this.bd.getListaUnidade())
        {
            modeloTabelaUnidade.addRow(new Object[]{u.getId(), u.getNome(), u.getForca()});
        }
        
        //Tabela Ataque
        DefaultTableModel modeloTabelaAtaque = (DefaultTableModel) this.tbAtaque.getModel();
        while(modeloTabelaAtaque.getRowCount() > 0)
        {
            modeloTabelaAtaque.removeRow(0);
        }
        for(Unidade u : this.bd.getListaUnidade())
        {
            modeloTabelaAtaque.addRow(new Object[]{u.getId(), u.getNome(), u.getForca()});
        }
        int forcaTotal = 0;
        for(int i = 0; i < this.tbAtaque.getRowCount(); i++)
        {
            forcaTotal += (int)(this.tbAtaque.getValueAt(i, 2));
        }
        this.txtForcaTotal.setText(forcaTotal + "");
        
        //Exploradores
        DefaultTableModel modeloExp = (DefaultTableModel) this.tbExploradores.getModel();
        while(modeloExp.getRowCount() > 0)
        {
            modeloExp.removeRow(0);
        }
        for(int i = 0; i < this.bd.getExploradores(); i++)
        {
            modeloExp.addRow(new Object[]{"Explorador"});
        }
    }
    
    public void atualizarListaJogadores()
    {
        DefaultListModel dlm = new DefaultListModel();
        File[] jogadores = new File(this.bd.getDir()).listFiles();
        for(File f : jogadores)
        {
            if(f.getName().equals(this.bd.getNome()) || f.isFile())
            {
                continue;
            }
            dlm.addElement(f.getName());
        }
        listaJogadores1.setModel(dlm);
        listaJogadores2.setModel(dlm);
        listaJogadores3.setModel(dlm);
        listaJogadores4.setModel(dlm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciar1;
    private javax.swing.JButton btIniciar2;
    private javax.swing.JButton btIniciar3;
    private javax.swing.JButton btIniciar4;
    private javax.swing.JButton btIniciar5;
    private javax.swing.JButton btIniciar6;
    private javax.swing.JButton btIniciar7;
    private javax.swing.JButton btIniciar8;
    private javax.swing.JButton btIniciarSave;
    private javax.swing.JButton btParar1;
    private javax.swing.JButton btParar2;
    private javax.swing.JButton btParar3;
    private javax.swing.JButton btParar4;
    private javax.swing.JButton btParar5;
    private javax.swing.JButton btParar6;
    private javax.swing.JButton btParar7;
    private javax.swing.JButton btParar8;
    private javax.swing.JButton btPararSave;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cbMercado;
    private javax.swing.JComboBox cbRecursoInterno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listaJogadores1;
    private javax.swing.JList listaJogadores2;
    private javax.swing.JList listaJogadores3;
    private javax.swing.JList listaJogadores4;
    public javax.swing.JTable msgTabela;
    private javax.swing.JProgressBar pg1;
    private javax.swing.JProgressBar pg2;
    private javax.swing.JProgressBar pg3;
    private javax.swing.JProgressBar pg4;
    private javax.swing.JProgressBar pg5;
    private javax.swing.JProgressBar pg6;
    private javax.swing.JProgressBar pg7;
    private javax.swing.JProgressBar pg8;
    public javax.swing.JProgressBar pgComida;
    public javax.swing.JProgressBar pgMadeira;
    public javax.swing.JProgressBar pgOuro;
    public javax.swing.JProgressBar pgPedra;
    public javax.swing.JProgressBar pgVida;
    private javax.swing.JSpinner qtdMercado;
    private javax.swing.JSpinner spId1;
    private javax.swing.JSpinner spId2;
    private javax.swing.JSpinner spId3;
    private javax.swing.JSpinner spId4;
    private javax.swing.JSpinner spId5;
    private javax.swing.JSpinner spId6;
    private javax.swing.JSpinner spId7;
    private javax.swing.JSpinner spId8;
    public javax.swing.JSpinner spTempo;
    public javax.swing.JSpinner spTempoSave;
    private javax.swing.JTable tabelaConstrucao;
    private javax.swing.JTable tbAtaque;
    private javax.swing.JTable tbContrucao;
    private javax.swing.JTable tbExploradores;
    private javax.swing.JTable tbUnidade;
    private javax.swing.JTable tbUnidadeCriar;
    public javax.swing.JTextField txtArmazem;
    private javax.swing.JTextField txtCalc;
    private javax.swing.JTextField txtCalc1;
    public javax.swing.JTextField txtComida;
    public javax.swing.JTextField txtComidaExp;
    public javax.swing.JTextField txtDefesa;
    private javax.swing.JTextArea txtEnviar;
    public javax.swing.JTextField txtForca;
    private javax.swing.JTextField txtForcaTotal;
    public javax.swing.JTextField txtMadeira;
    public javax.swing.JTextField txtMadeiraExp;
    public javax.swing.JTextField txtOuro;
    public javax.swing.JTextField txtOuroExp;
    public javax.swing.JTextField txtPComida;
    public javax.swing.JTextField txtPMadeira;
    public javax.swing.JTextField txtPOuro;
    public javax.swing.JTextField txtPPedra;
    public javax.swing.JTextField txtPedra;
    public javax.swing.JTextField txtPedraExp;
    private javax.swing.JTextArea txtRecebida;
    public javax.swing.JTextArea txtSaida;
    public javax.swing.JTextArea txtSaidaSave;
    public javax.swing.JTextField txtdir;
    // End of variables declaration//GEN-END:variables
}
