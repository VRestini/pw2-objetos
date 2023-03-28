import java.time.LocalDate;

public class Anime {
    public int id;
    public String nome;
    public LocalDate dataLancamento;
    public String classificacaoIndicativa;
    public String genero;
    public String autor;
    public int quantidadeEpisodios;
    public int temporadas;
    private int media;
    public String exi;



    public int mediaEpisodioPorTemporada(){
        media = quantidadeEpisodios / temporadas;
        return media;
    }
    public String exibirClassificacao(){
        if (classificacaoIndicativa == "L"){
            exi = ("é livre para todos os públicos");
            return exi;
        }
        else if(classificacaoIndicativa == "10"){
            exi = ("não é recomendado para menores de 10 anos");
            return exi;
        }
        else if(classificacaoIndicativa == "12"){
            exi = ("não é recomendado para menores de 12 anos");
            return exi;
        }
        else if(classificacaoIndicativa == "14"){
            exi = ("não é recomendado para menores de 14 anos");
            return exi;
        }
        else if(classificacaoIndicativa == "16"){
            exi = ("não é recomendado para menores de 16 anos");
            return exi;
        }
        else {
            exi = ("não é recomendado para menores de 18 anos");
            return exi;
        }
    }
    public String exibir(){
        System.out.println("Nome do anime:"+nome);
        System.out.println("De acordo com o ministério da justiça esse anime "+ exibirClassificacao());
        System.out.println("A média de episódios por temporada é "+ mediaEpisodioPorTemporada());
        return exibir();
    }
}
