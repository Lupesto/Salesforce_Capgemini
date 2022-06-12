/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;

/**
 *
 * @author lucas
 */
public class aula2d_elif {
        public static void main(String[] args) {
        float nota1 = 4.2f;
        float nota2 = 6.6f;
        float nota3 = 3.5f;
        float nota4 = 5.8f;
        
        float media;
        
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Média do aluno: "+media);
        if (media > 5) {
            System.out.println("Passou");
        
        } else if(media==5){
            System.out.println("Passou raspando");
        } else if(media < 5) {
            System.out.println("Não passou");
        } else{
            System.out.println("Erro");
        }
    }
}
