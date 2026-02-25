/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ReservaHotelMain {
    public static void main (String args []){
        
        ReservaHotel hospede1 = new ReservaHotel();
        
        hospede1.nome = "Guilherme Ferreira Mariano";
        hospede1.valorDiario = 400.00;
        hospede1.diasHospedado = 5;
        hospede1.dataCheckIn = "22/02/2026";
        
        hospede1.exibirHospede();
        hospede1.calcularTotal();
    }
    
}
