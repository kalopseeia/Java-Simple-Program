/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bureau.of.internal.revenue;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Sankyo
 */
public class CA5 extends javax.swing.JFrame {

    /**
     * Creates new form CA5
     */
    public CA5() {
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

        SideMenu = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        UserLevel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserLevel1 = new javax.swing.JLabel();
        assign = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        SC = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        HeaderPressed = new javax.swing.JPanel();
        PanelLayer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideMenu.setBackground(new java.awt.Color(23, 33, 53));
        SideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 33, 53));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserLevel.setBackground(new java.awt.Color(255, 255, 255));
        UserLevel.setForeground(new java.awt.Color(255, 255, 255));
        UserLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLevel.setText("TASK");
        UserLevel.setPreferredSize(new java.awt.Dimension(35, 16));
        jPanel2.add(UserLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 170, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 170, 31));

        UserLevel1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        UserLevel1.setForeground(new java.awt.Color(255, 255, 255));
        UserLevel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLevel1.setText("NAME");
        UserLevel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        UserLevel1.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(UserLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 170, 20));

        SideMenu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 160));

        assign.setBackground(new java.awt.Color(23, 33, 53));
        assign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assignMousePressed(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Assign");
        jLabelHome.setPreferredSize(new java.awt.Dimension(35, 16));

        SC.setBackground(new java.awt.Color(255, 255, 255));
        SC.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout SCLayout = new javax.swing.GroupLayout(SC);
        SC.setLayout(SCLayout);
        SCLayout.setHorizontalGroup(
            SCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        SCLayout.setVerticalGroup(
            SCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout assignLayout = new javax.swing.GroupLayout(assign);
        assign.setLayout(assignLayout);
        assignLayout.setHorizontalGroup(
            assignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignLayout.createSequentialGroup()
                .addComponent(SC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        assignLayout.setVerticalGroup(
            assignLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(SC, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SideMenu.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 50));

        getContentPane().add(SideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        Header.setBackground(new java.awt.Color(62, 101, 181));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 700, 50));

        HeaderPressed.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPressedMouseDragged(evt);
            }
        });
        HeaderPressed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPressedMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPressedLayout = new javax.swing.GroupLayout(HeaderPressed);
        HeaderPressed.setLayout(HeaderPressedLayout);
        HeaderPressedLayout.setHorizontalGroup(
            HeaderPressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        HeaderPressedLayout.setVerticalGroup(
            HeaderPressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(HeaderPressed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        PanelLayer.setBackground(new java.awt.Color(41, 57, 80));
        PanelLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "uniqueid", "taxpayer", "taxpayer", "loano", "examiner", "dateofloa", "dateofloareceipt", "datereceived", "groupsupervisor	"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        PanelLayer.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 310));

        getContentPane().add(PanelLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 700, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void assignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignMousePressed
        // TODO add your handling code here:
        setColor(assign);
        SC.setOpaque(true);
    }//GEN-LAST:event_assignMousePressed

    private void HeaderPressedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPressedMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_HeaderPressedMouseDragged
    int xx, yy;
    private void HeaderPressedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPressedMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_HeaderPressedMousePressed

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
            java.util.logging.Logger.getLogger(CA5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CA5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CA5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CA5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CA5().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (JPanel pane1 : pane) {
            pane1.setBackground(new Color(23, 35, 51));
        }
        for (JPanel indicator : indicators) {
            indicator.setOpaque(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderPressed;
    private javax.swing.JPanel PanelLayer;
    private javax.swing.JPanel SC;
    private javax.swing.JPanel SideMenu;
    private javax.swing.JLabel UserLevel;
    private javax.swing.JLabel UserLevel1;
    private javax.swing.JPanel assign;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}