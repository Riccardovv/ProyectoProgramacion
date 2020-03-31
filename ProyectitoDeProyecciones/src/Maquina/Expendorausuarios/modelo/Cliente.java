
package Maquina.Expendorausuarios.modelo;

import MaquinaExpendedoraProductos.modelo.Producto;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase hija de los usuarios
 * @author Javier Rubio  
 * @see Usuario
 */
public class Cliente extends Usuario implements Serializable{
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
    
    public float getSaldo() {
        return saldo;
    }

    public int getIdCliente() {
        return idCliente;
    } 
    
   
    
    //ToString

    @Override
    public String toString() {
        return super.toString()+"Cliente{" + "saldo=" + saldo + ", idCliente=" + idCliente + '}';
    }

    //equals
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
        final Cliente other = (Cliente) obj;
        if (Float.floatToIntBits(this.saldo) != Float.floatToIntBits(other.saldo)) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
    
    
    //metodos

    public void incrementarSaldo(int dinero){
        saldo=saldo+dinero;
    }
    
    public void comprar (ArrayList <Producto> productos ,int posicion) {
        float valorProducto = productos.get(posicion).getPrecio();
        float saldo = getSaldo();
        if(valorProducto<getSaldo()){
            System.out.println("Precio insuficiente");
            
        }else{
            saldo = saldo - valorProducto;
        }
        
    }
    

 
}
