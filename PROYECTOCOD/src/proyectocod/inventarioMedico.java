package proyectocod;

import javax.swing.JOptionPane;

public class inventarioMedico {

    String[] herramientasmedicas = new String[2];
    herramientasMedicas h = new herramientasMedicas();

    public void llenarInventario() {
        for (int i = 0; i < herramientasmedicas.length; i++) {
            h.setMarca(JOptionPane.showInputDialog("Ingrese la marca de la herramienta"));
            h.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la herramienta"));
            h.setPrecio(JOptionPane.showInputDialog("Ingrese el precio de la herramienta"));
            h.setCantidad(JOptionPane.showInputDialog("Ingrese la cantidad de herramientas medicas"));
            h.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripcion de la herramienta"));
            herramientasmedicas[i] = h.getMarca() + " " + h.getNombre() + " " + h.getPrecio() + " " + h.getCantidad()
                    + " " + h.getDescripcion();
        }
    }

    public void mostrarInventario() {
        for (int i = 0; i < herramientasmedicas.length; i++) {
            JOptionPane.showMessageDialog(null, herramientasmedicas[i]);
        }
    }

}
