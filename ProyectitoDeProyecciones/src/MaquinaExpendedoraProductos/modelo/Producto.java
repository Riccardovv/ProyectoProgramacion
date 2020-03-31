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

    public Producto(double precio, String nombre, String Marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.Marca = Marca;
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
    
    
    
    
}
