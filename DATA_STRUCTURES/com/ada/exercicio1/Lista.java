package com.ada.exercicio1;


public class Lista<T> {
	
    ItemListaEncadeada<T> primeiroItem;
    ItemListaEncadeada<T> ultimoItem;
    int tamanho = 0;

    public String toString() {
        String str = "...................DADOS CONTIDOS NA LISTA...................\n";
        int indice = 1;
        ItemListaEncadeada<T> item = primeiroItem;
        while (item.getProximo() != null) {
                str += Integer.toString(indice) + " - "  + item.getDado() + "\n";
                item = item.getProximo();
            indice ++;
        }
        //indice ++;
        str += Integer.toString(indice) + " - "  + ultimoItem.getDado() + "\n";
        return str;
    }

	public class ItemListaEncadeada<K> {
	    private K dado;
	    private ItemListaEncadeada<K> anterior;
	    private ItemListaEncadeada<K> proximo;


        public K getDado() {
            return dado;
        }
        public void setDado(K dado) {
            this.dado = dado;
        }
        public ItemListaEncadeada<K> getAnterior() {
            return anterior;
        }
        public void setAnterior(ItemListaEncadeada<K> anterior) {
            this.anterior = anterior;
        }
        public ItemListaEncadeada<K> getProximo() {
            return proximo;
        }
        public void setProximo(ItemListaEncadeada<K> proximo) {
            this.proximo = proximo;
        }
	}

    public Lista() {}

    public T add(T dado){
        if(primeiroItem==null){
            this.primeiroItem = new ItemListaEncadeada<>();
            primeiroItem.setDado(dado);
            ultimoItem = primeiroItem;
        } else {
            ItemListaEncadeada<T> item = new ItemListaEncadeada<>();
            item.setDado(dado);
            item.setAnterior(ultimoItem);
            ultimoItem.setProximo(item);
            ultimoItem = item;
        }
        
        
        tamanho++;
        return dado;
    }

    public T get(int posicao) throws Exception {
        this.validateRulesList(posicao);

        ItemListaEncadeada<T> item = new ItemListaEncadeada<>();

        if (posicao == 0) return primeiroItem.getDado();
        
        
        int fim = tamanho;
        int inicio;
        int meio = fim / 2;

        if(posicao > meio){
            item = ultimoItem;
            for (inicio = fim; inicio > posicao; inicio--) {
                System.out.println("... checking id:  " + Integer.toString(inicio) );
                item = item.getAnterior();
            }
        }else{
            item = primeiroItem;
            for (inicio = 1; inicio < posicao; inicio++){
                System.out.println("... checking id:  " + Integer.toString(inicio));
                item = item.getProximo();
            }
            
        }

        return item.getDado();
    }

    
    private ItemListaEncadeada<T> getItem(int posicao) throws Exception {
        this.validateRulesList(posicao);
        
        if (posicao == 0) return primeiroItem;

        ItemListaEncadeada<T> item = primeiroItem;

        for (int i = 0; i < posicao; i++) {
            item = item.getProximo();
        }

        return item;
    }

    public T remove(int posicao) throws Exception {

        if (posicao == 0) {
        	T dado = primeiroItem.getDado();
            primeiroItem = primeiroItem.getProximo();
            return dado;
        }
        
        ItemListaEncadeada<T> itemAtual = this.getItem(posicao);
        ItemListaEncadeada<T> itemAnterior = itemAtual.getAnterior();

        if (itemAtual == ultimoItem) {
            ultimoItem = itemAnterior;
            itemAnterior.setProximo(null);
        } else {
            itemAnterior.setProximo(itemAtual.getProximo());
        }

        return itemAtual.getDado();
    }

    public T validateRulesList(int posicao) throws Exception {
        if (posicao < 0) throw new Exception("Posição não pode ser negativa");
        if (posicao >= tamanho) throw new IndexOutOfBoundsException("Posição acima do tamanho da lista");

        return null;
    }

    public void printList() {
        ItemListaEncadeada<T> item = primeiroItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  primeiroItem.getDado());
        System.out.println("ultimoItem: "  + ultimoItem.getDado());

        while (item.getProximo() != null) {
            System.out.println(item.getDado());
            item = item.getProximo();
        }

        System.out.println(item.getDado());
    }
    
    public void printListReverse() {
        ItemListaEncadeada<T> item = ultimoItem;

        System.out.println("\n");
        System.out.println("primeiroItem: " +  ultimoItem.getDado());
        System.out.println("ultimoItem: "  + primeiroItem.getDado());

        while (item.getAnterior() != null) {
            System.out.println(item.getDado());
            item = item.getAnterior();
        }

        System.out.println(item.getDado());
    }

    public static void main(String[] args) throws Exception {
        Lista<String> lista = new Lista<>();

        lista.add("Ana");
        lista.add("André");
        lista.add("Ultimo");
        lista.add("Fábio");
        lista.add("José");
        lista.add("Maria");
        lista.add("Joao");
        lista.add("Afranio");
        lista.add("Gutenberg");
        lista.add("Almir");
        lista.add("Felix");
        lista.add("Juscelino");
        lista.add("Samira");
        lista.add("Luciana");
        lista.add("Luciene");
        lista.add("Mariza");
        lista.add("Teletubies");

        System.out.println(lista.toString());


        System.out.println("Busca item com ID 12, que é acima do ID 8 (metade)");
        System.out.println(lista.get(12));

        System.out.println("\n\n");

        System.out.println("Busca item com ID 06, que é abaixo do ID 8 (metade)");
        System.out.println(lista.get(6));

    }

}