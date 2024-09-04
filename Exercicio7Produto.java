package sistemaEcommerce;

/**
 * A classe abstrata Exercicio7Produto representa um produto genérico no sistema de e-commerce.
 * Ela serve como base para diferentes tipos de produtos, como digitais, físicos e serviços.
 */
public abstract class Exercicio7Produto {
    /**
     * Nome do produto.
     */
    String nome;

    /**
     * Categoria do produto.
     */
    String categoria;

    /**
     * Preço base do produto.
     */
    float preco;

    /**
     * Exibe os detalhes do produto.
     */
    abstract void exibirDetalhes();

    /**
     * Calcula o preço final do produto, que pode incluir descontos, impostos, etc.
     *
     * @return O preço final do produto.
     */
    abstract float calcularPrecoFinal();
}
