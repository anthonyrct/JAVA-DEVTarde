package MatrizExemplos;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        int tab[][] = new int[10][9];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                // System.out.println("tab[+i+]["+j+"]=");
                tab[i][j] = rd.nextInt(1, 9);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("tab[" + i + "][" + j + "]=" + tab[i][j]);

            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("| ");
            for (int j = 0; j < 9; j++) {
               
                System.out.print(" "+tab[i][j]);
    }
    System.out.println(" |");
}
    }
    public void exemplo2() {
        int ind[][] = new int[5][5];
        for (int i = 0; i < ind.length; i++) {
            for (int j = 0; j < ind.length; j++) {
                if(i==j){
                    ind[i][j]=1;
                } else{
                    ind[i][j]=0;
                }
                System.out.println(" |");
            }
        }
    }
    public void exemplo3() {
        int tid[][] = new int[4][4];
        for (int i = 0; i < tid.length; i++) {
            for (int j = 0; j < tid.length; j++) {
             tid[i][j]=rd.nextInt(1,10);   
            }
        }
        System.out.println("+++++++++++++++++++++++++++++");
        for (int i = 0; i < tid.length; i++) {
            System.out.println(" |");
            for (int j = 0; j < tid.length; j++) {
                System.out.println(""+tid[i][j]);
            }
            System.out.println(" |");
        }
        System.out.println("+++++++++++++++++++++++++++++");
        for (int i = 0; i < tid.length; i++) {
            System.out.println(" |");
            for (int j = 0; j < tid.length; j++) {
                System.out.println(""+tid[j][i]);
            }
            System.out.println(" |");
            }
            System.out.println("++++++++++++++++++++");
            int somaDig = 0;
            int somaDigInf = 0;
            int somaDigSup = 0;
            for (int i = 0; i < tid.length; i++) {
                for (int j = 0; j < tid.length; j++) {
                    if(i==j){
                        somaDig+=tid[i][j];
                    } else if (i>j){
                        somaDigInf+=tid[i][j];
                    } else {
                        somaDigSup+=tid[i][j];
                    }
                }
            }
            System.out.println("A soma da Diagonal é" +somaDig);
            System.out.println(" A soma dos nº Inferiores a diagonal é "+somaDigInf);
            System.out.println(" A soma dos nº Superiores a diagonal é "+somaDigSup);
    }       
}
    
