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
public class Productos {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Productos(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;

    }

    public double getPrecio() {
        return precio;

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error, no puede haber precio negativo o cero");
        }
    }
    

    public void setCantidad(int cantidad) {

        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error, no puede haber cantidad negativa o cero");
        }

    }


}


    

