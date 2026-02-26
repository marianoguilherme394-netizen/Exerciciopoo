/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Banco {
    
    String nome;
    int numeroConta;
    double saldo;
    
    public void depositar(double valor){
        saldo = saldo + valor;
        
        System.out.println(nome + ": Deposito de R$" + valor + " realizado com sucesso");
    }
    
    public void sacar (double valor){
        if(saldo>=valor){
            saldo = saldo - valor;
            
         System.out.println(nome + ": Valor de R$" + valor + " resgatado com sucesso.");   
        }
        else{
            System.out.println(nome + ": Saque negado, saldo insuficiente");
        }
    }
    
    public void tranferir(Banco destino, double valor){
        if(saldo>= valor){
            saldo = saldo - valor;
            destino.saldo = destino.saldo + valor;
            
            System.out.println(nome + ": Trasferencia de R$" + valor + " para " + destino.nome + " realizada com sucesso");
        }
        else{
            System.out.println(nome + ": Transferencia não foi realizada devido ao saldo insuficiente");
        }
          
    }
    
    public void infodocliente(){
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }
    
}
