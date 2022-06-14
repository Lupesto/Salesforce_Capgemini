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
public class aula3d_loopInfinito {
    public static void main(String[] args) {
        while (true) {    
            System.out.println("Digite 1 para repetir e 2 para parar: ");
            int Selecionar = new Scanner(System.in).nextInt();
            switch (Selecionar) {
                case 1:
                    System.out.println("Repetição");
                    
                case 2:
                    break;
            }
            /** Quebrar repetição while True **/
        }
    }
}
