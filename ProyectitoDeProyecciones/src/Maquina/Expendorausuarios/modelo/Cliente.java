
package Maquina.Expendorausuarios.modelo;

/**
 * Clase hija de los usuarios
 * @author Javier Rubio  
 * @see Usuario
 */
public class Cliente extends Usuario{
    //constantes
  
    //Atributos
    private float saldo;
    private int idCliente;
    
    //Constructor
    public Cliente(Cliente otro) {
        super(otro);
        this.saldo = otro.getSaldo();
        this.idCliente = otro.getIdCliente();
    }
    public Cliente(float saldo, int idCliente, String nombreUsuario, String nombre, String apellido, int edad) {
        super(nombreUsuario, nombre, apellido, edad);
        this.saldo = saldo;
        this.idCliente = idCliente;
    }
  
    
    //Getters y setters
    
    
    //metodos

    public float getSaldo() {
        return saldo;
    }

    public int getIdCliente() {
        return idCliente;
    }


 
}
