/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;
import java.util.Scanner;

/**
 *
 * @author lucas
 * substituir valor de uma matriz
 *  while true, manu para reservar poltrona
 *  Verificar se poltrona já esta oculpada
 *  i = fila, j= poltrona
 */
public class aula1f_matrizes {
    public static void main(String[] args) {
        int poltrona[][] = {{1,2,3}, {4,5,6}};
        
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(" "+poltrona[i][j]+" ");
                
            }
            System.out.println("");
        }
        
        while (true) { 
            System.out.println("Menu");
            System.out.println("1 - Reservar Poltrona");
            System.out.println("2 - Mapa das poltronas");
            System.out.println("3 - Sair");
            
            int Selecionar = new Scanner(System.in).nextInt();
            switch (Selecionar) {
                case 1:
                    System.out.println("Informe a Poltrona: ");
                    int Poltrona = new Scanner(System.in).nextInt();
                    System.out.println("Informe a Fila:");
                    int Fila = new Scanner(System.in).nextInt();
                    
                    if (poltrona[Fila][Poltrona] == 0) {
                        
                    }
                    
                    break;
                case 2:
                    
                    break;
                    
                case 3:
                
                    break;
            }
        }
    }
}
