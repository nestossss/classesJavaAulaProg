package sistemaEcommerce;

/**
 * A classe Exercicio7ProdutoServico representa um serviço oferecido no sistema de e-commerce.
 * Exemplos incluem consultorias, aulas online, e suporte técnico.
 */
public class Exercicio7ProdutoServico extends Exercicio7Produto {

    /**
     * Exibe os detalhes do serviço, incluindo nome, categoria e preço.
     */
    @Override
    void exibirDetalhes() {
        System.out.println("Serviço: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco);
    }

    /**
     * Calcula o preço final do serviço. Como serviços não têm custos adicionais, o preço é o base.
     *
     * @return O preço final do serviço.
     */
    @Override
    float calcularPrecoFinal() {
        return preco;
    }
}
