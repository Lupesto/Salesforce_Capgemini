/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;
import java.util.Scanner;
/**
 *
 * @author lucas
 * algoritimo que recebe um valor e diga se está no intervalo de 100 a 200
 */
public class aula4j_intervalo {
    public static void main(String[] args) {

        
        while (true) { 
            System.out.println("Informe um valor: ");
            Scanner leitor = new Scanner(System.in);
            int numero;
            
            numero = leitor.nextInt();
            if (numero >= 100 && numero <= 200){
                System.out.println("Valor está entre 100 e 200");
            } else{
                System.out.println("Valor não está entre 100 e 200");
            }
        } 
    }
}
