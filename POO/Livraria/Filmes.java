package Livraria;

public class Filmes extends Produto{
    private Genero genero;
    private String estudio;
    private String diretor;
    private String produtor;


    public Filmes(String nome, double preco, Genero genero, String estudio, String diretor, String produtor, int id) {
        this.genero = genero;
        this.estudio = estudio;
        this.diretor = diretor;
        this.produtor = produtor;
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
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getProdutor() {
        return produtor;
    }
    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }


    
}
