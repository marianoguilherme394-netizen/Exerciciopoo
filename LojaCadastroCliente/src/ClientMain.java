/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ClientMain {
    public static void main (String [] args){
        
        CadastroCliente cliente1 = new CadastroCliente();
        
        cliente1.nomeCliente = "Guilherme Ferreira Mariano";
        cliente1.emailCliente = "emaildoCliente@gmail.com";
        cliente1.telefoneCliente = "(11) 94632-8603";
        cliente1.produto = "Tenis Nike";
        cliente1.quantidade = 2;
        cliente1.valorFinal = 989.99;
        
        cliente1.infoCliente();
        cliente1.Comprar();
        cliente1.InfoCompra();
    }
    
}
