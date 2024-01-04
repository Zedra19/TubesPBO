package tubespbofix;
import java.sql.*;
import javax.swing.*;
public class Database {
    static final String DB_URL = "jdbc:mysql://localhost:3306/laundry";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    
    
    public Database() throws SQLException {
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void insertData(int no, String nama, String no_hp, String paket, String harga,int berat){
        try {
            String sql = "INSERT INTO laundry (id, nama, no_hp, berat, paket, harga) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,no);
            preparedStatement.setString(2,nama);
            preparedStatement.setString(3,no_hp);
            preparedStatement.setInt(4,berat);
            preparedStatement.setString(5,paket);
            preparedStatement.setString(6,harga);
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil dimasukkan ke dalam tabel.");
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan saat proses pemasukkan data ke dalam tabel.");
        }
    }
    
    public void editData(int no, String nama, String no_hp, String paket, String harga,int berat){
        try {
            String sql = "INSERT INTO laundry (id, nama, no_hp, berat, paket, harga) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,no);
            preparedStatement.setString(2,nama);
            preparedStatement.setString(3,no_hp);
            preparedStatement.setInt(4,berat);
            preparedStatement.setString(5,paket);
            preparedStatement.setString(6,harga);
            preparedStatement.executeUpdate();
            System.out.println("Data berhasil dimasukkan ke dalam tabel.");
        } catch (Exception e) {
            System.out.println("Terdapat kesalahan saat proses pemasukkan data ke dalam tabel.");
        }
    }
    
    
    
    int getLatestIdFromDatabase() throws SQLException {
        // Implementasikan kode untuk mengambil id terakhir dari database,
        // sesuai dengan teknologi database yang digunakan
        // Contoh (jika menggunakan JDBC dengan database MySQL):
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/laundry", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT MAX(id) FROM pesanan");
        int lastId = 0;
        if (resultSet.next()) {
            lastId = resultSet.getInt(1);
        }
        connection.close();
        return lastId + 1;
    }
    
    
    public void query(String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        // Membuat objek PreparedStatement dari koneksi
        return conn.prepareStatement(sql);
    }
}
