/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedoraProductos.modelo;

import java.io.Serializable;

/**
 *
 * @author Ricardo
 */
public abstract class Producto implements Comparable, Serializable{
    private double precio;
    private String nombre;
    private String Marca;
    private int stock;

    public Producto(double precio, String nombre, String Marca, int stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.Marca = Marca;
        this.stock=stock;
    }
   
    
    @Override
    public int compareTo(Object o){
        
        try {
            Producto pAux=(Producto)o;
        } catch (Exception e) {
            //mostraria un error con el jframe              
        }
        
        Producto pAux=(Producto)o;
        
        if (this==pAux) {
            return 0;
        }else if(this.precio>pAux.precio){
            return -1;
        }else{
            return 0;
        }
    
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
    
}
