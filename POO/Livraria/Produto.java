package Livraria;


public class Produto implements ProdutoInterface {

    private int id;
    private String nome;
    private double preco;
    private boolean conteudoAdulto = false;

    public boolean isConteudoAdulto() {
        return conteudoAdulto;
    }

    public void setConteudoAdulto(boolean conteudoAdulto) {
        this.conteudoAdulto = conteudoAdulto;
    }

    @Override
    public String toString() {
        return "\n" + this.getNome() + " - R$ " + String.valueOf(this.getPreco()) + "\n";
    }

    public int getId() {
        return id;
    }
    
    @Override
    public Integer setId(int id) {
        this.id = id;
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Produto o) {
        return this.getNome().compareTo(o.getNome());
    }

    public int compareType(Produto o) {
        return this.getGenero().compareTo(o.getGenero());
    }

    public Genero getGenero() {
        return this.getGenero();
    }
    
}
