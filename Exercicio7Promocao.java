package sistemaEcommerce;

/**
 * A interface Exercicio7Promocao define o comportamento para produtos que podem ter promoções aplicadas.
 * Classes que implementam essa interface devem fornecer uma implementação para o método de promoção.
 */
public interface Exercicio7Promocao {
    /**
     * Aplica uma promoção ao produto, reduzindo o preço base pela porcentagem especificada.
     *
     * @param porcentagem A porcentagem de desconto a ser aplicada.
     */
    void aplicarPromocao(float porcentagem);
}
