package Livraria;

public class Brinquedos extends Produto{
    
    private String tipo;
    private Genero genero;

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Brinquedos(String nome, Genero genero, double preco, String tipo, int id) {
        this.tipo = tipo;
        super.setId(id);
        super.setNome(nome);
        super.setPreco(preco);
        this.genero = genero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}