package Prova;

import java.util.Scanner;

public class Atividade1 {
    Scanner sc = new Scanner(System.in);

    public void Atvidade1() {
        System.out.println(" qual operação executar?");
        System.out.println("1- adição");
        System.out.println("2-subtração");
        System.out.println("3-multiplicação");
        System.out.println("4-divisão");
       System.out.println("Digite o Primeiro Numero");
       double numero1 = sc.nextDouble();
       System.out.println("Digite o Segundo Numero");
       double numero2 = sc.nextDouble();
    }
}

