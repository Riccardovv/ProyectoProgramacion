/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedoraProductos.modelo;

import MaquinaExpendorausuarios.modelo.Cliente;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ricardo
 */
public abstract class Producto implements Comparable, Serializable, Comprable{
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

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.Marca, other.Marca)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre=" + nombre + ", Marca=" + Marca + ", stock=" + stock + '}';
    }
    
    @Override
    public boolean saldoSuficiente(Cliente c){
        
        return c.getSaldo()>this.precio;
    }
    
    @Override
    public boolean hayStock(){
        return this.stock>0;
        }
    
    
    
    
}
