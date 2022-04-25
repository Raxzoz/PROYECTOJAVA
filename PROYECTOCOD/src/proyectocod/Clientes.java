package proyectocod;

import javax.swing.JOptionPane;

public class Clientes {
    datosClientes[] c = new datosClientes[100];

    public void agregarClientes() {

        for (int i = 0; i < 3; i++) {
            datosClientes d = new datosClientes();
            d.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del paciente"));
            d.setCedula(JOptionPane.showInputDialog("Ingrese la cedula del paciente"));
            d.setEdad(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
            d.setDia(JOptionPane.showInputDialog("Ingrese el dia de la cita"));
            d.setHora(JOptionPane.showInputDialog("Ingrese la hora de la citas"));
            c[i] = d;
        }
    }

    public void mostrarClientes() {
        for (int i = 0; i < c.length; i++) {
            JOptionPane.showMessageDialog(null, "Nombre: " + c[i].getNombre() + "\n"
                    + "Cedula: " + c[i].getCedula() + "\n"
                    + "Edad: " + c[i].getEdad() + "\n"
                    + "Dia: " + c[i].getDia() + "\n"
                    + "Hora: " + c[i].getHora() + "\n");
        }
    }

    public void buscarCliente() {
        String buscar = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
        for (int i = 0; i < c.length; i++) {
            if (c[i].getNombre().equals(buscar)) {
                JOptionPane.showMessageDialog(null, "Nombre: " + c[i].getNombre() + "\n"
                        + "Cedula: " + c[i].getCedula() + "\n"
                        + "Edad: " + c[i].getEdad() + "\n"
                        + "Dia: " + c[i].getDia() + "\n"
                        + "Hora: " + c[i].getHora() + "\n");
            }
        }
    }

  // editar cliente
    public void editarCliente() {
        String buscar = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
        for (int i = 0; i < c.length; i++) {
            if (c[i].getNombre().equals(buscar)) {
                c[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del paciente"));
                c[i].setCedula(JOptionPane.showInputDialog("Ingrese la cedula del paciente"));
                c[i].setEdad(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
                c[i].setDia(JOptionPane.showInputDialog("Ingrese el dia de la cita"));
                c[i].setHora(JOptionPane.showInputDialog("Ingrese la hora de la citas"));
            }
        }
    }

}
