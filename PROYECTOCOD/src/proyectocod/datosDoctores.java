package proyectocod;
import javax.swing.JOptionPane;

public class datosDoctores {

    doctores d = new doctores();

    public void pedirDatos() {
        d.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del doctor: "));
        d.setCedula(JOptionPane.showInputDialog("Ingrese la cedula del doctor: "));
        d.setEdad(JOptionPane.showInputDialog("Ingrese la edad del doctor: "));
        d.setEspecialidad(JOptionPane.showInputDialog("Ingrese la especialidad del doctor: "));

    }
    
    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + d.getNombre() + "\n" + "Cedula: " + d.getCedula() + "\n"
                + "Edad: " + d.getEdad() + "\n" + "Especialidad: " + d.getEspecialidad());
    }

}
