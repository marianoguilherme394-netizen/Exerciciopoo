/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Retangulo {
    
    int largura;
    int altura;
    
    public void InfoRetangulo(){
        
        System.out.println("Largura do retangulo e: " + largura);
        System.out.println("Altura do retangulo e: " + altura);
    }
    
    public void CalcularArea(){
        
        int area  = largura*altura;
        
        System.out.println("A area do retangulo e: " + area);
    }
    
    public void CalcularPerimetro(){
        
        int perimetro = 2*(largura+altura);
        
        System.out.println("O perimetro do retangulo e: " + perimetro);
    }
        
        
        
    
}
