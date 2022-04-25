package proyectocod;

public class empleadosClinica {

    private String nombre;
    private String cedula;
    private String edad;
    private String cargo;

    public empleadosClinica() {
        this.nombre = "";
        this.cedula = "";
        this.edad = "";
        this.cargo = "";
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
