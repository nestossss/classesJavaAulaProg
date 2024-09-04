package sistemaPagamento;

public abstract class Exercicio1Funcionario{
    private final String nome;
    float salarioBase;

    public Exercicio1Funcionario(String nome, float salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcular salário parra diferentes tipos de funcionário
     */
    abstract float calcularSalario();

    public String getNome() {
        return nome;
    }
}
