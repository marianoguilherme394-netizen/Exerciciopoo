/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Circulo {
    
    int raio;
    double pi;
    
    public void InfoCirculo(){
        System.out.println("O valor do raio do circulo e: " + raio);
        System.out.println("O valor de pi e: " + pi);
    }
    
    public void CalcularArea(){
    
    double area = pi*raio*raio;
    
    System.out.println("A area do circulo e: " + area);
}
    
    public void CalcularPerimetro(){
        
        double perimetro = 2*pi*raio;
        
        System.out.println("O perimetro do circulo e: " + perimetro);
    }
    
}
