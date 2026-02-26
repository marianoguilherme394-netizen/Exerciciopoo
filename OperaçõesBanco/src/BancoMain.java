/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class BancoMain {
    public static void main(String [] args){
        
        Banco cliente1 = new Banco();
        Banco cliente2 = new Banco();
        
        cliente1.nome = "Guilherme";
        cliente1.numeroConta = 5060;
        cliente1.saldo = 2900.00;
        
        cliente2.nome = "Isabella";
        cliente2.numeroConta = 2367;
        cliente2.saldo = 5300.00;
        
        cliente2.infodocliente();
        cliente1.infodocliente();
        cliente1.sacar(500);
        cliente1.depositar(300);
        cliente2.tranferir(cliente1, 600);
        
        
        
        
        
    }
    
}
