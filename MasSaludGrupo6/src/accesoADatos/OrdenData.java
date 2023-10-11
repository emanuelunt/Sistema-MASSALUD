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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

    public List<Orden> listarOrdenes() { // Lista de ordenes

        List<Orden> _lista = new ArrayList<>();

        try {
            String sql = "SELECT idOrden,codigo,a.idAfiliado,a.apellido AS apellidoA,a.nombre AS nombreA, p.idPrestador,p.apellido AS apellidoP,p.nombre AS nombreP,e.tipo, fecha,formaPago,importe \n"
                    + "FROM ordenes JOIN afiliados AS a ON (ordenes.id_afiliado = a.idAfiliado) JOIN prestadores AS p ON (p.idPrestador = ordenes.id_prestador) \n"
                    + "JOIN especialidades AS e ON (p.id_especialidad = e.idCodigo);";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Orden _orden = new Orden();
                Afiliado _afiliado = new Afiliado(rs.getInt("idAfiliado"), rs.getString("apellidoA"), rs.getString("nombreA"), null, null, null, true);
                Especialidad _espe = new Especialidad(rs.getString("tipo"), true);
                Prestador _prestador = new Prestador(rs.getInt("idPrestador"), rs.getString("apellidoP"), rs.getString("nombreP"), null, null, null, _espe, true);

                _orden.setIdOrden(rs.getInt("idOrden"));
                _orden.setCodigo(rs.getString("codigo"));
                _orden.setAfiliado(_afiliado);
                _orden.setPrestador(_prestador);
                _orden.setFecha(rs.getDate("fecha").toLocalDate());
                _orden.setFormaPago(rs.getString("formaPago"));
                _orden.setImporte(rs.getDouble("importe"));

                _lista.add(_orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Ordenes)Error al acceder a la tabla Ordenes." + ex.getMessage());
        }
        return _lista;
    } // Fin Listar de Ordenes

    public List<Orden> listarOrdenesXfecha(LocalDate _fecha) { // Lista de ordenes x fecha

        List<Orden> _lista = new ArrayList<>();

        try {
            String sql = "SELECT idOrden,codigo,a.idAfiliado,a.apellido AS apellidoA,a.nombre AS nombreA, p.idPrestador,p.apellido AS apellidoP,p.nombre AS nombreP,e.tipo, fecha,formaPago,importe \n"
                    + "FROM ordenes JOIN afiliados AS a ON (ordenes.id_afiliado = a.idAfiliado) JOIN prestadores AS p ON (p.idPrestador = ordenes.id_prestador) \n"
                    + "JOIN especialidades AS e ON (p.id_especialidad = e.idCodigo) WHERE fecha = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(_fecha));
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Orden _orden = new Orden();
                Afiliado _afiliado = new Afiliado(rs.getInt("idAfiliado"), rs.getString("apellidoA"), rs.getString("nombreA"), null, null, null, true);
                Especialidad _espe = new Especialidad(rs.getString("tipo"), true);
                Prestador _prestador = new Prestador(rs.getInt("idPrestador"), rs.getString("apellidoP"), rs.getString("nombreP"), null, null, null, _espe, true);

                _orden.setIdOrden(rs.getInt("idOrden"));
                _orden.setCodigo(rs.getString("codigo"));
                _orden.setAfiliado(_afiliado);
                _orden.setPrestador(_prestador);
                _orden.setFecha(rs.getDate("fecha").toLocalDate());
                _orden.setFormaPago(rs.getString("formaPago"));
                _orden.setImporte(rs.getDouble("importe"));

                _lista.add(_orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Ordenes x fecha)Error al acceder a la tabla Ordenes." + ex.getMessage());
        }
        return _lista;
    } // Fin Listar de Ordenes x fecha

    public List<Orden> listarOrdenesXidAfiliado(int _id) { // Lista de ordenes x id de afiliado

        List<Orden> _lista = new ArrayList<>();

        try {
            String sql = "SELECT idOrden,codigo,a.idAfiliado,a.apellido AS apellidoA,a.nombre AS nombreA, p.idPrestador,p.apellido AS apellidoP,p.nombre AS nombreP,e.tipo, fecha,formaPago,importe\n"
                    + "FROM ordenes JOIN afiliados AS a ON (ordenes.id_afiliado = a.idAfiliado) JOIN prestadores AS p ON (p.idPrestador = ordenes.id_prestador) \n"
                    + "JOIN especialidades AS e ON (p.id_especialidad = e.idCodigo) WHERE id_afiliado = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Orden _orden = new Orden();
                Afiliado _afiliado = new Afiliado(rs.getInt("idAfiliado"), rs.getString("apellidoA"), rs.getString("nombreA"), null, null, null, true);
                Especialidad _espe = new Especialidad(rs.getString("tipo"), true);
                Prestador _prestador = new Prestador(rs.getInt("idPrestador"), rs.getString("apellidoP"), rs.getString("nombreP"), null, null, null, _espe, true);

                _orden.setIdOrden(rs.getInt("idOrden"));
                _orden.setCodigo(rs.getString("codigo"));
                _orden.setAfiliado(_afiliado);
                _orden.setPrestador(_prestador);
                _orden.setFecha(rs.getDate("fecha").toLocalDate());
                _orden.setFormaPago(rs.getString("formaPago"));
                _orden.setImporte(rs.getDouble("importe"));

                _lista.add(_orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Ordenes x id afiliado)Error al acceder a la tabla Ordenes." + ex.getMessage());
        }
        return _lista;
    } // Fin Listar de Ordenes x id de afiliado

    public List<Orden> listarOrdenesXidPrestador(int _id) { // Lista de ordenes x id de prestador

        List<Orden> _lista = new ArrayList<>();

        try {
            String sql = "SELECT idOrden,codigo,a.idAfiliado,a.apellido AS apellidoA,a.nombre AS nombreA, p.idPrestador,p.apellido AS apellidoP,p.nombre AS nombreP,e.tipo, fecha,formaPago,importe\n"
                    + "FROM ordenes JOIN afiliados AS a ON (ordenes.id_afiliado = a.idAfiliado) JOIN prestadores AS p ON (p.idPrestador = ordenes.id_prestador) \n"
                    + "JOIN especialidades AS e ON (p.id_especialidad = e.idCodigo) WHERE id_prestador = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, _id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Orden _orden = new Orden();
                Afiliado _afiliado = new Afiliado(rs.getInt("idAfiliado"), rs.getString("apellidoA"), rs.getString("nombreA"), null, null, null, true);
                Especialidad _espe = new Especialidad(rs.getString("tipo"), true);
                Prestador _prestador = new Prestador(rs.getInt("idPrestador"), rs.getString("apellidoP"), rs.getString("nombreP"), null, null, null, _espe, true);

                _orden.setIdOrden(rs.getInt("idOrden"));
                _orden.setCodigo(rs.getString("codigo"));
                _orden.setAfiliado(_afiliado);
                _orden.setPrestador(_prestador);
                _orden.setFecha(rs.getDate("fecha").toLocalDate());
                _orden.setFormaPago(rs.getString("formaPago"));
                _orden.setImporte(rs.getDouble("importe"));

                _lista.add(_orden);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "(Listar Ordenes x id prestador)Error al acceder a la tabla Ordenes." + ex.getMessage());
        }
        return _lista;
    } // Fin Listar de Ordenes x id de prestador

}
