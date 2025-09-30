public class Biblioteca {
    private Livro[] livros;
    private int quantidadeLivros;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.quantidadeLivros = 0;
    }

    public int getQuantidadeLivros() {
        return this.quantidadeLivros;
    }

    public void adicionarLivro(Livro livro) {
        if (this.quantidadeLivros  >= this.livros.length) {
            System.err.println("Biblioteca está cheia!");
            return;
        }

        this.livros[quantidadeLivros] = livro;
        this.quantidadeLivros++;
    }

    public void emprestarLivro(int id) {
        if (id < 0 || id >= this.quantidadeLivros) {
            System.err.printf("Livro %d inexistente!\n", id);
            return;
        }

        if (!this.livros[id].isDisponivel()) {
            System.err.printf("Livro %d indisponível!\n", id);
            return;
        }

        this.livros[id].setDisponivel(false);
    }

    public void devolverLivro(int id) {
        if (id < 0 || id >= this.quantidadeLivros) {
            System.err.printf("Livro %d inexistente!\n", id);
            return;
        }

        this.livros[id].setDisponivel(true);
    }

    public void listarLivros() {
        System.out.println();
        System.out.println("-".repeat(80));
        System.out.println("Lista de livros:");
        System.out.println("=".repeat(80));

        for (int i = 0; i < this.quantidadeLivros; i++) {
            System.out.printf("(%d) ", i);
            System.out.println(this.livros[i].toString());
        }

        System.out.println("-".repeat(80));
        System.out.println();
    }
}
