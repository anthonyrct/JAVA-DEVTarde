package EstudoArrayList;

public class ExemploArrayList {
    int cont = 0;
    int v1[] = new int[cont];
    int v2[] = new int[cont + 1];

    public void add(int add) {
       for (int i = 0; i < v1.length; i++) {
        v2[i]=v1[i];
       }
       //adicionei o valor do add a ultima posição do vetor2
     v2[v2.length-1] = add;

//redefinir o tamanho do v1
int v1[] = new int[cont+1];
//copiar o v2 para o v1 
       for (int i = 0; i < v2.length; i++) {
        v1[i]=v2[i];
    }
    cont++;
}
public void imprimir(){
    for (int i = 0; i < v1.length; i++) {
        System.out.println(v1[i]);
    }
}
}
// vai criar um vetor1 com tamanho cont
// vai criar um vetor2 com tamanho cont+1
// toda vez que usar o metodo add vai adicionar +1 posição e vai copiar o vetor
// anterior
