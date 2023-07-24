
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ebill extends javax.swing.JFrame {
    public ebill() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        txtcname = new javax.swing.JTextField();
        txtunit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setText("ELECTRICITY BILLING SYSTEM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 30, 720, 70);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Customer ID.      :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 180, 26);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Customer Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 320, 190, 16);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Unit                     :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 420, 190, 26);

        txtcid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        getContentPane().add(txtcid);
        txtcid.setBounds(370, 210, 240, 40);

        txtcname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        getContentPane().add(txtcname);
        txtcname.setBounds(370, 310, 240, 40);

        txtunit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        getContentPane().add(txtunit);
        txtunit.setBounds(370, 410, 240, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Elitebook 840 G6\\Downloads\\elec.jpg")); // NOI18N
        jButton1.setText("Calculate Your Bill Amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 560, 500, 70);

        txtprint.setColumns(20);
        txtprint.setRows(5);
        txtprint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51), 2));
        jScrollPane1.setViewportView(txtprint);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(900, 200, 220, 250);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 51));
        jButton2.setText("Print Here");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 560, 180, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Elitebook 840 G6\\Downloads\\bee.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 110, 1100, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      String cid; 
      double charge,gramount;
      int count;
      public void print()
      {
          String cid=txtcid.getText();
          String cname=txtcname.getText();
          String unit=txtunit.getText();
          txtprint.setText(txtprint.getText()+"\n");
          txtprint.setText(txtprint.getText()+"=============================="+"\n");
          txtprint.setText(txtprint.getText()+"    ELECTRICITY BILLING SYSTEM"+"\n");
          txtprint.setText(txtprint.getText()+"=============================="+"\n");
          txtprint.setText(txtprint.getText()+"\n");
          txtprint.setText(txtprint.getText()+"   Customer Id       : =   "+cid+"\n");
          txtprint.setText(txtprint.getText()+"   Customer name : =   "+cname+"\n");
          txtprint.setText(txtprint.getText()+"   Unit                    : =   "+unit+"\n");
          txtprint.setText(txtprint.getText()+"   Amount              : =   "+gramount+"\n");
          txtprint.setText(txtprint.getText()+"\n");
          txtprint.setText(txtprint.getText()+"=============================="+"\n");
          txtprint.setText(txtprint.getText()+"           Thank You Come agian!"+"\n");
          txtprint.setText(txtprint.getText()+"=============================="+"\n");
      }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     cid=txtcid.getText();
     count=Integer.parseInt(txtunit.getText());
     if(count<500)
     {
         charge=1.00;
     }
     else if(count<500 && count<600)
     {
         charge=1.80;
     }
     else if(count < 600 && count<800)
     {
         charge=2.80;
     }
     else
     {
         charge=3.00;
     }
     gramount =charge*count;
     print();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        print();
    }//GEN-LAST:event_jButton2ActionPerformed
 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ebill().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextArea txtprint;
    private javax.swing.JTextField txtunit;
    // End of variables declaration//GEN-END:variables
}
