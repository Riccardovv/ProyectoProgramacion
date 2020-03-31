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

    public Comida(int mesConsumoPreferente, int peso, double precio, String nombre, String Marca) {
        super(precio, nombre, Marca);
        this.mesConsumoPreferente = mesConsumoPreferente;
        this.peso = peso;
    }

    

   

   

   
 
    
    
    
}
