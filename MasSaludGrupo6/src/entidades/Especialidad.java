package entidades;

/**
 *
 * @author Nuri
 */
public class Especialidad {
    
    private int idCodigo;
    private String tipo;
    
    //cosntructor vacio

    public Especialidad() {
    }
     //constructor con todos los atributos

    public Especialidad(int idCodigo, String tipo) {
        this.idCodigo = idCodigo;
        this.tipo = tipo;
    }

    public Especialidad(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "Especialidad{" + "idCodigo=" + idCodigo + ", tipo=" + tipo + '}';
    }

    
    
}
