
package accesoADatos;

import entidades.Afiliado;
import entidades.Especialidad;
import entidades.Prestador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuri
 */
public class PrestadorData {
    
     private Connection con = null;
     
     public PrestadorData(){
         
         con = Conexion.getConexion(); 
     }
     
      public Prestador guardarPrestador(Prestador prestador) {

        try {
            String sql = "INSERT INTO prestadores (apellido,nombre,dni,domicilio,telefono,id_especialidad,activo) VALUE (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            int id_especialidad = (prestador.getEspecialidad()).getIdCodigo();
            
            ps.setString(1, prestador.getApellido());
            ps.setString(2, prestador.getNombre());
            ps.setString(3, prestador.getDni());
            ps.setString(4, prestador.getDomicilio());
            ps.setString(5, prestador.getTelefono());
            ps.setString(6, Integer.toString(id_especialidad));
            ps.setBoolean(7, prestador.isActivo());           
            
            int filasAfectadas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {                      
                    
                prestador.setIdPrestador(rs.getInt(1)); 
                JOptionPane.showMessageDialog(null, " Prestador añadido con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(EN Guardar)Error al acceder a la tabla prestadores." + ex.getMessage());
        }
        
        return prestador;
    }// Fin guardarPrestador
      
    public void eliminarPrestador(int id) {

        try {
            String sql = "UPDATE prestadores SET activo = 0 WHERE idPrestador = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente el el prestador.");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "(En Eliminar)Error al acceder a la tabla Prestadores." + err.getMessage());
        }
    } // Fin de eliminarPrestador  
    
    public void modificarPrestador(Prestador prestador) { //

        String sql = "UPDATE prestadores SET  apellido = ?, nombre = ?, dni = ?, domicilio = ?, telefono = ?,id_especialidad = ?, activo = ? WHERE idPrestador = ?;";
        PreparedStatement ps = null;

        try {
            
            int id_especialidad = prestador.getEspecialidad().getIdCodigo();

            ps = con.prepareStatement(sql);
            ps.setString(1, prestador.getApellido());
            ps.setString(2, prestador.getNombre());
            ps.setString(3, prestador.getDni());
            ps.setString(4, prestador.getDomicilio());
            ps.setString(5, prestador.getTelefono());
            ps.setString(6, Integer.toString(id_especialidad));            
            ps.setBoolean(7, prestador.isActivo());
            ps.setInt(8, prestador.getIdPrestador());           
           
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado no existe!!.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(En Modificar)Error al acceder a la tabla Prestadores." + ex.getMessage());
        }
    } // Fin de modificar Prestador
    
    public List<Prestador> listarPrestador() { // Lista de Prestador

        List<Prestador> _prestador = new ArrayList<>();
        

        try {
            String sql = "SELECT idPrestador,apellido,nombre,dni,domicilio,telefono,id_especialidad,tipo FROM prestadores JOIN especialidades ON id_especialidad = idCodigo WHERE prestadores.activo = 1 ORDER BY apellido;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestador prestador = new Prestador();
                Especialidad especialidad = new Especialidad();
                especialidad.setIdCodigo(rs.getInt("id_especialidad"));
                especialidad.setTipo(rs.getString("tipo"));
                
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDni(rs.getString("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getString("telefono"));
                prestador.setEspecialidad(especialidad); 
                //prestador.setActivo(rs.getBoolean("activo"));                
                _prestador.add(prestador);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Prestador)Error al acceder a la tabla Prestador." + ex.getMessage());
        }

        return _prestador;
    } // Fin Lista de Prestadores
    
    public Prestador buscarPrestadorPorDni(String dni) // Buscar por DNI
    {
        Prestador prestador = null;
        Especialidad especialidad = null;

        String sql = "SELECT idPrestador,apellido,nombre,dni,domicilio,telefono,id_especialidad,tipo,prestadores.activo FROM prestadores JOIN especialidades ON id_especialidad = idCodigo WHERE prestadores.dni = ? AND prestadores.activo = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                prestador = new Prestador();
                especialidad = new Especialidad();
                especialidad.setIdCodigo(rs.getInt("id_especialidad"));
                especialidad.setTipo(rs.getString("tipo"));
                
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDni(rs.getString("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getString("telefono"));
                prestador.setEspecialidad(especialidad);                
               // prestador.setActivo(rs.getBoolean("activo")); 
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el prestador!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Buscar Por DNI)Error al acceder a la tabla Prestadores." + ex.getMessage());
        }
        
        return prestador;
    }// Fin Buscar Prestador por DNI
    
    public List<Prestador> listarPrestadorXespecialidad(String _espe) { // Lista de Prestador x Especialidad

        List<Prestador> _lista = new ArrayList<>();
        

        try {
            String sql = "SELECT idPrestador,apellido,nombre,dni,domicilio,telefono,id_especialidad,tipo,prestadores.activo FROM prestadores JOIN especialidades ON id_especialidad = idCodigo WHERE tipo = ? AND prestadores.activo= 1 ORDER BY apellido;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, _espe);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Prestador prestador = new Prestador();
                Especialidad especialidad = new Especialidad();
                especialidad.setIdCodigo(rs.getInt("id_especialidad"));
                especialidad.setTipo(rs.getString("tipo"));
                
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDni(rs.getString("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getString("telefono"));
                prestador.setEspecialidad(especialidad); 
                prestador.setActivo(rs.getBoolean("activo"));                
                _lista.add(prestador);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Prestador x Especialidad)Error al acceder a la tabla Prestador." + ex.getMessage());
        }

        return _lista;
    } // Fin Lista de Prestadores X Especialidad
    
    public Prestador buscarPrestadorPorId(int _id) // Buscar por id
    {
        Prestador prestador = null;
        Especialidad especialidad = null;

        String sql = "SELECT idPrestador,apellido,nombre,dni,domicilio,telefono,id_especialidad,tipo,prestadores.activo FROM prestadores JOIN especialidades ON id_especialidad = idCodigo WHERE prestadores.idPrestador = ? AND prestadores.activo = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, _id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                prestador = new Prestador();
                especialidad = new Especialidad();
                especialidad.setIdCodigo(rs.getInt("id_especialidad"));
                especialidad.setTipo(rs.getString("tipo"));
                
                prestador.setIdPrestador(rs.getInt("idPrestador"));
                prestador.setApellido(rs.getString("apellido"));
                prestador.setNombre(rs.getString("nombre"));
                prestador.setDni(rs.getString("dni"));
                prestador.setDomicilio(rs.getString("domicilio"));
                prestador.setTelefono(rs.getString("telefono"));
                prestador.setEspecialidad(especialidad);                
               // prestador.setActivo(rs.getBoolean("activo")); 
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el prestador!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Buscar Por DNI)Error al acceder a la tabla Prestadores." + ex.getMessage());
        }
        
        return prestador;
    }// Fin Buscar Prestador por id
    
}
