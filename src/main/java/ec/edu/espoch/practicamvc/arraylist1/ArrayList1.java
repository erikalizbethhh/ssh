/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.practicamvc.arraylist1;

import Producto.Cliente;
import Producto.Producto;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ArrayList1 {

    public static void main(String[] args) {

        Producto productouno = new Producto("leche", 1.50);
        Producto productodos = new Producto("queso", 2.50);
        Producto productotres = new Producto("arroz", 9.50);
        Producto productocuatro = new Producto("pan", 1.00);
        Producto productocinco = new Producto("sal", 0.50);

        Cliente clienteuno = new Cliente("erika");
        clienteuno.agregarProducto(productouno);
        clienteuno.agregarProducto(productodos);

        Cliente clientedos = new Cliente("Zoe");
        clientedos.agregarProducto(productotres);
        clientedos.agregarProducto(productocuatro);

        Cliente clientetres = new Cliente("Jhonn");
        clientetres.agregarProducto(productouno);
        clientetres.agregarProducto(productocinco);

        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(clienteuno);
        clientes.add(clientedos);
        clientes.add(clientetres);

        for (Cliente cliente : clientes) {
            System.out.println(clientes);
        }

    }
}
