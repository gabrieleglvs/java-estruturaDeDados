package com.gabriele.lista;

public class ListaEncadeada<T> {
    //0 - Crio um No de início que é uma referência para o inicio da ListaEncadeada.
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho; //4 - propriedade para ter a quantidade de elementos na lista encadeada.

    //1- Recebo um elemento de um tipo qualquer
    public void adiciona(T elemento) {
        //2 - Esse elemento instacia um No que já aponta para null, que é o proximo espaço da lista.
        No<T> celula = new No<T>(elemento);

        //5 - Verificar se há elementos na lista para entender onde posicionar o próximo.
        if(this.tamanho == 0) {
            //3 - Defino então que o inicio da lista é essa celula que criei acima.
            this.inicio = celula; //Inicio (que é uma instacia de No) está guardando o ponteiro do começo da lista.
        } else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula; //se nossa Lista possui apenas um elemento ele também será o último, ou seja Ultimo
        // guarda o ponteiro para o ultimo elemento da lista.
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada {" +
                "inicio = " + inicio +
                '}';
    }
}
