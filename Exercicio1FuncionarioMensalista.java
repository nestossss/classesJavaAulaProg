package sistemaPagamento;

public class Exercicio1FuncionarioMensalista extends Exercicio1Funcionario implements Exercicio1Pagamento {

    public Exercicio1FuncionarioMensalista(String nome, float salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Retorna o salário base do mês
     * @return salario final
     */
    @Override
    float calcularSalario() {
        return salarioBase;
    }

    /**
     * Envia o salário final ao funcionario
     */
    @Override
    public void processarPagamento() {
        System.out.println("Pagando:"+ getNome() +"\n"+ "Valor: "+calcularSalario());
    }
}
