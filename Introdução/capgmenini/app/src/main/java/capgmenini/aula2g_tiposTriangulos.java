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
public class aula2g_tiposTriangulos {
    public static void main(String[] args) {

        
        System.out.println("Identificador de tri�ngulos");
        System.out.println("Lado 1: ");
        float lado1 = new Scanner(System.in).nextFloat();
        System.out.println("Lado 2: ");
        float lado2 = new Scanner(System.in).nextFloat();
        System.out.println("Lado 3: ");
        float lado3 = new Scanner(System.in).nextFloat();
        
        if(lado1 > lado2 + lado3 || lado2> lado1 + lado3 || lado3 > lado1 + lado3){
            System.out.println("N�o � um tri�ngulo");
        } else if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equil�tero. Todos os lados do tri�ngulo s�o iguais");
        } else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Is�sceles. Dois lados do tri�ngulo s�o iguais");
        } else{
            System.out.println("Escaleno. Todos os lados do tri�ngulo s�o diferentes.");
        }
    }
}
