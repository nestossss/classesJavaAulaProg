package sistemaPagamento;

public class Exercicio1FuncionarioComissionado  extends Exercicio1Funcionario implements Exercicio1Pagamento {

    /**
     * Porcentagem da comissao por venda ( em decimal (de 0 a 1) ou em inteiro (1 a 100) );
     */
    float comissaoPorVenda;
    /**
     * Soma dos valores das vendas feitas;
     */
    float vendas;

    Exercicio1FuncionarioComissionado(String nome, float salarioBase, float comissaoPorVenda ){
        super(nome, salarioBase);
        this.comissaoPorVenda = comissaoPorVenda;
    }


    /**
     * Calcula o salario final baseado em quantas vendas o funcionario fez e sua comissao
     * @return salario final
     */
    @Override
    float calcularSalario() {
        float comissao = comissaoPorVenda >= 1? comissaoPorVenda/100 : comissaoPorVenda;
        return salarioBase + (vendas * comissao);
    }

    /**
     * Envia o salario final( calcularSalario(); ) ao funcionário e limpa a quantidade atual de vendas
     */
    @Override
    public void processarPagamento() {
        this.vendas = 0;
        System.out.println("Pagando:"+ getNome() +"\n"+ "Valor: "+calcularSalario());
    }
}
