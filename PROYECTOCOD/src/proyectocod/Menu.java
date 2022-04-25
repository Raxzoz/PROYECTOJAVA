package proyectocod;
import javax.swing.JOptionPane;
public class Menu {

      Variables p = new Variables();
      Codigo n = new Codigo();
      public void Menu(){
           int a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al sistema de control de pacientes\n"
                        + "\n\n1 PARA INGRESAR PACIENTES Y AGENDAR CITA\n"
                        + "2 PARA VER TODOS LOS PACIENTES Y SUS CITAS\n"
                        + "3 BUSCAR UN PACIENTE\n"
                        + "4 EDITAR LA CITA DE UN PACIENTE\n"
                        + "5 Para Salir"

                , "Menu", JOptionPane.PLAIN_MESSAGE));

        switch (a) {
        case 1:
            
            JOptionPane.showMessageDialog(null, "INGRESE LOS DATOS DEL PACIENTE", "Datos",
                    JOptionPane.PLAIN_MESSAGE);
            n.agregar();
            Menu();
            break;
        case 2:
           
            Menu();
            break;
        case 3:
            
            Menu();
            break;
        case 4:
           
            Menu();
            break;
        case 5:
            
            Menu();
            break;
        default:
            JOptionPane.showMessageDialog(null, "ERROR ingrese un numero del 1 al 11", "Error",
                    JOptionPane.ERROR_MESSAGE);
      }
      
}
}
