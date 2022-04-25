package proyectocod;

import javax.swing.JOptionPane;

public class inventarioEmpleados {

    String matriz[][] = new String[1][1];
    empleadosClinica e = new empleadosClinica();

    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                e.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del empleado"));
                e.setCedula(JOptionPane.showInputDialog("Ingrese la cedula del empleado"));
                e.setEdad(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
                e.setCargo(JOptionPane.showInputDialog("Ingrese el cargo del empleado"));
                matriz[i][j] = e.getNombre() + e.getCedula() + e.getEdad() + e.getCargo();

            }
        }
    }

    public void mostrarMatriz() {
        String s = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                s += matriz[i][j] + " ";
            }
            s += "\n";
        }
    }
}
