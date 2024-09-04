package sistemaEcommerce;

/**
 * A classe Exercicio7ProdutoFisico representa um produto físico no sistema de e-commerce.
 * Exemplos incluem livros, eletrônicos e roupas.
 */
public class Exercicio7ProdutoFisico extends Exercicio7Produto implements Exercicio7Promocao {

    /**
     * Exibe os detalhes do produto físico, incluindo nome, categoria e preço.
     */
    @Override
    void exibirDetalhes() {
        System.out.println("Produto Físico: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco);
    }

    /**
     * Calcula o preço final do produto físico, aplicando possíveis promoções e adicionando taxas de envio.
     *
     * @return O preço final do produto físico.
     */
    @Override
    float calcularPrecoFinal() {
        // Adiciona uma taxa fixa de envio de R$ 10,00
        return preco + 10;
    }

    /**
     * Aplica uma promoção ao produto físico, reduzindo o preço base pela porcentagem especificada.
     *
     * @param porcentagem A porcentagem de desconto a ser aplicada.
     */
    @Override
    public void aplicarPromocao(float porcentagem) {
        preco -= preco * (porcentagem / 100);
    }
}
