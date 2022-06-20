/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;

/**
 *
 * @author lucas
 */
public class aula1e_metodoBolha {
    public static void main(String[] args) {
        String alunos [] = {"Lucas","Marcelo","Patricia"};
        float notaAluno [][] = {{5.5f, 2.3f,9f}, {4.2f,1.3f,4.1f}, {3.4f,  5.6f,7.5f}};
        
  
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
            for (int j = 0; j < notaAluno.length; j++) {
                System.out.println(notaAluno[i][j]);    
            }
        }
        
        
        
    }
}
