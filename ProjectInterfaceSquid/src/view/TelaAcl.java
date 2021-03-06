/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.ManipularArquivos;

/**
 *
 * @author aleff
 */
public class TelaAcl extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaACLS
     */
    public TelaAcl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNomeAcl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfRegra = new javax.swing.JTextField();
        cbTipoAcl = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbtDeny = new javax.swing.JRadioButton();
        rbtAllow = new javax.swing.JRadioButton();
        btGravar = new javax.swing.JButton();
        rbtHttpAccess = new javax.swing.JRadioButton();
        rbtAcl = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Criar Acl's");
        setToolTipText("");

        jLabel1.setText("Nome da Acl:");

        jLabel2.setText("Regra:");

        cbTipoAcl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dst", "time", "url_regex -i", " " }));

        jLabel3.setText("Tipo da Acl:");

        rbtDeny.setText("Deny");

        rbtAllow.setText("Allow");

        btGravar.setText("Gravar");
        btGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarActionPerformed(evt);
            }
        });

        rbtHttpAccess.setText("http_access");

        rbtAcl.setText("acl");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(rbtDeny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNomeAcl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtAllow)
                        .addGap(48, 48, 48)
                        .addComponent(rbtAcl)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoAcl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rbtHttpAccess)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btGravar, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(tfRegra))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeAcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbTipoAcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfRegra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtDeny)
                    .addComponent(rbtAllow)
                    .addComponent(btGravar)
                    .addComponent(rbtAcl)
                    .addComponent(rbtHttpAccess))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed

        String path = "/home/aleff/squid.conf";

        if (rbtAcl.isSelected()) {

            String tipoAcl = (String) cbTipoAcl.getSelectedItem();
            String texto = "acl " + tfNomeAcl.getText() + " " + tipoAcl + " " + tfRegra.getText() + "\n";
            new ManipularArquivos().gravar(path, texto);

        }

        if (rbtHttpAccess.isSelected() && rbtDeny.isSelected()) {

            String texto = "http_acess" + " deny " + tfNomeAcl.getText() + "\n\n";
            new ManipularArquivos().gravar(path, texto);

        }

        if (rbtHttpAccess.isSelected() && rbtAllow.isSelected()) {

            String texto = "http_acess" + " allow " + tfNomeAcl.getText() + "\n\n";
            new ManipularArquivos().gravar(path, texto);

        }

    }//GEN-LAST:event_btGravarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGravar;
    private javax.swing.JComboBox<String> cbTipoAcl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rbtAcl;
    private javax.swing.JRadioButton rbtAllow;
    private javax.swing.JRadioButton rbtDeny;
    private javax.swing.JRadioButton rbtHttpAccess;
    private javax.swing.JTextField tfNomeAcl;
    private javax.swing.JTextField tfRegra;
    // End of variables declaration//GEN-END:variables
}
