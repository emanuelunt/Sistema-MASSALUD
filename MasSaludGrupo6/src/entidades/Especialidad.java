package entidades;

/**
 *
 * @author Nuri
 */
public class Especialidad {
    
    private int idCodigo;
    private String tipo;
    private boolean activo;
    
    //cosntructor vacio

    public Especialidad() {
    }
     //constructor con todos los atributos

    public Especialidad(int idCodigo, String tipo, boolean activo) {
        this.idCodigo = idCodigo;
        this.tipo = tipo;
        this.activo = activo;
    }  

    public Especialidad(String tipo, boolean activo) {
        this.tipo = tipo;
        this.activo = activo;
    }   

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "idCodigo=" + idCodigo + ", tipo=" + tipo + ", activo=" + activo + '}';
    } 
    
}
