/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

public class aula4t_objetos{
    static class  Pessoa{
        float peso;
        float altura;

        public float calcularIMC(){
            float imc = peso/(altura*altura);
            return imc;
        }
            
    }
    public static void main(String[] args) {
        
        Pessoa oi = new Pessoa();
        oi.altura = 4.3f;
        System.out.println(oi.altura);
        
        
    }
}
