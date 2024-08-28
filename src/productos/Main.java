/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author YAMI_
 */
public class Main {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Productos productos = new Productos("Coca-Cola",3000.00,2);
        
        System.out.println("Nombre: " + productos.getNombre());
        System.out.println("Precio: " + productos.getPrecio());
        System.out.println("Cantidad: " + productos.getCantidad());
        
        productos.setNombre("Pepsi");
        System.out.println("Nuevo nombre: " + productos.getNombre());
        productos.setPrecio(2500.00);
        System.out.println("Precio: "+ productos.getPrecio());
        productos.setCantidad(4);
        System.out.println("Cantidad: "+ productos.getCantidad());
        
        
        //Precio y cantidad negativos
        productos.setPrecio(-2500.00);
        System.out.println("Precio: "+ productos.getPrecio());
        productos.setCantidad(-4);
        System.out.println("Cantidad: "+ productos.getCantidad());
        
        }
}   

