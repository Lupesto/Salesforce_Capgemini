/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;
import java.util.Scanner;
/**
 *
 * @author lucas
 * programa:
 * Corre��o avalia��o
 * Fun��o popula um vetor (gabarito da prova)
 * Input das respostas do aluno
 * output da nota 
 */
public class aula2e_CharOuString {
    public static float calcularNota(char[] respostas){
        char gabarito[] = {'a','a','d','c','e' };
        float nota = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i]==gabarito[i])
                nota = nota + 1;
            
        }
        System.out.println(nota);
        return nota;
    }
    
    public static void main(String[] args) {
        char respostaAlunoA[] = {'a','b','e','c','e'} ;
        calcularNota(respostaAlunoA);
       
        
        // '<- ap�strofo para char, " <- aspas para String 
    }
}
