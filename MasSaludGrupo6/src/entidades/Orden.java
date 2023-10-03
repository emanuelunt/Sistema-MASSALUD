package entidades;

import java.time.LocalDate;

/**
 *
 * @author Nuri
 */
public class Orden {
    private int idOrden;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private Afiliado idAfiliado;
    private Prestador prestador;
    
    //cosntructor vacio

    public Orden() {
    }
    //constructor sin id especialidad

    public Orden(LocalDate fecha, String formaPago, double importe, Afiliado idAfiliado, Prestador prestador) {
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.prestador = prestador;
    }
    //constructor con todos los atributos

    public Orden(int idOrden, LocalDate fecha, String formaPago, double importe, Afiliado idAfiliado, Prestador prestador) {
        this.idOrden = idOrden;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.idAfiliado = idAfiliado;
        this.prestador = prestador;
    }
    //getters and setters

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Afiliado getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(Afiliado idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }
    // despues modificar to string segun lo que necesitemos mas adelante

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", idAfiliado=" + idAfiliado + ", prestador=" + prestador + '}';
    }
    
}
