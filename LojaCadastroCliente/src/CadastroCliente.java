/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CadastroCliente {
    
    String nomeCliente;
    String emailCliente;
    String telefoneCliente;
    double valorFinal;
    int quantidade;
    String produto;
           
    public void infoCliente(){
    
    System.out.println("Cliente: " + nomeCliente + " email: " + emailCliente + " Telefone: " + telefoneCliente);
}
    
    public void Comprar(){
        
        System.out.println("O valor final da sua compra foi de: R$" + valorFinal);
    }
    
    public void InfoCompra(){
        
        System.out.println(nomeCliente + " realizou uma compra de " + quantidade + "x " + produto + " e ficou um valor final de: R$" + valorFinal);
    }
}
