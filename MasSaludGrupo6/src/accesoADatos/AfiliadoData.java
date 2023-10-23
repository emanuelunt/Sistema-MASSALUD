package accesoADatos;

import entidades.Afiliado;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nuri
 */
public class AfiliadoData {

    private Connection con = null;

    public AfiliadoData() {

        con = Conexion.getConexion();
    }

    public Afiliado guardarAfiliado(Afiliado afiliado) {

        try {
            String sql = "INSERT INTO afiliados (apellido,nombre,dni,domicilio,telefono,activo) VALUE (?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, afiliado.getApellido());
            ps.setString(2, afiliado.getNombre());
            ps.setString(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilio());
            ps.setString(5, afiliado.getTelefono());
            ps.setBoolean(6, afiliado.isActivo());

            int filasAfectadas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                afiliado.setIdAfiliado(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Afliado añadido con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(EN Guardar)Error al acceder a la tabla afiliados." + ex.getMessage());
        }

        return afiliado;
    }// Fin guardarAfiliado

    public void eliminarAfiliado(int id) {

        try {
            String sql = "UPDATE afiliados SET activo = 0 WHERE idAfiliado = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente el Afiliado.");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "(En Eliminar)Error al acceder a la tabla Afiliados." + err.getMessage());
        }
    } // Fin de eliminarAfiliado  

    public void modificarAfiliado(Afiliado afiliado) { //

        String sql = "UPDATE afiliados SET  apellido = ?, nombre = ?, dni = ?, domicilio = ?, telefono = ?, activo = ? WHERE idAfiliado = ?;";
        PreparedStatement ps = null;

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, afiliado.getApellido());
            ps.setString(2, afiliado.getNombre());
            ps.setString(3, afiliado.getDni());
            ps.setString(4, afiliado.getDomicilio());
            ps.setString(5, afiliado.getTelefono());
            ps.setBoolean(6, afiliado.isActivo());
            ps.setInt(7, afiliado.getIdAfiliado());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El afiliado no existe!!.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(En Modificar)Error al acceder a la tabla Afiliados." + ex.getMessage());
        }

    } // Fin de modificar Afiliado

    public List<Afiliado> listarAfiliado() { // Lista de Afiliado

        List<Afiliado> _afiliado = new ArrayList<>();

        try {
            String sql = "SELECT idAfiliado,apellido, nombre,dni,domicilio,telefono,activo FROM afiliados WHERE activo = 1 ORDER BY apellido;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Afiliado afiliado = new Afiliado();

                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getString("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getString("telefono"));

                _afiliado.add(afiliado);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Afiliado)Error al acceder a la tabla Afiliados." + ex.getMessage());
        }

        return _afiliado;
    } // Fin Lista de Afiliados

    public Afiliado buscarAfiliadoPorDni(String dni) // Buscar por DNI
    {
        Afiliado afiliado = null;

        String sql = "SELECT idAfiliado,apellido,nombre,dni,domicilio,telefono,activo FROM afiliados WHERE dni = ? AND activo = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                afiliado = new Afiliado();
                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getString("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getString("telefono"));
                afiliado.setActivo(rs.getBoolean("activo"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el afiliado!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Buscar Por DNI)Error al acceder a la tabla Afiliados." + ex.getMessage());
        }
        return afiliado;
    }// Fin Buscar Afiliado por DNI

    public List<Afiliado> buscarAfiliadoPorApellido(String _apellido) // Buscar por apellido
    {
        List<Afiliado> _afiliado = new ArrayList<>();

        String sql = "SELECT idAfiliado,apellido,nombre,dni,domicilio,telefono,activo FROM afiliados WHERE apellido LIKE ? AND activo = 1;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, _apellido + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Afiliado afiliado = new Afiliado();

                afiliado.setIdAfiliado(rs.getInt("idAfiliado"));
                afiliado.setApellido(rs.getString("apellido"));
                afiliado.setNombre(rs.getString("nombre"));
                afiliado.setDni(rs.getString("dni"));
                afiliado.setDomicilio(rs.getString("domicilio"));
                afiliado.setTelefono(rs.getString("telefono"));

                _afiliado.add(afiliado);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Buscar Por DNI)Error al acceder a la tabla Afiliados." + ex.getMessage());
        }
        return _afiliado;
    }// Fin Buscar Afiliado por apellido

}
