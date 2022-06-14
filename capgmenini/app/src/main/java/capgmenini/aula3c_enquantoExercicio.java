/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;
import java.util.Scanner;
/**
 *
 * @author lucas
 * Problema: Estudo de idades, Pergunta sobre idades, no final deve dizer quem é
 * a pessoa mais velha, a mais nova, frequência de menores de idade e média das idades
 * Observação: sem o uso de vetor
 */
public class aula3c_enquantoExercicio {
    public static void main(String[] args) {
        int maisVelho = 0;
        float somaIdades = 0;
        int quantosDeMenor = 0;
        int qtdEntrevistados = 1;
        
        while (qtdEntrevistados <= 5) {
            System.out.println("Qual sua idade?");
            int idadeInformada = new Scanner(System.in).nextInt();
            if(idadeInformada < 18)
                quantosDeMenor++;
            else if(idadeInformada > maisVelho)
                    maisVelho = idadeInformada;
            somaIdades = idadeInformada + somaIdades;
            qtdEntrevistados++;
        }
        System.out.println("Mais Velho: "+ maisVelho);
        System.out.println("Quantidade de menor: "+quantosDeMenor);
        System.out.println("Média: "+(somaIdades/5));
    }
}
