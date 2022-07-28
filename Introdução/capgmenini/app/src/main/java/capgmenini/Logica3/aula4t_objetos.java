/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

public class aula4t_objetos{

  
    public static void main(String[] args) {
        
        Pessoa oi = new Pessoa(); // Criando um objeto.  Pessoa oi < só declara que quer ter esse objeto 
        oi.calcularIMC();
        //oi.altura = 4.3f;
        //System.out.println(oi.altura);
        
        oi.altura = 1.65f;
        oi.peso = 60f;
        System.out.println(oi.calcularIMC());
        
    }
}
