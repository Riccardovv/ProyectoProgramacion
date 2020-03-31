/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendorauUsarios.modelo;

/**
 * Clase padre de los usuarios
 * @author Javier Rubio  
 * @version 1.0
 */
public abstract class  Usuario  {

    //constantes
  
    //Atributos
    private String nombreUsuario;
    private String nombre;
    private String apellido;
    private int edad;
    //Constructor
    public Usuario(Usuario otro) {
        this.nombreUsuario = otro.getNombreUsuario();
        this.nombre = otro.getNombre();
        this.apellido = otro.getApellido();
        this.edad = otro.getEdad();
    }
    public Usuario(String nombreUsuario, String nombre, String apellido, int edad) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters y setters
    

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    
    

    

}
