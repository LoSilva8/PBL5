public class Main {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario1 = new Usuario("Juninho");

        // Criando uma playlist
        Playlist playlist1 = new Playlist("Rotação do Juninho");

        // Criando algumas músicas
        Musica musica1 = new Musica("Solo Dolo, PT III", 300);
        Musica musica2 = new Musica("way back", 300);
        Musica musica3 = new Musica("Doing It Wrong", 270);

        // Criando um plano de assinatura
        PlanoAssinatura plano1 = new PlanoAssinatura("Premium");

        // Adicionando a playlist ao usuário
        usuario1.adicionarPlaylist(playlist1);

        // Adicionando músicas à playlist
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        playlist1.adicionarMusica(musica3);

        // Exibindo informações
        System.out.println("Nome do usuário: " + usuario1.getNome());
        System.out.println("Playlists de " + usuario1.getNome() + ":");
        for (Playlist playlist : usuario1.getPlaylists()) {
            System.out.println("- " + playlist.getNome());
            System.out.println("   Músicas:");

            System.out.println("Plano de assinatura: " + plano1.getTipo());
        }
    }

}
