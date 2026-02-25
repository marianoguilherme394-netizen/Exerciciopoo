/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class VeiculoMain {
    public static void main (String [] args){
        
        Veiculo veiculo1 = new Veiculo();
        
        veiculo1.modelo = "Ferrari 458 Italia";
        veiculo1.valorDiario = 5200.00;
        veiculo1.diasAlugados = 5;
        
        
        veiculo1.InfoVeiculo();
        veiculo1.Calcular();
    }
    
}
