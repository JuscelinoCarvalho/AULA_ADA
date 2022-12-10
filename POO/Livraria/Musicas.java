package Livraria;

public class Musicas extends Produto{
    private Genero genero;
    private String selo;
    private String banda;

    public Musicas(String nome, double preco, Genero genero, String selo, String banda, int id) {
        this.genero = genero;
        this.selo = selo;
        this.banda = banda;
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
    public String getSelo() {
        return selo;
    }
    public void setSelo(String selo) {
        this.selo = selo;
    }
    public String getBanda() {
        return banda;
    }
    public void setBanda(String banda) {
        this.banda = banda;
    }
}
