/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendorausuarios.modelo;

import java.io.Serializable;

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

    
    //metodos

    public boolean isPoderes() {
        return poderes;
    }






}
