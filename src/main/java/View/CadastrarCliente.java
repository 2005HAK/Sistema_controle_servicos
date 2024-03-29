package View;

import Control.ClienteControle;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class CadastrarCliente extends javax.swing.JFrame {

    public CadastrarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroCliente = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        lblFoneCliente = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JTextField();
        lblCpfCliente = new javax.swing.JLabel();
        txtFoneCliente = new javax.swing.JTextField();
        btnConfirmarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlCadastroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Cadastro cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        lblNomeCliente.setText("Nome");

        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyPressed(evt);
            }
        });

        lblFoneCliente.setText("Telefone");

        txtCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClienteActionPerformed(evt);
            }
        });
        txtCpfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfClienteKeyPressed(evt);
            }
        });

        lblCpfCliente.setText("Cpf");

        txtFoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneClienteActionPerformed(evt);
            }
        });
        txtFoneCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFoneClienteKeyPressed(evt);
            }
        });

        btnConfirmarCliente.setText("Confirmar");
        btnConfirmarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClienteActionPerformed(evt);
            }
        });
        btnConfirmarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarClienteKeyPressed(evt);
            }
        });

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        lblErro.setForeground(new java.awt.Color(255, 0, 0));
        lblErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlCadastroClienteLayout = new javax.swing.GroupLayout(pnlCadastroCliente);
        pnlCadastroCliente.setLayout(pnlCadastroClienteLayout);
        pnlCadastroClienteLayout.setHorizontalGroup(
            pnlCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNomeCliente)
                    .addComponent(txtFoneCliente)
                    .addComponent(txtCpfCliente)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCadastroClienteLayout.createSequentialGroup()
                        .addGap(0, 200, Short.MAX_VALUE)
                        .addComponent(btnCancelarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirmarCliente))
                    .addGroup(pnlCadastroClienteLayout.createSequentialGroup()
                        .addGroup(pnlCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblFoneCliente)
                            .addComponent(lblCpfCliente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCadastroClienteLayout.setVerticalGroup(
            pnlCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFoneCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCpfCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblErro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarCliente)
                    .addComponent(btnCancelarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClienteActionPerformed
        
    }//GEN-LAST:event_txtCpfClienteActionPerformed

    private void txtFoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneClienteActionPerformed
        
    }//GEN-LAST:event_txtFoneClienteActionPerformed

    private void btnConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClienteActionPerformed
        this.cadastrar();
    }//GEN-LAST:event_btnConfirmarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnConfirmarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarClienteKeyPressed

    }//GEN-LAST:event_btnConfirmarClienteKeyPressed

    private void txtNomeClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyPressed
        this.enter(evt);
    }//GEN-LAST:event_txtNomeClienteKeyPressed

    private void txtFoneClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFoneClienteKeyPressed
        this.enter(evt);
    }//GEN-LAST:event_txtFoneClienteKeyPressed

    private void txtCpfClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfClienteKeyPressed
        this.enter(evt);
    }//GEN-LAST:event_txtCpfClienteKeyPressed

    private void enter(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.cadastrar();
        }
    }

    private void cadastrar() {
        boolean ok;

        try {
            ok = new ClienteControle().cadastrarCliente(txtNomeCliente.getText(), txtFoneCliente.getText(), txtCpfCliente.getText());

            if (ok == true) {
                this.limparCadastroCliente();
            } else {
                lblErro.setText("Todos os campos devem ser preenchidos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }

    private void limparCadastroCliente() {
        txtNomeCliente.setText(null);
        txtFoneCliente.setText(null);
        txtCpfCliente.setText(null);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new CadastrarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnConfirmarCliente;
    private javax.swing.JLabel lblCpfCliente;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblFoneCliente;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JPanel pnlCadastroCliente;
    private javax.swing.JTextField txtCpfCliente;
    private javax.swing.JTextField txtFoneCliente;
    private javax.swing.JTextField txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
