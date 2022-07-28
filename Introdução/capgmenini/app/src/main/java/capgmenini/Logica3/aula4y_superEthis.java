/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

/**
 *
 * @author lucas
 */

class vendedorLider extends vendedor{
    float comissao = 500f;
    
    
    public float teste1(){
        return super.atributoTesteA;
        
    
    }
    
    public int teste2(){
        return this.atributoTesteA;
    }
}
public class aula4y_superEthis {
    public static void main(String[] args) {
        vendedorLider pedro = new vendedorLider();
        System.out.println(pedro.teste1());
        System.out.println(pedro.teste2());
        
    }
}
