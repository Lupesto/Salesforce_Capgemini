/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capgmenini.Logica3;

/**
 *
 * @author lucas
 * receba o custo e preço de venda de 40 produtos
 * retorne se houve lucro ou prejuizo para cada produto
 */

class produto{
    String nomeProduto;
    float precoVenda;
    float custo;
    
    public void dadosProduto(){
        System.out.println("Nome produto: "+ nomeProduto);
        System.out.println("Preço de venda: "+ precoVenda);
        System.out.println("Custo: "+ custo);
    }
    
    public void detalhesEconomicos(){
        if (precoVenda == custo) {
            System.out.println("Ponto de equilibrio.");
        } else if(precoVenda > custo){
            System.out.println("Lucro");
        } else{
            System.out.println("Prejuízo na venda");
        }
    }
}

public class aula4oEp_calculoLucro {
    public static void main(String[] args) {
        produto produtoA = new produto();
        produtoA.nomeProduto = "Maçã";
        produtoA.custo = 13.3f;
        produtoA.precoVenda = 4f;
        produtoA.dadosProduto();
        produtoA.detalhesEconomicos();
        
        
    }
    
}
