package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.JOptionPane;

public class ExemploArrayList {
    public void teste() {
        // Criando o Array List
        ArrayList<String> carros = new ArrayList<>();
        {
            // Adicionando Elementos com o add
            carros.add("Fusca");
            carros.add("Brasìlia");
            carros.add("Chevette");
            carros.add("Monza");
            carros.add("Golf");
            // Imprimindo a Lista
            System.out.println(carros);
            //Ordernando a Lista(.Sort(Colletions))
            Collections.sort(carros);
            System.out.println(carros);//Ordenação Alfabetica
            Collections.reverse(carros);//Ordenação Reversa
            System.out.println(carros);
            // Percorrendo a Lista(for)
            for (int i = 0; i < carros.size(); i++) {
                System.out.println(carros.get(i));

            }
            // Percorrendo a lista com For-each
            for (String s : carros) {
                System.out.println(s);
            }
            // Limpando a Lista
            carros.clear();
            System.out.println(carros);
        }

    }
    public void Exercicio1(){
        //Cria uma ArrayList de Numeros Inteiros
        //Escrever 5 Números Aleatórios - Ordenar e Imprimir
        ArrayList<Integer> numeros = new ArrayList<>();{
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero")));
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero")));
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero")));
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero")));
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Numero")));
            System.out.println(numeros);
            Collections.sort(numeros);
            System.out.println(numeros);
        }
    }

}
