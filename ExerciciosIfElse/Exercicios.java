package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Informe o Valor 1");
        int valor1 = sc.nextInt();
        System.out.println("Informe o valor 2");
        int valor2 = sc.nextInt();
        if (valor1 >valor2 ){
            System.out.println("O valor 1 é Maior");
        }else{
            System.out.println("O valor 2 é Maior");
      }
        }
    
    public void exercicio2() {
       System.out.println("qual ano você nasceu?");
       int ano = sc.nextInt();
       if (ano <= 2007) {
        System.out.println("você pode votar esse ano");
       } else {
        System.out.println("vc não pode votar esse ano");
       }
        }
    
    public void exercicio3() {
       System.out.println("coloque a senha");
       int senha = sc.nextInt();
       if (senha == 1234 ) {
        System.out.println("acesso permitido");
       } else {
        System.out.println("acesso negado");
       }
     } 
    
    public void exercicio4() {
        System.out.println("quantas maçãs você comprou?");
        int quantidade = sc.nextInt();
        double valorMaca;
        if (quantidade >= 12){
            valorMaca = 0.25;
        }
        else{
            valorMaca = 0.30;
        }
        double valorCompra = quantidade * valorMaca;
        System.out.println("o Valor da Compra é:R$ "+valorCompra);
         
        
    }
    public void exercicio5() {
        System.out.println("digite o valor1");
        int v1 = sc.nextInt();
        System.out.println("digite o valor2");
        int v2 = sc.nextInt();
        System.out.println("digite o valor3");
        int v3 = sc.nextInt();
        if (v1 > v2 && v1 > v3) {
            System.out.println("Os numeros em ordem crescente ficam:" + v3 + "," + v2 + "," + v1);
        } else if (v1 > v3 && v1 > v2) {
            System.out.println("Os numeros em ordem crescente ficam:" + v2 + "," + v3 + "," + v1);
        } else if (v2 > v1 && v2 > v3) {
            System.out.println("Os numeros em ordem crescente ficam:" + v3 + "," + v1 + "," + v2);
        } else if (v2 > v3 && v2 > v1) {
            System.out.println("Os numeros em ordem crescente ficam:" + v1 + "," + v3 + "," + v2);
        } else if (v3 > v2 && v3 > v1) {
            System.out.println("Os numeros em ordem crescente ficam:" + v1 + "," + v2 + "," + v3);
        } else if (v3 > v1 && v3 > v2) {
            System.out.println("Os numeros em ordem crescente ficam:" + v1 + "," + v3 + "," + v2);
        }
    }
    public void exercicio6() {
        System.out.println("informe sua altura");
        double altura = sc.nextDouble();
        System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
        int sexo = sc.nextInt();
        double pesoIdeal;
        if(sexo==1){
            pesoIdeal = 62.1*altura-44.7;
        }
        else{
            pesoIdeal = 72.7*altura-58;
        }
        System.out.println("Seu peso Ideal é "+pesoIdeal+" Kg");
          }
}
