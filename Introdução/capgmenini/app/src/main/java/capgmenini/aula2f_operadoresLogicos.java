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
public class aula2f_operadoresLogicos {
    
    public static void main(String[] args) {
        int valorCarro;
        String cor;
        System.out.println("Valor Carro encontrado: ");
        valorCarro = new Scanner(System.in).nextInt();
        
        System.out.println("Cor carro encontrado: ");
        cor = new Scanner(System.in).nextLine();
        
        if( valorCarro >= 300 | cor == "branco"){
            System.out.println("Comprar carro");
        } else{
            System.out.println("Não comprar");
        }
        /*
        && (e)ambas as condições verdadeira
        || (ou) uma das condições verdadeiras
        ! (not)
        
        && - E: Avalia a primeira condição, se
                for falsa não avalia a próxima pois
                o resultado será sempre falso.
        
        & - avalia as duas condições
        
        || - : Avalia a primeira condição, se
               for true não avalia a próxima pois
               o resultado será sempre true.

        | - Avalia as duas condições
        
        java exige o else
        
        */
        
        
    }
}
