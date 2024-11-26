package Producto;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cliente {

    //mi primer tarea
    private String nombreapellido;
    private ArrayList<Producto> compras;

   public Cliente(String nombre) {
        this.nombreapellido = nombreapellido;
        this.compras = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        compras.add(producto);
    }

    public String getNombre() {
        return nombreapellido;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombreapellido + ", Compras: " + compras;

    }
}
