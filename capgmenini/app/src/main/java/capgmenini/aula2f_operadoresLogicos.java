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
            System.out.println("N�o comprar");
        }
        /*
        && (e)ambas as condi��es verdadeira
        || (ou) uma das condi��es verdadeiras
        ! (not)
        
        && - E: Avalia a primeira condi��o, se
                for falsa n�o avalia a pr�xima pois
                o resultado ser� sempre falso.
        
        & - avalia as duas condi��es
        
        || - : Avalia a primeira condi��o, se
               for true n�o avalia a pr�xima pois
               o resultado ser� sempre true.

        | - Avalia as duas condi��es
        
        java exige o else
        
        */
        
        
    }
}
