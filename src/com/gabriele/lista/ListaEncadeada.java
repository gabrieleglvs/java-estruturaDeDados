package com.gabriele.lista;

public class ListaEncadeada<T> {
    //0 - Crio uma celula de início. Como se fosse a porta do trem.
    private No<T> inicio;
    private int tamanho; //4 - propriedade para ter a quantidade de elementos na lista encadeada.

    //1- Recebo um elemento de um tipo qualquer
    public void adiciona(T elemento) {
        //2 - Instancio esse elemento como um No chamado celula (um vagão do trem), e ele aponta para null conforme o
        // construtor está configurado.
        No<T> celula = new No<T>(elemento);

        //3 - Preciso apontar o início (porta do trem) para o proximo elemento (vagão do trem)
        this.inicio = celula; //quer dizer que esse inicio guarda o ponteiro da celula.
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
