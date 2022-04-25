package proyectocod;

import javax.swing.JOptionPane;

public class sMenu {

    Clientes c = new Clientes();
    datosDoctores d = new datosDoctores();
    inventarioEmpleados i = new inventarioEmpleados();
    inventarioMedico im = new inventarioMedico();

    public void Menu() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido al sistema de control de pacientes\n"
                        + "\n\n1 PARA INGRESAR PACIENTES Y AGENDAR CITA\n"
                        + "2 PARA VER TODOS LOS PACIENTES Y SUS CITAS\n"
                        + "3 BUSCAR UN PACIENTE\n"
                        + "4 EDITAR LA CITA DE UN PACIENTE\n"
                        + "5 REGISTRAR UN DOCTOR\n"
                        + "6 VER TODOS LOS DOCTORES\n" +
                        "7 REGISTAR UTENCILIOS MEDICOS\n" +
                        "8 VER TODOS LOS UTENCILIOS MEDICOS\n" +
                        "9 REGISTRAR UN EMPLEADO\n" +
                        "10 VER TODOS LOS EMPLEADOS\n"
                        + "11 Para Salir"

                , "Menu", JOptionPane.PLAIN_MESSAGE));

        switch (a) {
            case 1:
                c.agregarClientes();
                Menu();
                break;
            case 2:
                c.mostrarClientes();
                Menu();
                break;
            case 3:
                c.buscarCliente();
                Menu();
                break;
            case 4:
                c.editarCliente();
                Menu();
                break;
            case 5:
                d.pedirDatos();
                Menu();
                break;
            case 6:
                d.mostrarDatos();
                Menu();
                break;
            case 7:
                im.llenarInventario();
                Menu();
                break;

            case 8:
                im.mostrarInventario();
                Menu();
                break;
            case 9:
                i.llenarMatriz();
                Menu();
                break;
            case 10:
                i.mostrarMatriz();
                Menu();
                break;
            case 11:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR ingrese un numero del 1 al 11", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }

    }
}
