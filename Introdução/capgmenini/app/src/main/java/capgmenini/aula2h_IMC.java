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
public class aula2h_IMC {
    public static void main(String[] args) {
        
        System.out.println("Informe seu peso: ");
        float peso = new Scanner(System.in).nextFloat();
        
        System.out.println("Informe sua altura: ");
        float altura = new Scanner(System.in).nextFloat();
        
        float imc = peso/(altura*altura);
        System.out.println(imc);
        /* adicionar tabela IMC aqui */
    }
}
