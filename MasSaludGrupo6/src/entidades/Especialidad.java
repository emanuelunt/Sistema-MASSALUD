package entidades;

/**
 *
 * @author Nuri
 */
public class Especialidad {
    
    private int idEspecialidad;
    private String especialidad;
    
    //cosntructor vacio

    public Especialidad() {
    }
     //constructor con todos los atributos

    public Especialidad(int idEspecialidad, String especialidad) {
        this.idEspecialidad = idEspecialidad;
        this.especialidad = especialidad;
    }
    //constructor sin id especialidad

    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //getters and setters

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    // despues modificar to string segun lo que necesitemos mas adelante

    @Override
    public String toString() {
        return "Especialidad{" + "idEspecialidad=" + idEspecialidad + ", especialidad=" + especialidad + '}';
    }
    
}
