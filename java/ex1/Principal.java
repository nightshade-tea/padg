public class Principal {
    public static void main(String args[]) {
        Biblioteca bib = new Biblioteca(5);

        bib.listarLivros();
        bib.adicionarLivro(new Livro("Understanding the Linux Kernel",
                    "Daniel P. Bovet & Marco Cesati", 2005));
        bib.listarLivros();
        bib.emprestarLivro(0);
        bib.listarLivros();
        bib.devolverLivro(0);
        bib.listarLivros();
    }
}
