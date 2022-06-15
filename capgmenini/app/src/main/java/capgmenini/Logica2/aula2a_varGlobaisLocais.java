/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;

/**
 *
 * @author lucas
 * 
 */

 interface variavelGlobal{
        int ovoA = 5;
    }
public class aula2a_varGlobaisLocais implements variavelGlobal {
    
    static class receita {
        static int ovo = 4;
    }    
    
  
    public static void main(String[] args) {
        int ovo = ovoA;
        
        System.out.println(ovo);
        System.out.println(receita.ovo);
        
    }
}
