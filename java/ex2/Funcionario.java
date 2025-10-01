public abstract class Funcionario {
    protected final String nome;
    protected final String matricula;
    protected final double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return String.format("Nome: %s\nMatrícula: %s\nSalário: R$ %.2f\n",
                this.nome, this.matricula, this.calcularSalario());
    }
}
