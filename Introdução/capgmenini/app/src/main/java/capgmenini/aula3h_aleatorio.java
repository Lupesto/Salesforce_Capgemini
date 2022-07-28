/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class aula3h_aleatorio {
    public static void main(String[] args) {
         Random aleatorio = new Random();
        int aleatorio0a10 = aleatorio.nextInt(10);
        System.out.println(aleatorio0a10);
        double Realaleatorio0a10 = aleatorio.nextDouble();
        System.out.println(Realaleatorio0a10);
    }
}
