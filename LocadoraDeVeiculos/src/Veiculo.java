/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Veiculo {
    
    String modelo;
    double valorDiario;
    int diasAlugados;
    
    public void InfoVeiculo(){
        
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da diaria: R$" + valorDiario);
        System.out.println("Dias alugado: " + diasAlugados);
    }
    
    public void Calcular(){
        
        double valorTotal = diasAlugados * valorDiario;
        
        System.out.println("Valor total: R$" + valorTotal);
    }
    
}
