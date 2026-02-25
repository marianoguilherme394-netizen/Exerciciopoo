/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class CirculoMain {
    
    public static void main (String [] args){
        
        Circulo circulo1 = new Circulo();
        
        circulo1.pi = 3.14; 
        circulo1.raio = 3;
        
        circulo1.InfoCirculo();
        circulo1.CalcularArea();
        circulo1.CalcularPerimetro();
    }
    
}
