/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class aula3g_loopForReverso {
    public static void main(String[] args) {
        System.out.println("Programa para identificar n�meros pares de um valor maior at� o menor");
        System.out.println("Informe valor inicial: ");
        float valorInicial = new Scanner(System.in).nextFloat();
        
        System.out.println("Informe valor Final: ");
        float valorFinal = new Scanner(System.in).nextFloat();
        
        if(valorInicial < valorFinal){
            System.out.println("Valor inicial � maior que o valor final. "
                    + "Rode o programa novamente e coloque valores v�lidos");
        }
        
        for (float i = valorInicial; i > valorFinal; i--) {
            if(i%2==0){ /*impress�o s� dos pares*/
                System.out.println(i);
            }
        }
        
    }
}
