package ExerciciosFor;

import java.util.Scanner;

public class ExerciciosFor {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("digite o valor");
        }
    }

    public void Exercicio2() {
        double vetor[] = new double[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("vetor [" + (i + 1) + "]=");
            vetor[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor [" + (i + 1) + "]=" + vetor[i]);
        }
    }

    public void Exercicio3() {
        double notas[] = new double[4];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do aluno");
            notas[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota" + (i + 1) + "= " + notas[i]);
            media += notas[i];
        }
        media /= notas.length;
        System.out.println("a média do Aluno é" + media);
    }

    public void exercicio4() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {

            if (letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u") {
            } else {
                cont++;
                System.out.println(letras[i] + " é consoante");
            }
            System.out.println("o numero de Consoantes são: " + cont);
        }
    }

    public void exercicio4m() {
        System.out.println("Digite uma Palavra");
        String palavra = sc.next();
        palavra.toLowerCase();
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            } else {
                cont++;
                System.out.println(c + "é consoante");
            }
        }
        System.out.println("O número de Consoantes é: " + cont);
    }

    public void exercicio5() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int vetorNpar[] = new int[20];
        int vetorNimpar[] = new int[20];
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                vetorNpar[i] = vetorNumeros[i];
            } else {
                vetorNimpar[i] = vetorNumeros[i];
            }
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor["+i+"]="+vetorNumeros[i]);
            System.out.println("vetorPar["+i+"]="+vetorNpar[i]);
            System.out.println("vetorImpar[+i+]="+vetorNimpar[i]);
        }
    }


    public void exercicio5m() {
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contImpar=0;
        int contPar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){
                contPar++;
            }else{
                contImpar++;
            }
        }
        int vetorPar[] = new int[contPar];
        int vetorImpar[]= new int[contImpar];
        contImpar=0;
        contPar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){
                vetorImpar[contPar]=vetorNumeros[i];
                contPar++;
            } else{
                vetorImpar[contImpar]=vetorNumeros[i];
                contImpar++;
            }
        }
    }
}
