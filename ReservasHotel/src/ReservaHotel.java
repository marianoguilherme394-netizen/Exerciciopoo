/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ReservaHotel {
    
    String nome;
    String dataCheckIn;
    int diasHospedado;
    double valorDiario;
    
    public void calcularTotal(){
    
    double total = valorDiario * diasHospedado;
    
    System.out.println("O total sera de R$" + total);
}
    
    public void exibirHospede(){
        
       System.out.println("Nome: " + nome);
       System.out.println("Data do check-in: " + dataCheckIn);
       System.out.println("Dias hospedados: " + diasHospedado);
       System.out.println("Valor diario do quarto: R$" + valorDiario);
    }
    
    
}
