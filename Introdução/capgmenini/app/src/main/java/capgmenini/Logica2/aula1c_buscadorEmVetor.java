/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;

/**
 *
 * @author lucas
 */
public class aula1c_buscadorEmVetor {
    public static void main(String[] args) {
        String nomes[] = {"Lucas", "elisabete", "Rebeca"};
        String nomeProcurado = "Rebeca";
        
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i]==nomeProcurado) {
                System.out.println("Encontrei: "+nomeProcurado+". Posição: "+i);
            }
        }
        
    }
}
