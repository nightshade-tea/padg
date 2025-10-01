public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, String matricula, double salarioBase,
            String linguagem) {
        super(nome, matricula, salarioBase);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return this.linguagem;
    }

    public void setLinguagem(String lingugagem) {
        this.linguagem = linguagem;
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * 1.1;
    }

    @Override
    public String toString() {
        return String.format("%s\nCargo: Desenvolvedor\nLinguagem: %s\n",
                super.toString(), this.linguagem);
    }
}
