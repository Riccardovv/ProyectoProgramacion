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
public class Bebida extends Producto{
    private int volumen;
    private boolean tieneAlcohol;

    public Bebida(int volumen, boolean tieneAlcohol, double precio, String nombre, String Marca, int stock) {
        super(precio, nombre, Marca, stock);
        this.volumen = volumen;
        this.tieneAlcohol = tieneAlcohol;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isTieneAlcohol() {
        return tieneAlcohol;
    }

    public void setTieneAlcohol(boolean tieneAlcohol) {
        this.tieneAlcohol = tieneAlcohol;
    }

     
    
}
