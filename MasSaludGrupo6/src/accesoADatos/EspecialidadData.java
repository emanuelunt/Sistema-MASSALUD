package accesoADatos;

import entidades.Afiliado;
import entidades.Especialidad;
import java.sql.Connection;
import java.sql.Date;
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
public class EspecialidadData {

    private Connection con = null;

    public EspecialidadData() {

        con = Conexion.getConexion();
    }
    
    public Especialidad guardarEspecialidad(Especialidad especialidad) {

        try {
            String sql = "INSERT INTO especialidades (tipo,activo) VALUE (?,?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, especialidad.getTipo());
            ps.setBoolean(2, especialidad.isActivo());
            int filasAfectadas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {                      
                  
                especialidad.setIdCodigo(rs.getInt(1));                
                JOptionPane.showMessageDialog(null, " Especialidad añadido con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(EN Guardar)Error al acceder a la tabla especialidades " + ex.getMessage());
        }
        return especialidad;
    }// Fin guardarEspecialidad
    
    public void eliminarEspecialidad(int id) {

        try {
            String sql = "UPDATE especialidades SET activo = 0 WHERE idCodigo = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente la especialidad.");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "(En Eliminar)Error al acceder a la tabla Especialidad." + err.getMessage());
        }
    } // Fin de eliminarEspecialidad
    
    public void modificarEspecialidad(Especialidad especialidad) { //

        String sql = "UPDATE especialidades SET  tipo = ?, activo = ? WHERE idCodigo = ?;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, especialidad.getTipo());
            ps.setBoolean(2, especialidad.isActivo());            
            ps.setInt(3, especialidad.getIdCodigo());           
           
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La especialidad no existe!!.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(En Modificar)Error al acceder a la tabla Especialidad." + ex.getMessage());
        }
    } // Fin de modificar Especialidad
    
    public List<Especialidad> listarEspecialidad() { // Lista de Especialidades

        List<Especialidad> _especialidad = new ArrayList<>();

        try {
            String sql = "SELECT idCodigo,tipo,activo FROM especialidades WHERE activo = 1 ORDER BY tipo;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Especialidad especialidad = new Especialidad();
                
                especialidad.setIdCodigo(rs.getInt("idCodigo"));
                especialidad.setTipo(rs.getString("tipo"));
                especialidad.setActivo(rs.getBoolean("activo"));               
                
                _especialidad.add(especialidad);
               
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Especialidad)Error al acceder a la tabla Especialidades." + ex.getMessage());
        }

        return _especialidad;
    } // Fin Listar de Especialidades
    
    public Especialidad buscarEspecialidadPorTipo(String tipo) // Buscar por tipo
    {
        Especialidad especialidad = null;

        String sql = "SELECT idCodigo,tipo,activo FROM especialidades WHERE tipo = ?  AND activo = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tipo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                especialidad = new Especialidad();
                
                especialidad.setIdCodigo(rs.getInt("idCodigo"));
                especialidad.setTipo(rs.getString("tipo"));
                especialidad.setActivo(rs.getBoolean("activo"));
                           
            } else {
                JOptionPane.showMessageDialog(null, "No existe la especialidad!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Buscar Por Tipo)Error al acceder a la tabla Especialidad." + ex.getMessage());
        }
        return especialidad;
    }// Fin Buscar por tipo de especialidad
}

