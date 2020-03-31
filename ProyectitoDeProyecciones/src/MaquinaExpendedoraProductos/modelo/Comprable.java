/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaquinaExpendedoraProductos.modelo;
import MaquinaExpendorausuarios.modelo.Cliente;
/**
 *
 * @author Ricardo
 */
public interface Comprable {
    
    public boolean saldoSuficiente(Cliente c);
    public boolean hayStock();
    
    
}
