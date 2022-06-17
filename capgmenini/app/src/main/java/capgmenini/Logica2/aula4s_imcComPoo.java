/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica2;

/**
 *
 * @author lucas
 */
public class aula4s_imcComPoo {
    static class Imc {
        float peso;
        float altura;
        
        void calcularIMC(float peso,float altura){
            float imc = peso/(altura*altura);
            System.out.println(imc);
        }
    }
        
    public static void main(String[] args) {
        
        Imc guilher = new Imc();
        guilher.calcularIMC(60, 1.65f);
        
        
        /* adicionar tabela IMC aqui */
        
        
    }
}
