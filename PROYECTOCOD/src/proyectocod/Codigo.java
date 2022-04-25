package proyectocod;
import javax.swing.JOptionPane;
public class Codigo {
      private Variables[] arr = new Variables[100];


      public void agregar() {

            for (int i = 0; i < 1; i++) {
                Variables p = new Variables();
                p.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del paciente: "));
                p.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cedula del paciente: ")));
                p.setEdad(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la edad del paciente: ")));
                p.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dia que quiere agendar su cita: ")));
                p.setHora(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la hora que quiere que se agende su cita: ")));
                arr[i] = p;
            }
        }
}
