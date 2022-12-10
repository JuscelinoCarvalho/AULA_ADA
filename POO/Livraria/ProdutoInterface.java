package Livraria;

public interface ProdutoInterface extends Comparable<Produto>{
    public Integer setId(int id);
    public void setNome(String nome);
    public void setPreco(double preco);

}
