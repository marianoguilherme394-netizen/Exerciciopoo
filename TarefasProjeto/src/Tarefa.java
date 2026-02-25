/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Tarefa {
    
    String nome;
    String descrição;
    String prazoConclusão;
    
    public void InfoTarefa(){
        System.out.println("Nome da Tarefa: " + nome);
        System.out.println("Descricao da Tarefa: " + descrição);
    }
    
    public void ConcluirTarefa(){
        
        if(prazoConclusão=="25/03/2026"){
            System.out.println("Status da tarefa: Concluida");
        }
        else{
            System.out.println("Status da tarefa: Pendente");
        }
        
    }
    
}
