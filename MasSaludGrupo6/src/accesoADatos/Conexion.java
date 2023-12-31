package accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuri
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "massalud";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    
    private static Connection connection;
    
    // Método Constructor
    
    private Conexion(){};
    
    public static Connection  getConexion() /*throws ClassNotFoundException*/{
        
        if(connection == null){
            
            try{
                
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB+ "?useLegacyDatetimeCode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);
                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al conectar a la DB MasSalud " + ex.getMessage());
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al cargar los driver " + ex.getMessage());
            }
        }
        return connection;    
    }    
}
