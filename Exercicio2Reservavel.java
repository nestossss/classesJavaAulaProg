package sistemaBiblioteca;

/**
 * A interface Exercicio2Reservavel define o comportamento para publicações que podem ser reservadas.
 * Classes que implementam essa interface devem fornecer uma implementação para o método de reserva.
 */
public interface Exercicio2Reservavel {
    /**
     * Reserva a publicação para uma pessoa específica.
     *
     * @param nome O nome da pessoa que deseja reservar a publicação.
     */
    void reservar(String nome);
}
