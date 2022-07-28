/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

/**
 *
 * @author lucas
 */
class vendedor extends funcionarios{
    int registro = 5;
    float salario = 5000f;
    public int atributoTesteB = 3;
}

public class aula4w_herancaPOO {
    public static void main(String[] args) {
        
        vendedor lucas = new vendedor();
        lucas.setCpf(4444);
        System.out.println(lucas.cpf);
        
    }
}
