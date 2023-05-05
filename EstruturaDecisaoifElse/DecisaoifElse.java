package EstruturaDecisaoifElse;

import java.util.Scanner;

//if desencadeado
public class DecisaoifElse {

    Scanner sc = new Scanner(System.in);

    public void Decisaoif() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        // se precoProduto>100 então desconto= 5
        if (precoProduto >= 100) {
            desconto = 5.0;
            // se precoProduto>=200 então desconto = 10
            if (precoProduto >= 200) {
                desconto = 10.0;
            }
            if (precoProduto >= 300) {
                desconto = 15.0;
            }
            // se precoProduto>=300 então desconto = 300
        }
        {
            // realizar a Conta
            double valorDesconto = precoProduto * desconto / 100;
            double precoFinal = precoProduto - valorDesconto;
            System.out.println("O valor do Produto é R$"
                    + precoFinal);
        }
    }

    // if encadeado (if-else)
    public void decisaoifElse() {
        System.out.println("Informe o Preço do Produto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //estrutura de decisao decincadeada if-else
        if (precoProduto>=300){
            desconto = 15;
        } else if
       (precoProduto>=200){
        desconto = 10;
       } else if
         (precoProduto>=100){
            desconto = 5;
        }else{
            desconto = 0;
        }
         //realizar a Conta
    double valorDesconto = precoProduto*desconto/100;
    double precoFinal = precoProduto-valorDesconto;
    System.out.println("O valor do Produto é R$"
    +precoFinal);
}
}
