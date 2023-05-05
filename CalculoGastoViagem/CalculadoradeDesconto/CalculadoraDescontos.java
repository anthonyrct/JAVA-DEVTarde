package CalculoGastoViagem.CalculadoradeDesconto;

/**
 * CalculadoraDescontos
 */
public class CalculadoraDescontos {
        public void calculo() {
                System.out.println("=========================");
                double precoProduto = 115;
                System.out.println("O preço do produto é de"+ precoProduto + " reais");
                double percentualDesconto = 10.0;
                percentualDesconto = 20;
                System.out.println("O desconto séra de "
                                + percentualDesconto + "%.");
                // regra de três para descobrir qual o valor
                // do desconto.
                double desconto = precoProduto * percentualDesconto / 100;
                // Preço do produto menos o desconto para
                // sabermos o valor do produto com o
                // desconto que foi calculado na linha anterior.
                double precoComDesconto = precoProduto - desconto;
                System.out.println("Com desconto, o produto sai por R$ " + precoComDesconto);

        }
}
