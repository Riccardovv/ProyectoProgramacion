/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina.Expendorausuarios.modelo;

import MaquinaExpendedoraProductos.modelo.Producto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pc clase
 */
public class Administrador extends Usuario implements Serializable{
     //constantes
   

    //Atributos
    private boolean poderes;
   
    //Constructor
     public Administrador( Administrador otro) {
        super(otro);
        this.poderes =otro.isPoderes();
    }

   
    public Administrador(boolean poderes, String nombreUsuario, String nombre, String apellido, int edad) {
        super(nombreUsuario, nombre, apellido, edad);
        this.poderes = poderes;
    }
    //Getters y setters

    
    
    public boolean isPoderes() {
        return poderes;
    }
    //tostring
    @Override
    public String toString() {
        return super.toString()+"Administrador{" + "poderes=" + poderes + '}';
    }    
    
    //metodos

    public void rellenarStock(ArrayList <Producto> productos){
        
    }
    public float cambiarPrecio(ArrayList <Producto> productos, int posicion,int precioNuevo){
        float precio=0;
        float valorProducto = productos.get(posicion).getPrecio();
        
        
        return precio;
    }


    




}
