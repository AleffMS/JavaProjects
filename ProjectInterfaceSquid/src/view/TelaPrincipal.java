/** Classe: TelaPrincipal
 *  Pacote: vieW
 *  Data de modificação: 27/11/2017
 *  Descrição: Está classe é responsavel por criar e gereciar a tela principal do software
 * */
package view;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author aleff
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        miAcl = new javax.swing.JMenuItem();
        miConfigCache = new javax.swing.JMenuItem();
        miAutenticacao = new javax.swing.JMenuItem();
        miSquid = new javax.swing.JMenuItem();
        miUsuario = new javax.swing.JMenuItem();
        mRelaroeio = new javax.swing.JMenu();
        miVisualizar = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TextSqui3");

        jdpPrincipal.setBackground(new java.awt.Color(254, 254, 254));
        jdpPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("Squid");

        jMenu2.setText("Acl's");

        miAcl.setText("Criar Acl's");
        miAcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAclActionPerformed(evt);
            }
        });
        jMenu2.add(miAcl);

        miConfigCache.setText("Configuração de cache");
        miConfigCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConfigCacheActionPerformed(evt);
            }
        });
        jMenu2.add(miConfigCache);

        miAutenticacao.setText("Autenticação");
        miAutenticacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAutenticacaoActionPerformed(evt);
            }
        });
        jMenu2.add(miAutenticacao);

        jMenu1.add(jMenu2);

        miSquid.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miSquid.setText("Reboot");
        miSquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSquidActionPerformed(evt);
            }
        });
        jMenu1.add(miSquid);

        miUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        miUsuario.setText("Usuario");
        miUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(miUsuario);

        jMenuBar1.add(jMenu1);

        mRelaroeio.setText("Sarg");

        miVisualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        miVisualizar.setText("Visualizar");
        miVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVisualizarActionPerformed(evt);
            }
        });
        mRelaroeio.add(miVisualizar);

        jMenuBar1.add(mRelaroeio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(808, 546));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVisualizarActionPerformed

        try {
            String cmd = "sarg";
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(cmd);
            Runtime.getRuntime().exec("firefox localhost/squid-reports/");
            this.dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
    }//GEN-LAST:event_miVisualizarActionPerformed

    private void miSquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSquidActionPerformed

        try {
            int retorno;
            String[] env = {"PATH=/bin:/usr/bin/"};
            String cmd = "serviceRestart.sh";
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(cmd, env);
            retorno = p.waitFor();

            if (retorno == 0) {
                JOptionPane.showMessageDialog(null, "Serviço reiniciado com sucesso!");
            }

        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

    }//GEN-LAST:event_miSquidActionPerformed

    private void miUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioActionPerformed
        TelaUsuario1 usr = new TelaUsuario1();
        jdpPrincipal.add(usr);
        usr.setVisible(true);
    }//GEN-LAST:event_miUsuarioActionPerformed

    private void miAclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAclActionPerformed
        TelaAcl acl = new TelaAcl();
        jdpPrincipal.add(acl);
        acl.setVisible(true);
    }//GEN-LAST:event_miAclActionPerformed

    private void miAutenticacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAutenticacaoActionPerformed
        TelaAutenticação atc = new TelaAutenticação();
        jdpPrincipal.add(atc);
        atc.setVisible(true);
    }//GEN-LAST:event_miAutenticacaoActionPerformed

    private void miConfigCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConfigCacheActionPerformed
        TelaCache cache = new TelaCache();
        jdpPrincipal.add(cache);
        cache.setVisible(true);
    }//GEN-LAST:event_miConfigCacheActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JMenu mRelaroeio;
    private javax.swing.JMenuItem miAcl;
    private javax.swing.JMenuItem miAutenticacao;
    private javax.swing.JMenuItem miConfigCache;
    private javax.swing.JMenuItem miSquid;
    private javax.swing.JMenuItem miUsuario;
    private javax.swing.JMenuItem miVisualizar;
    // End of variables declaration//GEN-END:variables

}
