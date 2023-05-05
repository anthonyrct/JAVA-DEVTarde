package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int i = 0;
        while(i<100000000){
            i=i+1;
            System.out.println("o numero da Iteração é "+i);
            
        }
    }
        public void exemplo2() {
            int vetor []=new int[10];
            int i=0;
            while(i<10){
                System.out.println("Informe o valor do indice " +i+ " do vetor");
                vetor[i]=sc.nextInt();
                i++;
            }

            i = 0;

            while(i<10){
                System.out.println("O numero na posição "+i+" do vetor é: " + vetor[i]);
                i++;
            }
        }
        public void exemplo3() {
            Random rd = new Random();
            int valorsorteado = rd.nextInt(10);
            boolean tentenovamente = true;
            while (tentenovamente) {
            System.out.println("Digite um numero");
            int nDigitado = sc.nextInt();
            if(nDigitado==valorsorteado){
                System.out.println("você acertou!!!");
                tentenovamente = false;
            }else{
                System.out.println("ops! parece que você errou!");
            }
            }
            
        }
    
    }