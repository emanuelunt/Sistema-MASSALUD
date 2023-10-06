package accesoADatos;

import entidades.Afiliado;
import entidades.Especialidad;
import entidades.Orden;
import entidades.Prestador;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuri
 */
public class OrdenData {

    private Connection con = null;
    private Afiliado _afiliado;
    private Prestador _prestador;

    public OrdenData() {
        con = Conexion.getConexion();
        _afiliado = new Afiliado();
        _prestador = new Prestador();
    }

    public Orden guardarOrden(Orden orden) {

        try {
            String sql = "INSERT INTO ordenes (codigo,id_afiliado,id_prestador,fecha,formaPago,importe,activo) VALUE (?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, orden.getCodigo());
            ps.setInt(2, orden.getAfiliado().getIdAfiliado());
            ps.setInt(3, orden.getPrestador().getIdPrestador());
            ps.setDate(4, Date.valueOf(orden.getFecha()));
            ps.setString(5, orden.getFormaPago());
            ps.setDouble(6, orden.getImporte());
            ps.setBoolean(7, orden.isActivo());
            int filasAfectadas = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                orden.setIdOrden(rs.getInt(1));
                JOptionPane.showMessageDialog(null, " Orden añadido con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(EN Guardar)Error al acceder a la tabla Ordenes " + ex.getMessage());
        }
        return orden;
    }// Fin guardarOrden

    public void eliminarOrden(int id) {

        try {
            String sql = "UPDATE ordenes SET activo = 0 WHERE idOrden = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente la orden.");
            }
            ps.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "(En Eliminar)Error al acceder a la tabla ordenes." + err.getMessage());
        }
    } // Fin de eliminarOrden
    
    public void modificarOrden(Orden _orden) { //

        String sql = "UPDATE ordenes SET  codigo = ?,id_afiliado = ?,id_prestador = ?, fecha = ?, formaPago = ?, importe = ?, activo = ? WHERE idOrden = ?;";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, _orden.getCodigo());
            ps.setInt(2, _orden.getAfiliado().getIdAfiliado());
            ps.setInt(3, _orden.getPrestador().getIdPrestador());
            ps.setDate(4, Date.valueOf(_orden.getFecha()));
            ps.setString(5, _orden.getFormaPago());
            ps.setDouble(6, _orden.getImporte());
            ps.setBoolean(7, _orden.isActivo());
            ps.setInt(8, _orden.getIdOrden());                   
           
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La orden no existe!!.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(En Modificar)Error al acceder a la tabla Ordenes." + ex.getMessage());
        }
    } // Fin de modificar Orden

}
