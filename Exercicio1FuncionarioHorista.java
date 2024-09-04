package sistemaPagamento;

public class Exercicio1FuncionarioHorista extends Exercicio1Funcionario implements Exercicio1Pagamento {

    /**
     * Quantidade de horas trabalhadas (são contadas apenas horas inteiras)
     */
    int horasTrabalhadas;
    /**
     * Valor em reais ganho por hora trabalhada
     */
    float valorPorHora;

    public Exercicio1FuncionarioHorista(String nome, float salarioBase, float valorPorHora) {
        super(nome, salarioBase);
        this.valorPorHora = valorPorHora;
    }

    /**
     * Multiplica a quantidade de horas trabalhadas e o valor por hora pra calcular o salario final
     * @return salario final
     */
    @Override
    float calcularSalario() {
        return this.salarioBase + (horasTrabalhadas * valorPorHora);
    }

    /**
     * Envia dinheiro ao funcionário e limpa a quantidade de horas trabalhadas
     */
    @Override
    public void processarPagamento() {
        this.horasTrabalhadas = 0;
        System.out.println("Pagando:"+ getNome() +"\n"+ "Valor: "+calcularSalario());
    }
}
