public class Gerente extends Funcionario {
    private int tamanhoEquipe;

    public Gerente(String nome, String matricula, double salarioBase, int
            tamanhoEquipe) {
        super(nome, matricula, salarioBase);
        this.setTamanhoEquipe(tamanhoEquipe);
    }

    public int getTamanhoEquipe() {
        return this.tamanhoEquipe;
    }

    public void setTamanhoEquipe(int tamanhoEquipe) {
        this.tamanhoEquipe = Math.max(0, tamanhoEquipe);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase * 1.2 + this.tamanhoEquipe * 100.0;
    }

    @Override
    public String toString() {
        return String.format("%sCargo: Gerente\nEquipe: %d pessoas\n",
                super.toString(), this.tamanhoEquipe);
    }
}
