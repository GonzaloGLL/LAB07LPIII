import java.io.IOException;
import java.sql.SQLException;

public class ejer4 {
    public static void main(String[] args) {
        try {
            throw new IOException("Error de lectura de archivo");
        } catch (IOException ex) {
            System.out.println("Se ha producido una excepción de IOException: " + ex.getMessage());
        }

        try {
            throw new SQLException("Error de conexión a la base de datos");
        } catch (SQLException ex) {
            System.out.println("Se ha producido una excepción de SQLException: " + ex.getMessage());
        }
    }
}
