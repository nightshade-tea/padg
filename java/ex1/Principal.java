public class Principal {
    public static void main(String args[]) {
        Biblioteca bib = new Biblioteca(5);

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 1. Biblioteca vazia\n");
        bib.listarLivros();

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 2. Adicionar livros\n");
        bib.adicionarLivro(new Livro("Understanding the Linux Kernel", "Daniel P. Bovet", 2005));
        bib.adicionarLivro(new Livro("Clean Code", "Robert C. Martin", 2008));
        bib.adicionarLivro(new Livro("Domain-Driven Design", "Eric Evans", 2003));
        bib.adicionarLivro(new Livro("The Pragmatic Programmer", "Andrew Hunt", 1999));
        bib.adicionarLivro(new Livro("Design Patterns", "Erich Gamma", 1994));
        bib.listarLivros();

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 3. Tentar adicionar além da capacidade\n");
        bib.adicionarLivro(new Livro("Extra Book", "Author", 2020));

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 4. Emprestar livros\n");
        System.out.println("Emprestando livro 0...");
        bib.emprestarLivro(0);
        System.out.println("Emprestando livro 2...");
        bib.emprestarLivro(2);
        System.out.println("Emprestando livro 4...");
        bib.emprestarLivro(4);
        bib.listarLivros();

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 5. Tentar emprestar livro já emprestado\n");
        bib.emprestarLivro(0);

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 6. Tentar emprestar livros com id inválido\n");
        bib.emprestarLivro(10);
        bib.emprestarLivro(-1);

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 7. Devolver livros\n");
        System.out.println("Devolvendo livro 2...");
        bib.devolverLivro(2);
        System.out.println("Devolvendo livro 0...");
        bib.devolverLivro(0);
        bib.listarLivros();

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 8. Tentar devolver livros com id inválido\n");
        bib.emprestarLivro(99);
        bib.emprestarLivro(-5);

        //---------------------------------------------------------------------
        System.out.printf("\nTeste 9. Empréstimo após devolução\n");
        System.out.println("Emprestando livro 2 novamente...");
        bib.emprestarLivro(2);
        bib.listarLivros();

        //---------------------------------------------------------------------
        System.out.println("Estado final");
        bib.listarLivros();
        System.out.printf("Livros na biblioteca: %d / 5\n",
                bib.getQuantidadeLivros());
    }
}
