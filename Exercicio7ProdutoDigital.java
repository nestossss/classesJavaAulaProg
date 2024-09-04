package sistemaEcommerce;

/**
 * A classe Exercicio7ProdutoDigital representa um produto digital no sistema de e-commerce.
 * Exemplos incluem e-books, software, e músicas.
 */
public class Exercicio7ProdutoDigital extends Exercicio7Produto implements Exercicio7Promocao {

    /**
     * Exibe os detalhes do produto digital, incluindo nome, categoria e preço.
     */
    @Override
    void exibirDetalhes() {
        System.out.println("Produto Digital: " + nome + " | Categoria: " + categoria + " | Preço: R$ " + preco);
    }

    /**
     * Calcula o preço final do produto digital, aplicando possíveis promoções.
     *
     * @return O preço final do produto digital.
     */
    @Override
    float calcularPrecoFinal() {
        return preco;
    }

    /**
     * Aplica uma promoção ao produto digital, reduzindo o preço base pela porcentagem especificada.
     *
     * @param porcentagem A porcentagem de desconto a ser aplicada.
     */
    @Override
    public void aplicarPromocao(float porcentagem) {
        preco -= preco * (porcentagem / 100);
    }
}
