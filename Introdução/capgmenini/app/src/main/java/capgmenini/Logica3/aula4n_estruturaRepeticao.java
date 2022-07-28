/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class aula4n_estruturaRepeticao {
    public static void main(String[] args) {
        while (true) {            
            System.out.println("Informe um numero: ");
            Scanner leitor = new Scanner(System.in);
            int numero = leitor.nextInt();
            if (numero == 0){
                System.out.println("Valor é ZERO");
            } else if(numero > 0 ){
                System.out.println("Valor é positivo");
                        
            } else{
                System.out.println("Valor é negativo");
            }
                   
            
        }
        
        
    }
}
