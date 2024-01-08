
package tubespbofix;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.text.View;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrameLaundry extends javax.swing.JFrame {

    int berat;
    int total;
    int selectedIndex;
    String paket = "";
    String harga = "";
    
    public FrameLaundry() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnUpdateTab = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubespbofix/czM6Ly9tZWRpYS1wcml2YXRlLmNhbnZhLmNvbS9faThkdy9NQUY1UnhfaThkdy8xL3AucG5n.png"))); // NOI18N

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdateTab.setText("Update");
        btnUpdateTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTabActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama", "No HP", "Paket", "Berat", "Harga"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateTab)
                .addGap(98, 98, 98)
                .addComponent(btnDelete)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel8)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnUpdateTab)
                    .addComponent(btnDelete))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("list pesanan", jPanel1);

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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaketDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fieldBerat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fieldNoHp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(155, 155, 155))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(PaketDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TotalHarga))
                .addGap(55, 55, 55)
                .addComponent(TambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        jTabbedPane1.addTab("input pesanan", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            // 1. Setup koneksi ke database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");
            // 2. Ambil baris terpilih dari jTable1
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // 3. Ambil nilai no dari baris terpilih
            int noToDelete = (int) jTable1.getValueAt(selectedRow, 0);
            // 4. Buat dan jalankan pernyataan SQL DELETE
            String sql = "DELETE FROM pesanan WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, noToDelete);
            int affectedRows = preparedStatement.executeUpdate();
            // 5. Periksa apakah penghapusan berhasil
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);

                
                
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // 7. Tutup koneksi
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void TambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahButtonActionPerformed
        try{
            Database db = new Database();
            int no = db.getLatestIdFromDatabase();
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
            psn.insert_pesanan();
            
            fieldNama.setText("");
            fieldNoHp.setText("");
            fieldBerat.setText("");
            TotalHarga.setText("");
        }catch (SQLException e){
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_TambahButtonActionPerformed

    private void PaketDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaketDropDownActionPerformed
        selectedIndex = PaketDropDown.getSelectedIndex();
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

    private void fieldNoHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoHpActionPerformed

    private void btnUpdateTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTabActionPerformed
        // TODO add your handling code here:
        try {
        // 1. Setup koneksi ke database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry", "root", "");

        // 2. Buat dan jalankan pernyataan SQL
        String sql = "SELECT id, nama, no_hp, berat, paket, harga FROM pesanan";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        // 3. Ambil hasil dan tampilkan di jTable1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Mengosongkan tabel sebelum mengisi dengan data baru

        while (resultSet.next()) {
            int no = resultSet.getInt("id");
            String nama = resultSet.getString("nama");
            String no_hp = resultSet.getString("no_hp");
            double berat = resultSet.getDouble("berat");
            String paket = resultSet.getString("paket");
            double harga = resultSet.getDouble("harga");

            // Menambahkan baris baru ke jTable1
            model.addRow(new Object[]{no, nama, no_hp, berat, paket, harga});
        }
        
        // 4. Tutup koneksi
        resultSet.close();
        preparedStatement.close();
        connection.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateTabActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diedit", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int noToEdit = (int) jTable1.getValueAt(selectedRow, 0);
            EditDialog dialog = new EditDialog(this, true, noToEdit);
            dialog.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrameLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLaundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PaketDropDown;
    private javax.swing.JButton TambahButton;
    private javax.swing.JLabel TotalHarga;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdateTab;
    private javax.swing.JTextField fieldBerat;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNoHp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
