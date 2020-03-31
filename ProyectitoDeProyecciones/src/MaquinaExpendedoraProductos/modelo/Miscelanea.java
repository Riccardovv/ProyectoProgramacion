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

    public Miscelanea(int peso, boolean paraAdultos, double precio, String nombre, String Marca, int stock) {
        super(precio, nombre, Marca, stock);
        this.peso = peso;
        this.paraAdultos = paraAdultos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isParaAdultos() {
        return paraAdultos;
    }

    public void setParaAdultos(boolean paraAdultos) {
        this.paraAdultos = paraAdultos;
    }
    
    
    
}
