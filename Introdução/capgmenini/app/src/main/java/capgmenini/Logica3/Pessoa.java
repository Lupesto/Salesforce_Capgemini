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

    public Pessoa() {
        this.altura = 1.00f;
    }
    
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public float getAltura(){
        return altura;
    }
}
