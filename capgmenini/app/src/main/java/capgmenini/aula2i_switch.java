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
public class aula2i_switch {
    public static void main(String[] args) {
        Scanner  selecionar = new Scanner(System.in);
        System.out.println("Menu."
                + "1 - Bom dia"
                + "2 - Boa tarde"
                + "3 - Boa noite");
        int numero = selecionar.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Bom dia!");
                break;
            
            case 2:
                System.out.println("Boa tarde!");
                break;
            case 3:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("número inválido");
        }
    }
}
