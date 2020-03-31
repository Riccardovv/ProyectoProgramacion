/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedoraProductos.modelo;

/**
 *
 * @author Ricardo
 */
public class Miscelanea extends Producto {
    
    private int peso;
    private boolean paraAdultos;

    public Miscelanea(int peso, boolean paraAdultos, double precio, String nombre, String Marca) {
        super(precio, nombre, Marca);
        this.peso = peso;
        this.paraAdultos = paraAdultos;
    }
    
    
    
}
