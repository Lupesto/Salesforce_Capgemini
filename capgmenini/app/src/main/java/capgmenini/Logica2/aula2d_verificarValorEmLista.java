/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucas
 * 
 *Usar switch. Cadastro clientes, se tentar cadastrar algo que já possui na lista retorne erro
 */
public class aula2d_verificarValorEmLista {
    public static void main(String[] args) {

        String[] nomes  = new String[] {"Paulo", "Matheus", "Cris"};
        List<String> list = Arrays.asList(nomes);
        
        if (list.contains("Paulo")) {
            System.out.println("Paulo têm");
            
        }
        
        
        
        
        
    }
}
