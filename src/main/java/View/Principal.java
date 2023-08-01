package View;

import Control.ProdutoControle;
import Control.ServiçoControle;
import Model.Cliente;
import Model.Produto;
import Model.ProdutoServiço;
import Model.Serviço;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    Principal() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlServiços = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtFoneCliente = new javax.swing.JTextField();
        lblFoneCliente = new javax.swing.JLabel();
        txtDataServiço = new javax.swing.JTextField();
        lblDataServiço = new javax.swing.JLabel();
        lblDescriçaoServiço = new javax.swing.JLabel();
        splDescriçaoServiço = new javax.swing.JScrollPane();
        txtaDescriçaoServiço = new javax.swing.JTextArea();
        splProdutosServiço = new javax.swing.JScrollPane();
        tblProdutosServiço = new javax.swing.JTable();
        lblCpf = new javax.swing.JLabel();
        lblCodSer = new javax.swing.JLabel();
        txtCodServiço = new javax.swing.JTextField();
        txtCpfCliente = new javax.swing.JTextField();
        btnSalvarServiço = new javax.swing.JButton();
        btnCancelarServiço = new javax.swing.JButton();
        btnAtualizarServiço = new javax.swing.JButton();
        lblValorServiço = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        txtValorServiço = new javax.swing.JTextField();
        lblErroServiço = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnDeletarServiço = new javax.swing.JButton();
        pnlVariados = new javax.swing.JPanel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblQtdeProduto = new javax.swing.JLabel();
        txtQtdeProduto = new javax.swing.JTextField();
        lblValorProduto = new javax.swing.JLabel();
        txtValorProduto = new javax.swing.JTextField();
        lblCodProduto = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        lblDescriçaoProduto = new javax.swing.JLabel();
        splDescriçaoProduto = new javax.swing.JScrollPane();
        txtaDescriçaoProduto = new javax.swing.JTextArea();
        splProdutos = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnSalvarProduto = new javax.swing.JButton();
        btnCancelarProduto = new javax.swing.JButton();
        btnAtualizarProduto = new javax.swing.JButton();
        lblErroProduto = new javax.swing.JLabel();
        btnDeletar = new javax.swing.JButton();
        pnlAgenda = new javax.swing.JPanel();
        splAgenda = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmCadastrarCliente = new javax.swing.JMenuItem();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        itmUsuario = new javax.swing.JMenuItem();
        itmSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlServiços.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Dados Cliente e Serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        pnlServiços.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlServiçosMouseClicked(evt);
            }
        });

        lblNomeCliente.setText("Nome do cliente");

        lblFoneCliente.setText("Telefone do cliente");

        lblDataServiço.setText("Data do agendamento");

        lblDescriçaoServiço.setText("Descrição do serviço");

        txtaDescriçaoServiço.setColumns(20);
        txtaDescriçaoServiço.setRows(5);
        splDescriçaoServiço.setViewportView(txtaDescriçaoServiço);

        tblProdutosServiço.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Qtde.", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutosServiço.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosServiçoMouseClicked(evt);
            }
        });
        splProdutosServiço.setViewportView(tblProdutosServiço);

        lblCpf.setText("Cpf");

        lblCodSer.setText("Cod. serviço");

        txtCodServiço.setEditable(false);
        txtCodServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodServiçoActionPerformed(evt);
            }
        });

        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });

        btnSalvarServiço.setText("Salvar");
        btnSalvarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarServiçoActionPerformed(evt);
            }
        });

        btnCancelarServiço.setText("Cancelar");
        btnCancelarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarServiçoActionPerformed(evt);
            }
        });

        btnAtualizarServiço.setText("Atualizar");
        btnAtualizarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarServiçoActionPerformed(evt);
            }
        });

        lblValorServiço.setText("Valor do serviço");

        jLabel5.setText("ValorTotal");

        txtValorTotal.setEditable(false);

        lblErroServiço.setForeground(new java.awt.Color(255, 0, 0));
        lblErroServiço.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAdicionar.setText("+");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnDeletarServiço.setText("Deletar");
        btnDeletarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarServiçoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlServiçosLayout = new javax.swing.GroupLayout(pnlServiços);
        pnlServiços.setLayout(pnlServiçosLayout);
        pnlServiçosLayout.setHorizontalGroup(
            pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServiçosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlServiçosLayout.createSequentialGroup()
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescriçaoServiço)
                            .addComponent(lblNomeCliente))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNomeCliente)
                    .addComponent(splDescriçaoServiço, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(splProdutosServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServiçosLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletarServiço)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizarServiço)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarServiço)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarServiço))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlServiçosLayout.createSequentialGroup()
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorServiço)
                            .addComponent(lblCpf)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtValorServiço, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFoneCliente)
                            .addComponent(txtFoneCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(txtDataServiço)
                            .addComponent(lblDataServiço)
                            .addComponent(lblCodSer)
                            .addComponent(txtCodServiço)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                    .addComponent(lblErroServiço, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlServiçosLayout.setVerticalGroup(
            pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlServiçosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblDataServiço)
                    .addComponent(lblFoneCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(lblCodSer)
                    .addComponent(lblDescriçaoServiço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlServiçosLayout.createSequentialGroup()
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblValorServiço))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorServiço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErroServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(pnlServiçosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarServiço)
                            .addComponent(btnCancelarServiço)
                            .addComponent(btnAtualizarServiço)
                            .addComponent(btnAdicionar)
                            .addComponent(btnDeletarServiço)))
                    .addGroup(pnlServiçosLayout.createSequentialGroup()
                        .addComponent(splDescriçaoServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(splProdutosServiço, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlVariados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblNomeProduto.setText("Produto");

        lblQtdeProduto.setText("Qtde.");

        lblValorProduto.setText("Valor unitário");

        lblCodProduto.setText("Cod.");

        txtCodProduto.setEditable(false);

        lblDescriçaoProduto.setText("Descrição");

        txtaDescriçaoProduto.setColumns(20);
        txtaDescriçaoProduto.setRows(5);
        splDescriçaoProduto.setViewportView(txtaDescriçaoProduto);

        splProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Lista de produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cód.", "Produto", "Valor", "Qtde.", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        splProdutos.setViewportView(tblProdutos);

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnCancelarProduto.setText("Cancelar");
        btnCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarProdutoActionPerformed(evt);
            }
        });

        btnAtualizarProduto.setText("Atualizar");
        btnAtualizarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarProdutoActionPerformed(evt);
            }
        });

        lblErroProduto.setForeground(new java.awt.Color(255, 0, 0));
        lblErroProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVariadosLayout = new javax.swing.GroupLayout(pnlVariados);
        pnlVariados.setLayout(pnlVariadosLayout);
        pnlVariadosLayout.setHorizontalGroup(
            pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVariadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(splProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlVariadosLayout.createSequentialGroup()
                        .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtNomeProduto)
                                .addComponent(lblNomeProduto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblValorProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlVariadosLayout.createSequentialGroup()
                                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtdeProduto)
                                    .addComponent(lblCodProduto))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtQtdeProduto)
                            .addComponent(txtCodProduto)))
                    .addComponent(splDescriçaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVariadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualizarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvarProduto))
                    .addGroup(pnlVariadosLayout.createSequentialGroup()
                        .addComponent(lblDescriçaoProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblErroProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlVariadosLayout.setVerticalGroup(
            pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVariadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(lblQtdeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorProduto)
                    .addComponent(lblCodProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescriçaoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splDescriçaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlVariadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnCancelarProduto)
                    .addComponent(btnAtualizarProduto)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(splProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAgenda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Agendamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        tblAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cód.", "Cliente", "Data", "Produtos", "Descrição", "Valor do serviço", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAgendaMouseClicked(evt);
            }
        });
        splAgenda.setViewportView(tblAgenda);

        javax.swing.GroupLayout pnlAgendaLayout = new javax.swing.GroupLayout(pnlAgenda);
        pnlAgenda.setLayout(pnlAgendaLayout);
        pnlAgendaLayout.setHorizontalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splAgenda)
                .addContainerGap())
        );
        pnlAgendaLayout.setVerticalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Opções");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        itmCadastrarCliente.setText("Cadastrar cliente");
        itmCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itmCadastrarCliente);

        itmCadastrarUsuario.setText("Cadastrar usuário");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(itmCadastrarUsuario);

        itmUsuario.setText("Usuário");
        jMenu1.add(itmUsuario);

        itmSair.setText("Sair");
        itmSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSairActionPerformed(evt);
            }
        });
        jMenu1.add(itmSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVariados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlServiços, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlServiços, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlVariados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<ProdutoServiço> produtosserviço = new ArrayList();

    private void txtCodServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodServiçoActionPerformed

    }//GEN-LAST:event_txtCodServiçoActionPerformed

    private void btnCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarProdutoActionPerformed
        this.limparProdutos();
    }//GEN-LAST:event_btnCancelarProdutoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void itmSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_itmSairActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
        new Cadastrar().setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

    private void btnCancelarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarServiçoActionPerformed
        this.limparServiço();
    }//GEN-LAST:event_btnCancelarServiçoActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        if (tblProdutos.getSelectedRow() != -1) {
            txtCodProduto.setText(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0).toString());
            txtNomeProduto.setText(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 1).toString());
            txtValorProduto.setText(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 2).toString());
            txtQtdeProduto.setText(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 3).toString());
            txtaDescriçaoProduto.setText(tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        try {
            switch (new ProdutoControle().cadastrar(txtNomeProduto.getText(), txtQtdeProduto.getText(),
                    txtValorProduto.getText(), txtaDescriçaoProduto.getText(), txtCodProduto.getText())) {
                case 1 ->
                    lblErroProduto.setText("Todos os campos devem ser preenchidos!");

                case 2 -> {
                    this.limparProdutos();
                    this.listarProdutos();
                    lblErroProduto.setText(null);
                }

                case 3 ->
                    lblErroProduto.setText("Produto ja existente!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnAtualizarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarProdutoActionPerformed
        if (tblProdutos.getSelectedRow() != -1) {
            if (new ProdutoControle().atualizarProduto(txtCodProduto.getText(), txtNomeProduto.getText(),
                    txtQtdeProduto.getText(), txtValorProduto.getText(), txtaDescriçaoProduto.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.listarProdutos();
                this.limparProdutos();
            } else {
                lblErroProduto.setText("Todos os campos devem ser preenchidos!");
            }
        } else {
            lblErroProduto.setText("Nenhuma linha selecionada");

        }
    }//GEN-LAST:event_btnAtualizarProdutoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (tblProdutos.getSelectedRow() != -1) {
            if (txtCodProduto.getText().isEmpty()) {
                lblErroProduto.setText("Nenhuma linha selecionada");
            } else {
                if (JOptionPane.showConfirmDialog(null, "Deseja deletar o produto  '" + txtNomeProduto.getText() + "'?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    new ProdutoControle().excluirProduto(txtCodProduto.getText());
                    this.listarProdutos();
                    this.limparProdutos();
                }
            }
        } else {
            lblErroProduto.setText("Nenhuma linha selecionada");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void tblProdutosServiçoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosServiçoMouseClicked

    }//GEN-LAST:event_tblProdutosServiçoMouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        int linha = tblProdutos.getSelectedRow();
        boolean verifica = false;

        if (linha != -1) {
            for (ProdutoServiço produtoserviço : produtosserviço) {
                if (tblProdutos.getValueAt(linha, 1).equals(produtoserviço.getNomeProduto())) {
                    verifica = true;
                }
            }

            if (verifica == true) {
                lblErroServiço.setText("Produto já adicionado!");
            } else {
                ProdutoServiço produtoserviço = new ProdutoServiço(1, tblProdutos.getValueAt(linha, 1).toString(),
                        Integer.parseInt(tblProdutos.getValueAt(linha, 3).toString()),
                        Float.parseFloat(tblProdutos.getValueAt(linha, 2).toString()),
                        tblProdutos.getValueAt(linha, 4).toString(), null);

                produtoserviço.setCodProduto(Integer.parseInt(tblProdutos.getValueAt(linha, 0).toString()));

                produtosserviço.add(produtoserviço);
                this.listarProdutosServiço();
                this.atualizarDados();
            }
        } else {
            lblErroServiço.setText("Selecione um produto em 'Lista de produtos'");
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void itmCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarClienteActionPerformed
        new CadastrarCliente().setVisible(true);
    }//GEN-LAST:event_itmCadastrarClienteActionPerformed

    //Salva o serviço ao clicar em salvar
    private void btnSalvarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarServiçoActionPerformed
        this.atualizarDados();

        try {
            if (txtCodServiço.getText().isEmpty()) {
                lblErroServiço.setText(null);
                ServiçoControle serviçocontrole = new ServiçoControle();

                Cliente cliente = serviçocontrole.verificaCliente(txtNomeCliente.getText(), txtFoneCliente.getText(), txtCpfCliente.getText());

                if (cliente == null) {
                    lblErroServiço.setText("Preencha todos os campos de cliente");
                } else {
                    lblErroServiço.setText(null);

                    if (serviçocontrole.salvar(cliente, txtDataServiço.getText(), produtosserviço, txtaDescriçaoServiço.getText(), txtValorServiço.getText(), txtValorTotal.getText()) == true) {
                        this.limparServiço();
                        this.listarServiços();
                        this.listarProdutos();
                    } else {
                        lblErroServiço.setText("Verifique os campos de data e valor do serviço");
                    }
                }
            } else {
                lblErroServiço.setText("Serviço já existente!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o serviço " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnSalvarServiçoActionPerformed

    //Quando é clicado no painel de serviços os dados são atualizados nas textfields
    private void pnlServiçosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlServiçosMouseClicked
        this.atualizarDados();
    }//GEN-LAST:event_pnlServiçosMouseClicked

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed

    }//GEN-LAST:event_txtCpfClienteActionPerformed

    //Quando é clicado em uma linha da tabela serviços, os daos são passados para as textfields
    private void tblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAgendaMouseClicked
        if (tblAgenda.getSelectedRow() != -1) {
            this.limparServiço();

            for (Serviço serviço : new ServiçoControle().recuperar()) {
                if (Integer.parseInt(tblAgenda.getValueAt(tblAgenda.getSelectedRow(), 0).toString()) == serviço.getCodServiço()) {
                    txtNomeCliente.setText(serviço.getCliente().getNomeCliente());
                    txtFoneCliente.setText(serviço.getCliente().getFoneCliente());
                    txtCpfCliente.setText(serviço.getCliente().getCpfCliente());
                    txtDataServiço.setText(serviço.getData());
                    txtaDescriçaoServiço.setText(serviço.getDescriçao());
                    txtCodServiço.setText(Integer.toString(serviço.getCodServiço()));
                    txtValorServiço.setText(Float.toString(serviço.getValorServiço()));
                    txtValorTotal.setText(Float.toString(serviço.getValorTotal()));

                    produtosserviço.addAll(serviço.getProdutosserviço());

                    this.listarProdutosServiço();
                }
            }
        }
    }//GEN-LAST:event_tblAgendaMouseClicked

    private void btnAtualizarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarServiçoActionPerformed
        if (tblAgenda.getSelectedRow() != -1) {
            if (txtCodServiço.getText().isEmpty()) {
                lblErroServiço.setText("Nenhuma linha selecionada!");
            } else {
                if (txtDataServiço.getText().isEmpty() || txtValorServiço.getText().isEmpty()) {
                    lblErroServiço.setText("Verifique os campos de data e valor do serviço");
                } else {
                    lblErroServiço.setText(null);
                    ServiçoControle serviçocontrole = new ServiçoControle();
                    Cliente cliente;
                    int codProdutos;

                    for (Serviço serviço : serviçocontrole.recuperar()) {
                        if (Integer.parseInt(txtCodServiço.getText()) == serviço.getCodServiço()) {
                            cliente = serviço.getCliente();
                            codProdutos = serviço.getProdutosserviço().get(0).getCodProduto();

                            if (codProdutos != 0) {
                                ProdutoControle produtocontrole = new ProdutoControle();

                                for (ProdutoServiço produtoserviço : serviço.getProdutosserviço()) {
                                    for (Produto produto : produtocontrole.listarProdutos()) {
                                        if (produtoserviço.getNomeProduto().equals(produto.getNomeProduto())) {
                                            produto.setQtdeProduto(produto.getQtdeProduto() + produtoserviço.getQtde());
                                            produto.atualizar(produto);
                                            break;
                                        }
                                    }
                                }
                                ProdutoServiço produtoserviço = new ProdutoServiço();
                                produtoserviço.deletarProdutoServiço(codProdutos);

                                serviçocontrole.atualizaServiços(cliente, txtDataServiço.getText(), produtosserviço, codProdutos, txtaDescriçaoServiço.getText(), txtValorServiço.getText(), txtValorTotal.getText());
                            } else {

                            }
                            break;
                        }
                    }
                    this.limparServiço();
                    this.listarServiços();
                    this.listarProdutos();
                }
            }
        }
    }//GEN-LAST:event_btnAtualizarServiçoActionPerformed

    //Deleta um serviço do banco de dados
    private void btnDeletarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarServiçoActionPerformed
        if (tblAgenda.getSelectedRow() != -1) {
            if (txtCodServiço.getText().isEmpty()) {
                lblErroServiço.setText("Nenhuma linha selecionada!");
            } else {
                lblErroServiço.setText(null);

                if (JOptionPane.showConfirmDialog(null, "Deseja deletar o serviço  '" + txtCodServiço.getText()
                        + "'?", "AVISO", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    ServiçoControle serviçocontrole = new ServiçoControle();

                    if (produtosserviço.isEmpty()) {
                        serviçocontrole.deletarServiço(Integer.parseInt(txtCodServiço.getText()), 0);
                    } else {
                        for (ProdutoServiço produtoserviço : produtosserviço) {
                            for (Produto produto : new ProdutoControle().listarProdutos()) {
                                if (produtoserviço.getNomeProduto().equals(produto.getNomeProduto())) {
                                    produto.setQtdeProduto(produto.getQtdeProduto() + produtoserviço.getQtde());
                                    produto.atualizar(produto);
                                    break;
                                }
                            }
                        }
                        serviçocontrole.deletarServiço(Integer.parseInt(txtCodServiço.getText()), produtosserviço.get(0).getCodProduto());
                    }

                    this.limparServiço();
                    this.listarServiços();
                    this.listarProdutos();
                }
            }
        } else {
            lblErroServiço.setText("Nenhuma linha selecionada!");
        }
    }//GEN-LAST:event_btnDeletarServiçoActionPerformed

    //Lista os porodutos na lista de produtos do estoque
    public void listarProdutos() {
        DefaultTableModel modelo = (DefaultTableModel) tblProdutos.getModel();
        modelo.setRowCount(0);

        for (Produto produto : new ProdutoControle().listarProdutos()) {
            if (produto.getQtdeProduto() < 1) {
                //deixar linha vermelha
            }
            modelo.addRow(new Object[]{produto.getCodProduto(), produto.getNomeProduto(), produto.getValorProduto(), produto.getQtdeProduto(), produto.getDescriçaoProduto()});
        }
    }

    //Lista os pordutos do serviço na tabela de produtos do serviço
    private void listarProdutosServiço() {
        DefaultTableModel modelo = (DefaultTableModel) tblProdutosServiço.getModel();
        modelo.setRowCount(0);

        for (ProdutoServiço produtoServiço : produtosserviço) {
            modelo.addRow(new Object[]{produtoServiço.getNomeProduto(), produtoServiço.getQtde(), produtoServiço.getValorProduto()});
        }
    }

    //Lista os serviços cadastrados
    public void listarServiços() {
        DefaultTableModel modelo = (DefaultTableModel) tblAgenda.getModel();
        modelo.setRowCount(0);

        for (Serviço serviço : new ServiçoControle().recuperar()) {
            String produtos = "";

            for (ProdutoServiço produtoserviço : serviço.getProdutosserviço()) {
                produtos = (serviço.getProdutosserviço().size() == 1) ? (produtos + produtoserviço.getNomeProduto()) : (produtos + produtoserviço.getNomeProduto() + ", ");
            }
            modelo.addRow(new Object[]{serviço.getCodServiço(), serviço.getCliente().getNomeCliente(), serviço.getData(), produtos, serviço.getDescriçao(), serviço.getValorServiço(), serviço.getValorTotal()});
        }
    }

    //Limpa as textfields de serviço
    private void limparServiço() {
        txtNomeCliente.setText(null);
        txtFoneCliente.setText(null);
        txtDataServiço.setText(null);
        txtaDescriçaoServiço.setText(null);
        txtCpfCliente.setText(null);
        txtCodServiço.setText(null);
        txtValorServiço.setText(null);
        txtValorTotal.setText(null);

        produtosserviço.clear();
        this.listarProdutosServiço();
    }

    //limpa as textfields de produtos
    private void limparProdutos() {
        txtNomeProduto.setText(null);
        txtQtdeProduto.setText(null);
        txtValorProduto.setText(null);
        txtCodProduto.setText(null);
        txtaDescriçaoProduto.setText(null);
    }

    //Atualiza dados na tabela de produtos do serviço
    private void atualizarDados() {
        int i = 0;

        for (ProdutoServiço produtoServiço : produtosserviço) {
            if (produtoServiço.getQtde() == 1) {
                float novoValor = Integer.parseInt(tblProdutosServiço.getValueAt(i, 1).toString()) * produtoServiço.getValorProduto();

                produtoServiço.setValorProduto(novoValor);
                produtoServiço.setQtde(Integer.parseInt(tblProdutosServiço.getValueAt(i, 1).toString()));

                produtosserviço.set(i, produtoServiço);
            } else {
                float valorUnitario = produtoServiço.getValorProduto() / produtoServiço.getQtde();
                float novoValor = Integer.parseInt(tblProdutosServiço.getValueAt(i, 1).toString()) * valorUnitario;

                produtoServiço.setValorProduto(novoValor);
                produtoServiço.setQtde(Integer.parseInt(tblProdutosServiço.getValueAt(i, 1).toString()));

                produtosserviço.set(i, produtoServiço);
            }
            i++;
        }
        this.listarProdutosServiço();
        this.atualizarValorTotal();
    }

    //Atualiza a textfield valor total
    private void atualizarValorTotal() {
        float valorTotalProdutos = 0;
        float valorTotal;
        float valorServiço;

        for (ProdutoServiço produtoserviço : produtosserviço) {
            valorTotalProdutos = valorTotalProdutos + produtoserviço.getValorProduto();
        }

        valorServiço = (txtValorServiço.getText().isEmpty()) ? 0 : Float.parseFloat(txtValorServiço.getText());

        valorTotal = valorTotalProdutos + valorServiço;

        txtValorTotal.setText(Float.toString(valorTotal));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            Principal principal = new Principal();
            principal.setExtendedState(MAXIMIZED_BOTH);
            principal.listarProdutos();
            principal.listarServiços();
            principal.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizarProduto;
    private javax.swing.JButton btnAtualizarServiço;
    private javax.swing.JButton btnCancelarProduto;
    private javax.swing.JButton btnCancelarServiço;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnDeletarServiço;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnSalvarServiço;
    private javax.swing.JMenuItem itmCadastrarCliente;
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmUsuario;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblCodSer;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataServiço;
    private javax.swing.JLabel lblDescriçaoProduto;
    private javax.swing.JLabel lblDescriçaoServiço;
    private javax.swing.JLabel lblErroProduto;
    private javax.swing.JLabel lblErroServiço;
    private javax.swing.JLabel lblFoneCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQtdeProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JLabel lblValorServiço;
    private javax.swing.JPanel pnlAgenda;
    private javax.swing.JPanel pnlServiços;
    private javax.swing.JPanel pnlVariados;
    private javax.swing.JScrollPane splAgenda;
    private javax.swing.JScrollPane splDescriçaoProduto;
    private javax.swing.JScrollPane splDescriçaoServiço;
    private javax.swing.JScrollPane splProdutos;
    private javax.swing.JScrollPane splProdutosServiço;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTable tblProdutosServiço;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtCodServiço;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtDataServiço;
    private javax.swing.JTextField txtFoneCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQtdeProduto;
    private javax.swing.JTextField txtValorProduto;
    private javax.swing.JTextField txtValorServiço;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextArea txtaDescriçaoProduto;
    private javax.swing.JTextArea txtaDescriçaoServiço;
    // End of variables declaration//GEN-END:variables
}
