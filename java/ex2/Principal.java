public class Principal {
    public static void main(String[] args) {
        Empresa e = new Empresa();

        e.adicionarFuncionario(new Desenvolvedor("João Silva", "DEV001",
                    4500.0, "Java"));
        e.adicionarFuncionario(new Desenvolvedor("Maria Santos", "DEV002",
                    5200.0, "Python"));
        e.adicionarFuncionario(new Desenvolvedor("Pedro Costa", "DEV003",
                    3800.0, "JavaScript"));
        e.adicionarFuncionario(new Desenvolvedor("Ana Oliveira", "DEV004",
                    4800.0, "C++"));
        e.adicionarFuncionario(new Gerente("Carlos Lima", "GER001", 8000.0,
                    8));
        e.adicionarFuncionario(new Gerente("Mariana Souza", "GER002", 7500.0,
                    5));
        e.adicionarFuncionario(new Desenvolvedor("Rafael Pereira", "DEV005",
                    5500.0, "Kotlin"));
        e.adicionarFuncionario(new Gerente("Fernanda Rocha", "GER003", 8500.0,
                    12));

        e.listarFuncionarios();
    }
}
