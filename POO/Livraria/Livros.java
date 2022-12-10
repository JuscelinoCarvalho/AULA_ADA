package Livraria;

public class Livros extends Produto {
    private Genero genero;
    private String escritor;
    private String editora;

    public Livros(String nome, double preco, Genero genero, String escritor, String editora, int id) {
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
        super.setId(id);
        super.setNome(nome);
        super.setPreco(preco);
    }
    
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public String getEscritor() {
        return escritor;
    }
    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
