/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class aula3e_menu {
    public static void main(String[] args) {
        System.out.println(" 1- Trocar óleo"
                + " 2- trocar pneu"
                + " 3 - sair");
        Scanner var = new Scanner(System.in);
        int numero = var.nextInt();
        
        while (true) {            
            if (numero == 1) {
                System.out.println("Tocar óleo");
                break;
            } else if(numero == 2){
                System.out.println("Trocar pneu");
                break;
            } else if(numero == 3){
                System.out.println("Sair");
                break;
            }

            
        }
        
        
    }
}
