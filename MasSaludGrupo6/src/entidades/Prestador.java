package entidades;

/**
 *
 * @author Nuri
 */
public class Prestador {
    private int idPrestador;
    private String nombre;
    private String apellido;
    private int dni;
    private boolean activo;
    private Especialidad especialidad;
    
    //cosntructor vacio

    public Prestador() {
    }
     //constructor con todos los atributos

    public Prestador(int idPrestador, String nombre, String apellido, int dni, boolean activo, Especialidad especialidad) {
        this.idPrestador = idPrestador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.activo = activo;
        this.especialidad = especialidad;
    }
    //constructor sin id prestador

    public Prestador(String nombre, String apellido, int dni, boolean activo, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.activo = activo;
        this.especialidad = especialidad;
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
        return "Prestador{" + "idPrestador=" + idPrestador + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", activo=" + activo + ", especialidad=" + especialidad + '}';
    }
    
}
