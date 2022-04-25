package proyectocod;

public class Variables {
    private String nombre;
    private int cedula;
    private double edad;
    private int  dia;
    private int hora;

public Variables() {
      this.nombre = "nombre";
      this.cedula = 0;
      this.edad = 0.0;
      this.dia = 0;
      this.hora = 0;
}

public String getNombre() {
      return nombre;
}

public void setNombre(String nombre) {
      this.nombre = nombre;
}

public int getCedula() {
      return cedula;
}

public void setCedula(int cedula) {
      this.cedula = cedula;
}

public double getEdad() {
      return edad;
}

public void setEdad(double edad) {
      this.edad = edad;
}

public int getDia() {
      return dia;
}

public void setDia(int dia) {
      this.dia = dia;
}

public int getHora() {
      return hora;
}

public void setHora(int hora) {
      this.hora = hora;
}

}
