/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class aula2e_condicionais {
    public static void main(String[] args) {
        
        float vLeve = 50*1.1f;
        float vMedia = 70;
        float vGrave = 90;
        float vGravissima = 110;

        System.out.println("Qual a velocidade do ve�culo?: ");
        float velocidadeVeiculo = new Scanner(System.in).nextFloat();
        
        if(velocidadeVeiculo<= vLeve){
            System.out.println("Isento de multa");
        } else if(velocidadeVeiculo <= vMedia){
            System.out.println("Infra��o leve");
        } else if(velocidadeVeiculo <= vGrave){
            System.out.println("Infra��o m�dia");
        } else if(velocidadeVeiculo <= vGravissima){
           System.out.println("Infra��o Grave");
        } else{
            System.out.println("Infra��o Gravissima");
        }
    
    }
}
