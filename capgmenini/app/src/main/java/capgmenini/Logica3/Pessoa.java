/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

/**
 *
 * @author lucas
 */
public class Pessoa {
        
    float peso;
    float altura;

    public float calcularIMC(){
        float imc = peso/(altura*altura);
        return imc;
        
    }
}
