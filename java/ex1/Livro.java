public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        String tituloFmt = this.titulo.length() > 28 ?
            this.titulo.substring(0, 25) + "..." : this.titulo;
        String autorFmt = this.autor.length() > 12 ?
            this.autor.substring(0, 9) + "..." : this.autor;
        String disponivelFmt = this.disponivel ? "Sim" : "Não";

        return String.format("Livro: %-28s | Autor: %-12s | Disponível: %-3s",
                tituloFmt, autorFmt, disponivelFmt);
    }
}
