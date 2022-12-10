package Livraria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livraria <T extends Produto>
{
    static int contadorLivraria = 0;
    static double precoLivros = 0;
    static int qtdeLivros = 0;

    static Livros livro = new Livros("Vidas Secas", 32.50, Genero.Romance, "Zé Lover", "Amorecos", contadorLivraria++);
    static Musicas musica = new Musicas("Amused To Death", 5.45, Genero.Rock, "Bilboard", "Roger Waaters", contadorLivraria++);
    static Filmes filme = new Filmes("TOP GUN", 30, Genero.Policial, "Studio Atlas", "Michael Director", "John Producer", contadorLivraria++);
    static Brinquedos brinquedo = new Brinquedos("War Game", Genero.Infantil, 25.00, "Tipo Puzzle Toy", contadorLivraria++);
    static Jogos jogo = new Jogos("Clash Royale", 9.50, Genero.Infantil, "TecToy", "estudio plus", contadorLivraria++);
    static Musicas musica2 = new Musicas("TNT", 5.45, Genero.Rock, "Bilboard", "AC//DC", contadorLivraria++);

    static List<Produto> pilhaLivros = new ArrayList<Produto>();
    //static List<Musicas> pilhaMusicas = new ArrayList<Musicas>();
    //static List<Filmes> pilhaFilmes = new ArrayList<Filmes>();
    //static List<Brinquedos> pilhaBrinquedos = new ArrayList<Brinquedos>();
    //static List<Jogos> pilhaJogos = new ArrayList<Jogos>();

    static MoneyBox money = new MoneyBox();
    static Estoque<Produto> estoque = new Estoque<Produto>();

    public static void main(String[] args) {

        Usuario usr = new Usuario("Juscelino A. Carvalho", "53937089", "99999999915",  Date(1977,4,30) );
        
        /* Seta o conteúdo ADULTO para uma das músicas e para o Jogo. */
        musica.setConteudoAdulto(true);
        jogo.setConteudoAdulto(true);

        
        estoque.addProduto(livro);
        estoque.addProduto(musica);
        estoque.addProduto(filme);
        estoque.addProduto(brinquedo);
        estoque.addProduto(jogo);
        estoque.addProduto(musica2);
        
        //Compramos vários livros para verificar o total gasto em livros.
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);
        estoque.addProduto(livro);


        //Ver todos 
        System.out.println("LISTA DE OBJETOS");
        System.out.println(estoque.getEstoque().toString());

        System.out.println("\n\n");
        //Buscar por Nome 
        System.out.println("Busca um único produto pelo nome, exemplo: 'TOP GUN'");
        System.out.println(estoque.getByName("TOP GUN"));

        System.out.println("\n\n");
        //Remove um item pelo Nome
        System.out.println("Remove o item de nome = 'TOP GUN'");
        Produto p1 = estoque.getByName("TOP GUN");
        estoque.remProduto(p1);
        System.out.print("Item removido com sucesso!!!");
        System.out.println("Lista todos novamente");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(estoque.getEstoque().toString());

        System.out.println("\n\n");
        System.out.println("Item que foi removido da lista acima:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(p1.toString());
        
        System.out.println("\n\n");
        System.out.println("Listar os itens do Typo Genero = Rock:");
        System.out.println("--------------------------------------------------------------------------------");
        
        List<Produto> sub = new ArrayList<>();
        sub = estoque.getByType(Genero.Rock);
        System.out.println(sub.toString());
        System.out.println("\n\n");
        System.out.println("Quantidade de itens encontrados do Typo Genero = Rock...: ");
        System.out.println(sub.size());
        System.out.println("\n\n");


        System.out.println("Efetuaremos a compra de 3 produtos (0-Vidas Secas, 1-Amused to Death e 4-Clash Royale) :");
        System.out.println("--------------------------------------------------------------------------------");
        
        List<Produto> compra = new ArrayList<>();
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Vidas Secas"));
        compra.add(estoque.getByName("Amused To Death"));
        compra.add(estoque.getByName("Clash Royale"));

        compra = Comprar(usr, compra);
        if (compra != null){
            System.out.println("Compra efetuada com sucesso!");
            System.out.println("\n\n");
            System.out.println("Lista de Itens Comprados");
            System.out.println(compra.toString());
            System.out.println("\n\n");
            System.out.println("Valor total dos itens comprados (MoneyBox)");
            System.out.println(money.getValorTotal());
        }

        System.out.println("\n\n");
        System.out.println("Os itens que foram comprados acima, saíram do nosso controle de estoque.\nEstoque total restante....:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(estoque.getEstoque().toString());

        //Resulmo geral das compras e descontos se houverem
        System.out.println("RESUMO GERAL DAS COMPRAS E DESCONTOS:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Total Gasto...: ");
        System.out.println(money.getValorTotal());
        System.out.println("\nTotal Gasto com Livros...: ");
        double vlCompraLivros = somaLivros(compra); 
        System.out.println(vlCompraLivros);
        if(vlCompraLivros >= 200){
            System.out.println("Como houve gastos acima de R$ 200 com livros, vc terá desconto em seu valor TOTAL de compras!!");
            System.out.println("Valor total anterior ao desconto...: ");
            System.out.println(money.getValorTotal());
            System.out.println("\n");
            System.out.println("Valor total COM DESCONTO...!!!!!! ");
            System.out.println(money.getValorTotal() * 0.85);
        }

        System.out.println("\n\nTestes com valor de desconto: ");
        System.out.println(money.getValorDesconto());
        
        //System.out.println(estoque.getByName("Clash Royale").toString());

        System.out.println("\n\n");
        System.out.println("Imprime o CARD do Usuario...: Se alterar o parametro do ANO e a idade for < que 18 alguns produtos serão bloqueados.");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(usr.toString());
        System.out.println("\n\n");


    }

    private static LocalDate Date(int i, int j, int k) {
        return LocalDate.of(i, j, k);
    }

    public static List<Produto> Comprar(Usuario usr, List<Produto> ts){
        List<Produto> prods = new ArrayList<Produto>();
        money.resetValues();
        try{
            ts.forEach(
                p -> {
                    if(estoque.contains(p)){
                        if((p.isConteudoAdulto() && (usr.getYearsOld() >= 18)) || !p.isConteudoAdulto()){
                            money.addValor(p.getPreco());
                            estoque.remProduto(p);                             
                        }else{
                            System.out.println("------------------------\n");
                            System.out.println("BLOCKED ITEM !!!!!");
                            System.out.println(p.toString());
                            System.out.println("------------------------\n");
                            prods.add(p);
                        }
                    }else{
                        System.out.println("Item nao encontrado ID: ");
                        System.out.println(ts.indexOf(p));
                    }
                }
            );
            ts.removeAll(prods);
            return ts;
            }
        catch(Exception e){
                return null;
         }
    }
        


    public static double somaLivros(List<Produto> compra){
        compra.forEach(
          l ->  {
                if(l instanceof Livros) {
                    precoLivros += ((double)((Livros) l).getPreco());
                    qtdeLivros += 1; 
                }
            }
        );

        return precoLivros;
    }
 }