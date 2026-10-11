package koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Pengaturan Koneksi Database MySQL
 */
public class koneksi {
    private static Connection connection = null;
    
    public static Connection getConnection() {
        if (connection == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("testing_dbsekolah");
            data.setUser("root");
            data.setPassword("");
            try {
                connection = data.getConnection();
                System.out.println("Koneksi Sukses ke Database: testing_dbsekolah");
            } catch (SQLException se) {
                System.err.println("Koneksi gagal: " + se.getMessage());
            }
        }
        return connection;         
    }
}
