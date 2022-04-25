package proyectocod;
public class doctores {

    private String nombre;
    private String cedula;
    private String edad;
    private String especialidad;

    public doctores() {
        this.nombre = "";
        this.cedula = "";
        this.edad = "";
        this.especialidad = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    
}
