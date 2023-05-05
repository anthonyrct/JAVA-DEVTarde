package CalculoGastoViagem.CalculadoradeDesconto;

public class CalcularDesconto {
    
    public void calcular20(){

    double precoProduto;
    precoProduto = 200;
    int desconto = 20;
    double precoComDesconto =precoProduto - (precoProduto*desconto/100);
    System.out.println("o Valor do Produto é"
    +precoComDesconto+" R$");
    }

    public void calcular30(){

        double precoProduto;
        precoProduto = 200;
        int desconto = 30;
        double precoComDesconto =precoProduto - (precoProduto*desconto/100);
        System.out.println("o Valor do Produto é"
        +precoComDesconto+" R$");
    
}
}