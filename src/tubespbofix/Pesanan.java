package tubespbofix;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.View;

public class Pesanan extends DataPesanan implements FungsiPesan {

    public Pesanan(int no, String nama, String no_hp, String paket, int berat, String harga) {
        super(no, nama, no_hp, paket, berat, harga);
    }
    
    public void update_pesanan() throws SQLException {
        try {
            Database db = new Database();
            String sql = "UPDATE laundry SET nama=?, no_hp=?, berat=?, paket=?, harga=? WHERE id=?";
            PreparedStatement preparedStatement = db.prepareStatement(sql);

            // Mengatur nilai parameter sesuai dengan objek pesanan
            preparedStatement.setString(1, this.getNama());
            preparedStatement.setString(2, this.getNo_hp());
            preparedStatement.setString(3, this.getPaket());
            preparedStatement.setString(4, this.getHarga());
            preparedStatement.setDouble(5, this.getBerat());
            preparedStatement.setInt(6, this.getNo());

            // Menjalankan pernyataan SQL untuk melakukan pembaruan data
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void insert_pesanan() {
        try {
            Database db = new Database();
            String sql = "INSERT INTO pesanan (id, nama, no_hp, berat, paket, harga) VALUES ('" + getNo() + "','" + getNama() + "','" + getNo_hp() + "','" + getBerat() +"','" + getPaket() + "','" + getHarga() + "')";
            db.query(sql);
        } catch (SQLException e) {
            System.out.println("Terjadi kesalahan dalam menginsert data: " + e.getMessage());
            // Ganti dengan penanganan kesalahan yang sesuai dengan aplikasi Anda
        }
    }
    
    public void edit_pesanan() {
        try {
        Database db = new Database();
        String sql = "UPDATE pesanan SET nama='"+getNama()+"', no_hp='"+getNo_hp()+"', berat='"+getBerat()+"', paket='"+getPaket()+"', harga='"+getHarga()+"'  WHERE id='"+getNo()+"'";
        db.query(sql);
    } catch (SQLException e) {
        System.out.println("Terjadi kesalahan dalam mengupdate data: " + e.getMessage());
        // Ganti dengan penanganan kesalahan yang sesuai dengan aplikasi Anda
    }
    }

    @Override
    public void refresh_halaman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete_pesanan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
