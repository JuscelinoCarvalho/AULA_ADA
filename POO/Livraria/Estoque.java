package Livraria;

import java.util.ArrayList;
import java.util.List;


public class Estoque<T> {

    List<T> estoque = new ArrayList<>();

    public List<T> addProduto(T produto) {
        estoque.add(produto);
        return estoque;
    }

    public List<T> addPilhaProduto(List<T> pilhaProduto) {
        pilhaProduto.forEach(
            prod -> {

            }
        );
        return pilhaProduto;
    }

    public List<T> getEstoque() {
        return estoque;
    }

    public int getIndxProduto(T p) {
        if(estoque.contains(p)) {
            return estoque.indexOf(p);
        }
        return -1;
    }

    public boolean remProduto(T p) {
        if(estoque.contains(p)) {
            estoque.remove(p);
            return true;
        }
        return false;
    }

    public T getByName(String nome) { 
        return estoque.stream().filter((p-> ((Produto) p).getNome().contains(nome))).findFirst().orElse(null);
    }
        
    public T get(int indx) {
        return estoque.get(indx);
    }

    public T remove(int i) {
        try{
            return estoque.remove(i);
        }catch(Exception e){
            return null;
        }
    }

    public List<T> getByType(Genero type) {
        List<T> subEstoque = new ArrayList<>();
        for(int i = 0; i <= estoque.size()-1; i++){
            T p = estoque.get(i);
            if (((Produto)p).getGenero() == type){
                subEstoque.add(p);
            }
        }

        return subEstoque;
    }

    public boolean contains(Produto p) {

        return estoque.contains(p);
    }

}
