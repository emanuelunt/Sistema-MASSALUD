package entidades;

import java.time.LocalDate;

/**
 *
 * @author Nuri
 */
public class Orden {
    private int idOrden;
    private String codigo;
    private Afiliado afiliado;
    private Prestador prestador;
    private LocalDate fecha;
    private String formaPago;
    private double importe;
    private boolean activo;
    
    
    
    //cosntructor vacio

    public Orden() {
    }
    //constructor sin id especialidad

    public Orden(int idOrden, String codigo, Afiliado afiliado, Prestador prestador, LocalDate fecha, String formaPago, double importe, boolean activo) {
        this.idOrden = idOrden;
        this.codigo = codigo;
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.activo = activo;
    }

    public Orden(String codigo, Afiliado afiliado, Prestador prestador, LocalDate fecha, String formaPago, double importe, boolean activo) {
        this.codigo = codigo;
        this.afiliado = afiliado;
        this.prestador = prestador;
        this.fecha = fecha;
        this.formaPago = formaPago;
        this.importe = importe;
        this.activo = activo;
    }
        
    //getters and setters

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
        
    // despues modificar to string segun lo que necesitemos mas adelante

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", codigo=" + codigo + ", afiliado=" + afiliado + ", prestador=" + prestador + ", fecha=" + fecha + ", formaPago=" + formaPago + ", importe=" + importe + ", activo=" + activo + '}';
    }

    

    
    
}
