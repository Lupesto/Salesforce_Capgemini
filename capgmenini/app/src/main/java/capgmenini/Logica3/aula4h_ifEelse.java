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
public class aula4h_ifEelse {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner nome = new Scanner(System.in);
        
        if (nome.next() == "lucas") {
            System.out.println("Bem vindo");
        } else {
            System.out.println("Nome inválido");
        }
        
    }
}
