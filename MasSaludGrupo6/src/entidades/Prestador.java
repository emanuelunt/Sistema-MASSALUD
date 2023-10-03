package entidades;

/**
 *
 * @author Nuri
 */
public class Prestador {
    private int idPrestador;
    private String apellido;
    private String nombre;    
    private int dni;
    private String domicilio;
    private String telefono;
    private Especialidad especialidad;
    private boolean activo;    
    
    //cosntructor vacio

    public Prestador() {
    }
     //constructor con todos los atributos

    public Prestador(int idPrestador, String apellido, String nombre, int dni, String domicilio, String telefono, Especialidad especialidad, boolean activo) {
        this.idPrestador = idPrestador;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }

    public Prestador(String apellido, String nombre, int dni, String domicilio, String telefono, Especialidad especialidad, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.activo = activo;
    }
   
    //getters and setters

    public int getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(int idPrestador) {
        this.idPrestador = idPrestador;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    // despues modificar to string segun lo que necesitemos mas adelante

    @Override
    public String toString() {
        return "Prestador{" + "idPrestador=" + idPrestador + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", domicilio=" + domicilio + ", telefono=" + telefono + ", especialidad=" + especialidad + ", activo=" + activo + '}';
    }    
    
}
