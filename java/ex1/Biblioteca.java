public class Biblioteca {
    private Livro[] livros;
    private int livre;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.livre = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (this.livre  >= this.livros.length) {
            System.err.println("Biblioteca está cheia!");
            return;
        }

        this.livros[livre] = livro;
        this.livre++;
    }

    public void listarLivros() {
        System.out.println();
        System.out.println("-".repeat(80));
        System.out.println("Lista de livros:");
        System.out.println("=".repeat(80));

        for (int i = 0; i < this.livre; i++) {
            System.out.printf("(%d) ", i);
            System.out.println(this.livros[i].toString());
        }

        System.out.println("-".repeat(80));
        System.out.println();
    }

    public void emprestarLivro(int id) {
        if (id >= this.livre) {
            System.err.println("Livro inexistente!");
            return;
        }

        if (!this.livros[id].isDisponivel()) {
            System.err.println("Livro indisponível!");
            return;
        }

        this.livros[id].setDisponivel(false);
    }

    public void devolverLivro(int id) {
        if (id >= this.livre) {
            System.err.println("Livro inexistente!");
            return;
        }

        this.livros[id].setDisponivel(true);
    }
}
