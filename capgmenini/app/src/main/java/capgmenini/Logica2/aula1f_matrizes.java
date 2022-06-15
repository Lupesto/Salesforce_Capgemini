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
        int poltrona[][] = {{0,0,0}, {0,0,0}};
        
        
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(" "+poltrona[i][j]+" ");
                
            }
            System.out.println("");
        }
        
        loop: while (true) { /** criei uma etiqueta para quebra-lo no case 3**/
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1 - Reservar Poltrona");
            System.out.println("2 - Mapa das poltronas");
            System.out.println("3 - Sair");
            
            int Selecionar = new Scanner(System.in).nextInt();
            switch (Selecionar) {
                case 1:
                    System.out.println("Informe a Poltrona (0,1,2): ");
                    int Poltrona = new Scanner(System.in).nextInt();
                    System.out.println("Informe a Fila (0 ou 1):");
                    int Fila = new Scanner(System.in).nextInt();
                    
                    if (poltrona[Fila][Poltrona] == 0) {
                        poltrona[Fila][Poltrona] = 1;
                    } else{
                        System.out.println("Poltrona ocupada. Reserve outra");
                       
                        break;
                    }
                    
                    break;
                case 2:
                    for (int i = 0; i <= 1; i++) {
                        for (int j = 0; j <= 2; j++) {
                            System.out.print(" "+poltrona[i][j]+" ");

                        }
                        System.out.println("");
                    }
                    break;
                    
                case 3:
                    System.out.println("Programa encerrado");
                    break loop;
            }
        }
    }
}
