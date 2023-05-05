package Operadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);
    public void calcular(){
        System.out.println("Informe a nota 1 do Aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno:");
        int nota2 = sc.nextInt();
        //Operação Aritimética
        double media = (nota1+nota2)/2;
        System.out.println("a Média do Aluno é"+media);
        boolean mediaAprovada = media>=50;
        System.out.println("O Aluno está Aprovado por Nota? "+mediaAprovada);
        System.out.println("Informe a Frequencia do Aluno");
        int Frequencia = sc.nextInt();
        boolean frequenciaAprovada = Frequencia>=75;
        System.out.println("O Aluno está Aprovado por Frequencia:"+frequenciaAprovada);
        boolean resultadoFinal = (mediaAprovada==true)&&(frequenciaAprovada==true);
        System.out.println("O Aluno está Aprovado no Curso"+resultadoFinal);
    }
}
