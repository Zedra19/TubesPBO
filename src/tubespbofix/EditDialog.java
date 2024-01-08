
package tubespbofix;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.text.*;
import java.sql.*;
import java.sql.PreparedStatement;

public class EditDialog extends javax.swing.JDialog {
    private int no;
    int berat;
    int total;
    String paket = "";
    String harga = "";
    
    public EditDialog(java.awt.Frame parent, boolean visible,int noToEdit) {
        super(parent, visible);
        initComponents();
        this.no = noToEdit;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldNoHp = new javax.swing.JTextField();
        PaketDropDown = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        TambahButton = new javax.swing.JButton();
        fieldBerat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TotalHarga = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No.hp");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Paket");

        fieldNoHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoHpActionPerformed(evt);
            }
        });

        PaketDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reguler (2 hari + parfum)", "Deluxe  (2 hari + parfum + setrika)", "Exclusive (1 hari + parfum)", "VIP (1 hari + parfum + setrika)" }));
        PaketDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaketDropDownActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Harga");

        TambahButton.setText("Tambah");
        TambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Berat");

        TotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        TotalHarga.setText("Rp.");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubespbofix/czM6Ly9tZWRpYS1wcml2YXRlLmNhbnZhLmNvbS9faThkdy9NQUY1UnhfaThkdy8xL3AucG5n.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaketDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(130, 130, 130))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PaketDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TotalHarga))
                .addGap(75, 75, 75)
                .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoHpActionPerformed

    private void PaketDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaketDropDownActionPerformed
        int selectedIndex = PaketDropDown.getSelectedIndex();
        berat = Integer.parseInt(fieldBerat.getText());
        switch (selectedIndex) {
            case 0:
            {
                int hargaAwal = 6000;
                total = (hargaAwal * berat);
                TotalHarga.setText(Integer.toString(total));
                break;
            }
            case 1:
            {
                int hargaAwal = 7000;
                total = (hargaAwal * berat);
                TotalHarga.setText(Integer.toString(total));
                break;
            }
            case 2:
            {
                int hargaAwal = 8000;
                total = (hargaAwal * berat);
                TotalHarga.setText(Integer.toString(total));
                break;
            }
            case 3:
            {
                int hargaAwal = 9000;
                total = (hargaAwal * berat);
                TotalHarga.setText(Integer.toString(total));
                break;
            }
            default:
            break;
        }
    }//GEN-LAST:event_PaketDropDownActionPerformed

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");
            String nama = fieldNama.getText();
            String no_hp = fieldNoHp.getText();
            int selectedIndex = PaketDropDown.getSelectedIndex();
            switch (selectedIndex) {
                case 0:
                paket = "Reguler";
                harga = Integer.toString(total);
                break;
                case 1:
                paket = "Deluxe";
                harga = Integer.toString(total);
                break;
                case 2:
                paket = "Exclusive";
                harga = Integer.toString(total);
                break;
                case 3:
                paket = "VIP";
                harga = Integer.toString(total);
                break;
                default:
                break;
            }

            Pesanan psn = new Pesanan(no,nama,no_hp,paket,berat,harga);
            psn.edit_pesanan();
            this.dispose();

            fieldNama.setText("");
            fieldNoHp.setText("");
            fieldBerat.setText("");
            TotalHarga.setText("");
        }catch (SQLException e){
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_TambahButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditDialog dialog = new EditDialog(new javax.swing.JFrame(), true, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PaketDropDown;
    private javax.swing.JButton TambahButton;
    private javax.swing.JLabel TotalHarga;
    private javax.swing.JTextField fieldBerat;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNoHp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
