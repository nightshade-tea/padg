import java.util.*;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public double calcularTotalFolhaPagamento() {
        Iterator<Funcionario> i = this.funcionarios.iterator();
        double total = 0;

        while ( i.hasNext() ) {
            Funcionario f = i.next();
            total += f.calcularSalario();
        }

        return total;
    }

    public void listarFuncionarios() {
        Iterator<Funcionario> i = this.funcionarios.iterator();

        System.out.println("=".repeat(31));
        System.out.println("=== Funcionários da empresa ===");

        while ( i.hasNext() ) {
            Funcionario f = i.next();

            System.out.println("-".repeat(31));
            System.out.print(f.toString());
            System.out.println("-".repeat(31));
        }

        System.out.println("=".repeat(31));
        System.out.printf("\nTotal da folha salarial: R$ %.2f\n",
                this.calcularTotalFolhaPagamento());
    }
}
