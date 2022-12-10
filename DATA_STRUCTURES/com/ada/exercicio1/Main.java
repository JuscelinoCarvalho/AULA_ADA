package com.ada.exercicio1;

public class Main {
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>();



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
        


        try {
            System.out.println("Pega indice 5\n");
            System.out.println(lista.get(5).toString());

            System.out.println("\nImprime toda a lista\n");
            System.out.println(lista.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
