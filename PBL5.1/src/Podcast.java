public class Podcast extends Conteudo {
    private String host;

    public Podcast(String titulo, int duracao, String host) {
        super(titulo, duracao);
        this.host = host;
    }

    // Getter e Setter
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}