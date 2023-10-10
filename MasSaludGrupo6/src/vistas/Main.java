/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;


/**
 *
 * @author 54266
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Background = new keeptoo.KGradientPanel();
        MenuBar = new javax.swing.JPanel();
        ConsultasPanelButton = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        EspecialidadPanelButton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        OrdenPanelButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        AfiliadoPanelButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PrestadorPanelButton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        jTextField3.setText("jTextField3");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setkEndColor(new java.awt.Color(248, 222, 34));
        Background.setkStartColor(new java.awt.Color(144, 12, 63));

        MenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MenuBar.setOpaque(false);

        ConsultasPanelButton.setOpaque(false);
        ConsultasPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultasPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultasPanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConsultasPanelButtonMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consultas");

        javax.swing.GroupLayout ConsultasPanelButtonLayout = new javax.swing.GroupLayout(ConsultasPanelButton);
        ConsultasPanelButton.setLayout(ConsultasPanelButtonLayout);
        ConsultasPanelButtonLayout.setHorizontalGroup(
            ConsultasPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ConsultasPanelButtonLayout.setVerticalGroup(
            ConsultasPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultasPanelButtonLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );

        EspecialidadPanelButton.setOpaque(false);
        EspecialidadPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EspecialidadPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EspecialidadPanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EspecialidadPanelButtonMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Especialidad");

        javax.swing.GroupLayout EspecialidadPanelButtonLayout = new javax.swing.GroupLayout(EspecialidadPanelButton);
        EspecialidadPanelButton.setLayout(EspecialidadPanelButtonLayout);
        EspecialidadPanelButtonLayout.setHorizontalGroup(
            EspecialidadPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        EspecialidadPanelButtonLayout.setVerticalGroup(
            EspecialidadPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspecialidadPanelButtonLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        OrdenPanelButton.setOpaque(false);
        OrdenPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrdenPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrdenPanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrdenPanelButtonMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Orden");

        javax.swing.GroupLayout OrdenPanelButtonLayout = new javax.swing.GroupLayout(OrdenPanelButton);
        OrdenPanelButton.setLayout(OrdenPanelButtonLayout);
        OrdenPanelButtonLayout.setHorizontalGroup(
            OrdenPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OrdenPanelButtonLayout.setVerticalGroup(
            OrdenPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdenPanelButtonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        AfiliadoPanelButton.setOpaque(false);
        AfiliadoPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AfiliadoPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AfiliadoPanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AfiliadoPanelButtonMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Afiliado");

        javax.swing.GroupLayout AfiliadoPanelButtonLayout = new javax.swing.GroupLayout(AfiliadoPanelButton);
        AfiliadoPanelButton.setLayout(AfiliadoPanelButtonLayout);
        AfiliadoPanelButtonLayout.setHorizontalGroup(
            AfiliadoPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AfiliadoPanelButtonLayout.setVerticalGroup(
            AfiliadoPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AfiliadoPanelButtonLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        PrestadorPanelButton.setOpaque(false);
        PrestadorPanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrestadorPanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrestadorPanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PrestadorPanelButtonMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prestador");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PrestadorPanelButtonLayout = new javax.swing.GroupLayout(PrestadorPanelButton);
        PrestadorPanelButton.setLayout(PrestadorPanelButtonLayout);
        PrestadorPanelButtonLayout.setHorizontalGroup(
            PrestadorPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PrestadorPanelButtonLayout.setVerticalGroup(
            PrestadorPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrestadorPanelButtonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConsultasPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EspecialidadPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OrdenPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrestadorPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AfiliadoPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBarLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(AfiliadoPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrestadorPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrdenPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EspecialidadPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultasPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Escritorio.setOpaque(false);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AfiliadoPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfiliadoPanelButtonMousePressed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        AfiliadosForm af = new AfiliadosForm();
        Escritorio.add(af);
        af.setVisible(true);
    }//GEN-LAST:event_AfiliadoPanelButtonMousePressed

    private void PrestadorPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestadorPanelButtonMousePressed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        PrestadoresForm pf = new PrestadoresForm();
        Escritorio.add(pf);
        pf.setVisible(true);
    }//GEN-LAST:event_PrestadorPanelButtonMousePressed

    private void AfiliadoPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfiliadoPanelButtonMouseEntered
        // TODO add your handling code here:
        AfiliadoPanelButton.setBackground(new Color(144,12,63));
        AfiliadoPanelButton.setOpaque(true);
    }//GEN-LAST:event_AfiliadoPanelButtonMouseEntered

    private void AfiliadoPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AfiliadoPanelButtonMouseExited
        // TODO add your handling code here:
        AfiliadoPanelButton.setBackground(null);
        AfiliadoPanelButton.setOpaque(false);
    }//GEN-LAST:event_AfiliadoPanelButtonMouseExited

    private void PrestadorPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestadorPanelButtonMouseEntered
        // TODO add your handling code here:
        PrestadorPanelButton.setBackground(new Color(144,12,63));
        PrestadorPanelButton.setOpaque(true);
    }//GEN-LAST:event_PrestadorPanelButtonMouseEntered

    private void PrestadorPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrestadorPanelButtonMouseExited
        // TODO add your handling code here:
        PrestadorPanelButton.setBackground(null);
        PrestadorPanelButton.setOpaque(false);
    }//GEN-LAST:event_PrestadorPanelButtonMouseExited

    private void OrdenPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenPanelButtonMousePressed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        OrdenesForm of = new OrdenesForm();
        Escritorio.add(of);
        of.setVisible(true);
    }//GEN-LAST:event_OrdenPanelButtonMousePressed

    private void OrdenPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenPanelButtonMouseEntered
        // TODO add your handling code here:
        OrdenPanelButton.setBackground(new Color(144,12,63));
        OrdenPanelButton.setOpaque(true);
    }//GEN-LAST:event_OrdenPanelButtonMouseEntered

    private void OrdenPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrdenPanelButtonMouseExited
        // TODO add your handling code here:
        OrdenPanelButton.setBackground(null);
        OrdenPanelButton.setOpaque(false);
    }//GEN-LAST:event_OrdenPanelButtonMouseExited

    private void EspecialidadPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspecialidadPanelButtonMousePressed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        EspecialidadesForm ef = new EspecialidadesForm();
        Escritorio.add(ef);
        ef.setVisible(true);
    }//GEN-LAST:event_EspecialidadPanelButtonMousePressed

    private void EspecialidadPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspecialidadPanelButtonMouseEntered
        // TODO add your handling code here:
        EspecialidadPanelButton.setBackground(new Color(144,12,63));
        EspecialidadPanelButton.setOpaque(true);
    }//GEN-LAST:event_EspecialidadPanelButtonMouseEntered

    private void EspecialidadPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EspecialidadPanelButtonMouseExited
        // TODO add your handling code here:
        EspecialidadPanelButton.setBackground(null);
        EspecialidadPanelButton.setOpaque(false);
    }//GEN-LAST:event_EspecialidadPanelButtonMouseExited

    private void ConsultasPanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultasPanelButtonMousePressed
        // TODO add your handling code here:
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsultasForm cf = new ConsultasForm();
        Escritorio.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_ConsultasPanelButtonMousePressed

    private void ConsultasPanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultasPanelButtonMouseEntered
        // TODO add your handling code here:
        ConsultasPanelButton.setBackground(new Color(144,12,63));
        ConsultasPanelButton.setOpaque(true);
    }//GEN-LAST:event_ConsultasPanelButtonMouseEntered

    private void ConsultasPanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultasPanelButtonMouseExited
        // TODO add your handling code here:
        ConsultasPanelButton.setBackground(null);
        ConsultasPanelButton.setOpaque(false);
    }//GEN-LAST:event_ConsultasPanelButtonMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AfiliadoPanelButton;
    private keeptoo.KGradientPanel Background;
    private javax.swing.JPanel ConsultasPanelButton;
    private javax.swing.JPanel Escritorio;
    private javax.swing.JPanel EspecialidadPanelButton;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JPanel OrdenPanelButton;
    private javax.swing.JPanel PrestadorPanelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
