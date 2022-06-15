/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;
import java.util.Arrays;
/**
 *
 * @author lucas
 * apos primeiro vetor preenchido o segundo recebera a ordem reversa.
 */
public class aula1d_desafioVetores {
    public static void main(String[] args) {
        int vetor1[] = {1,5,10,15};
        int vetor2[] = {0,0,0,0};
        
        for (int i = 0; i < vetor1.length; i++) {
            //criar um vetor do mesmo tamanho do primeiro
            vetor2[(vetor1.length-1)-i] = vetor1[i];
            
        }
        System.out.println(Arrays.toString(vetor1));
        System.out.println(Arrays.toString(vetor2));
    }
}
