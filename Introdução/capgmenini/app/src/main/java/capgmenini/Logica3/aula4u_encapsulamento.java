/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

/**
 *
 * @author lucas
 */
public class aula4u_encapsulamento {
    public static void main(String[] args) {
        
        Pessoa lucas = new  Pessoa();
        
        lucas.setAltura(2.00f);
        lucas.setPeso(90f);
        
        System.out.println(lucas.getAltura());
        System.out.println(lucas.getPeso());
    }
}
