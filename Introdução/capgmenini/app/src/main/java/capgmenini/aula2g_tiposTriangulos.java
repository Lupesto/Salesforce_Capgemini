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

        
        System.out.println("Identificador de triângulos");
        System.out.println("Lado 1: ");
        float lado1 = new Scanner(System.in).nextFloat();
        System.out.println("Lado 2: ");
        float lado2 = new Scanner(System.in).nextFloat();
        System.out.println("Lado 3: ");
        float lado3 = new Scanner(System.in).nextFloat();
        
        if(lado1 > lado2 + lado3 || lado2> lado1 + lado3 || lado3 > lado1 + lado3){
            System.out.println("Não é um triângulo");
        } else if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Equilátero. Todos os lados do triângulo são iguais");
        } else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("Isósceles. Dois lados do triângulo são iguais");
        } else{
            System.out.println("Escaleno. Todos os lados do triângulo são diferentes.");
        }
    }
}
