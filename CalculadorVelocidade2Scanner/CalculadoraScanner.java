package CalculadorVelocidade2Scanner;

import java.util.Scanner;

public class CalculadoraScanner {
    public void calcular(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe a Distancia Percorrida");
      double distanciaPercorrida = sc.nextDouble();
      System.out.println("A distância percorrida foi de"
      +distanciaPercorrida + " km");
      System.out.println("Informe o Tempo Gasto na Viagem");
      double tempoGasto = sc.nextDouble();
      System.out.println("o Tempo Gasto na Viagem foi de"
              + tempoGasto + "horas");
              sc.close();
              double velocidadeMedia = distanciaPercorrida/tempoGasto;
              System.out.println("a Velocidade Media foi de "
                    +velocidadeMedia+"km/h");
    }
}
