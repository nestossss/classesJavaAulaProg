package sistemaBiblioteca;

/**
 * A classe Exercicio2Revista representa uma publicação do tipo revista na biblioteca.
 * Ela herda da classe Exercicio2Publicacao e define o comportamento específico para a devolução de revistas.
 */
public class Exercicio2Revista extends Exercicio2Publicacao {

    /**
     * Construtor da classe Exercicio2Revista.
     *
     * @param titulo O título da revista.
     * @param autor O autor da revista.
     * @param anoPublicacao O ano de publicação da revista.
     */
    Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Método para devolver a revista.
     * Define a disponibilidade da revista como true e imprime uma mensagem de confirmação.
     */
    @Override
    void devolver() {
        this.disponivel = true;
        System.out.println("Revista devolvida");
    }
}
