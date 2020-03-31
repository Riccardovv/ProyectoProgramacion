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
public class Comida extends Producto{
    private int mesConsumoPreferente;
    private int peso;

    public Comida(int mesConsumoPreferente, int peso, double precio, String nombre, String marca, int stock) {
        super(precio, nombre, marca, stock);
        this.mesConsumoPreferente = mesConsumoPreferente;
        this.peso = peso;
    }

    
    public int getMesConsumoPreferente() {
        return mesConsumoPreferente;
    }

    public void setMesConsumoPreferente(int mesConsumoPreferente) {
        this.mesConsumoPreferente = mesConsumoPreferente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    
@Override
    public String toString() {
        return super.toString()+"Comida{" + "mesConsumoPreferente=" + mesConsumoPreferente + ", peso=" + peso + '}';
    }

   

   

   
 
    
    
    
}
