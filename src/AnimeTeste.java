public class AnimeTeste {
    public static void main(String[] args) {
        //Class nomeObjeto = new Class();
        Anime meuAnime = new Anime();
        meuAnime.nome = "Vinland Saga";
        meuAnime.classificacaoIndicativa = "L";
        meuAnime.quantidadeEpisodios = 32;
        meuAnime.temporadas = 2;

        meuAnime.exibir();

        Anime meuAnimePreferido = new Anime();
        meuAnimePreferido.nome = "Dorohedoro";
        meuAnime.quantidadeEpisodios = 327;
        meuAnime.temporadas = 5;


    }
}
