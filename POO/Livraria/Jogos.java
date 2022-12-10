package Livraria;

public class Jogos extends Produto {
    private Genero genero;
    private String distribuidora;
    private String estudio;

    public Jogos( String nome, double preco, Genero genero, String distribuidora, String estudio, int id) {
        this.genero = genero;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
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
    public String getDistribuidora() {
        return distribuidora;
    }
    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }
    public String getEstudio() {
        return estudio;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    
}
