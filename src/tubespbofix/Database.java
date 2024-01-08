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
    
    int getLatestIdFromDatabase() throws SQLException {
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
