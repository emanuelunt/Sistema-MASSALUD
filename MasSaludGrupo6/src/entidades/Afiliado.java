package entidades;

/**
 *
 * @author Nuri
 */
public class Afiliado {
    private int idAfiliado;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String telefono;
    private int dni;
    private boolean activo;
    
    //cosntructor vacio
    public Afiliado() {
    }
    //constructor con todos los atributos

    public Afiliado(int idAfiliado, String nombre, String apellido, String domicilio, String telefono, int dni, boolean activo) {
        this.idAfiliado = idAfiliado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
        this.activo = activo;
    }
    
    //constructor sin id afiliado
    
    public Afiliado(String nombre, String apellido, String domicilio, String telefono, int dni, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.dni = dni;
        this.activo = activo;
    }
    
    //getters and setters
    public String getDomicilio() {
        return domicilio;
    }

    
    public void setDomicilio(String domicilio) {    
        this.domicilio = domicilio;
    }

    public int getIdAfiliado() {
        return idAfiliado;
    }

    public void setIdAfiliado(int idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
// despues modificar to string segun lo que necesitemos mas adelante

    @Override
    public String toString() {
        return "Afiliado{" + "idAfiliado=" + idAfiliado + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", telefono=" + telefono + ", dni=" + dni + ", activo=" + activo + '}';
    }
    
    
    
}
