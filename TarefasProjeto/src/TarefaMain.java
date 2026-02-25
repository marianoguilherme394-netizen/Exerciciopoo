/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TarefaMain {
    public static void main (String [] args){
        
        Tarefa tarefa1 = new Tarefa();
        
        tarefa1.nome = "Documentacao";
        tarefa1.descrição = "Fazer a documentacao completa do projeto.";
        tarefa1.prazoConclusão = "27/03/2026";
        
        tarefa1.InfoTarefa();
        tarefa1.ConcluirTarefa();
        
    }
    
}
