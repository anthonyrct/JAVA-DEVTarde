package colecoes;

import java.util.HashMap;

public class ExemploHashMap {
    HashMap<String,Integer> pessoas = new HashMap<>();
    HashMap<String,String> capitalEstado = new HashMap<>();
    public void teste(){
        //incluindo elementos na lista(Chave/Valor)
        capitalEstado.put("SP","São Paulo");
        capitalEstado.put("RJ","Rio de Janeiro");
        capitalEstado.put("MG","Belo Horizonte");
        capitalEstado.put("ES","Vitória");
        //Buscando um valor pela Chave
        System.out.println(capitalEstado.get("ES"));
        for (String i : capitalEstado.keySet()) {
            System.out.println(i +":" +capitalEstado.get(i));
        }
    }
    //criar um Hash map onde a chave vai ser o nome da pessoa e o valor vai ser sua idade

    public void Atividade1(){
       pessoas.put("Maria", 18);
       pessoas.put("Pedro", 13);
       pessoas.put("Roger", 21);
       pessoas.put("Suele", 45);
       pessoas.put("Rogerio", 43);

       System.out.println(pessoas.get("Maria"));
       for (String i : pessoas.keySet()) {
         System.out.println(i +":" +pessoas.get(i));
       }
    }
}
