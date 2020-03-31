
package Maquina.Expendorausuarios.modelo;

import java.util.Objects;

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
    /**
     * Constructor de copia
     * @param otro 
     */
    public Usuario(Usuario otro) {
        this.nombreUsuario = otro.getNombreUsuario();
        this.nombre = otro.getNombre();
        this.apellido = otro.getApellido();
        this.edad = otro.getEdad();
    }
    /**
     * Constructor
     * @param nombreUsuario El nombre de usuario
     * @param nombre El nombre del usuario 
     * @param apellido El apellido del usuario
     * @param edad  La edad del usuario
     */
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

    //toString

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    //Equals
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
        final Usuario other = (Usuario) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
    

    

}
