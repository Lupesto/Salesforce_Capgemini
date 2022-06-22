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
public class aula4m_while {
    public static void main(String[] args) {
        int totalProdutos = 5;
        
        Scanner input = new Scanner(System.in);
        while(totalProdutos > 0 ){
            System.out.println("Nome produto: ");
            String produto = input.next();
            System.out.println(produto);
            
            totalProdutos--;
        }
        
        
    }
}
