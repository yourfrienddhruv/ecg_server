/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecg;

/**
 *
 * @author bon
 */
public class ECGDiagnosis extends javax.swing.JFrame {

    /**
     * Creates new form ECGDiagnosis
     */
    public ECGDiagnosis() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel4.setBackground(new java.awt.Color(254, 184, 156));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel4.setMinimumSize(new java.awt.Dimension(113, 30));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setText("Interpretation");
        jPanel4.add(jLabel1);

        getContentPane().add(jPanel4);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);

        jPanel5.setBackground(new java.awt.Color(254, 184, 156));
        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel5.setMinimumSize(new java.awt.Dimension(69, 30));
        jPanel5.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setText("Diagnosis: ");
        jPanel5.add(jLabel2);

        jTextField1.setPreferredSize(new java.awt.Dimension(5000, 27));
        jPanel5.add(jTextField1);

        getContentPane().add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(254, 184, 156));
        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(10, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jButton2.setText("Save");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 29));
        jButton2.setMinimumSize(new java.awt.Dimension(60, 29));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 29));
        jPanel6.add(jButton2);

        getContentPane().add(jPanel6);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ECGDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ECGDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ECGDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ECGDiagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ECGDiagnosis().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
