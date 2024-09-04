package sistemaBiblioteca;

/**
 * A classe Exercicio2Livro representa uma publicação do tipo livro na biblioteca.
 * Ela herda da classe Exercicio2Publicacao e implementa a interface Exercicio2Reservavel,
 * permitindo que livros sejam reservados.
 */
public class Exercicio2Livro extends Exercicio2Publicacao implements Exercicio2Reservavel {
    /**
     * Nome da pessoa que reservou o livro.
     */
    String reservadoPor;

    /**
     * Indica se o livro está reservado.
     */
    boolean reservado = false;

    /**
     * Construtor da classe Exercicio2Livro.
     *
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param anoPublicacao O ano de publicação do livro.
     */
    Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Reserva o livro para uma pessoa específica.
     *
     * @param nome O nome da pessoa que deseja reservar o livro.
     */
    @Override
    public void reservar(String nome) {
        if (reservado) {
            System.out.println("Livro já reservado por: " + this.reservadoPor);
            return;
        }
        this.reservado = true;
        this.reservadoPor = nome;
        this.disponivel = false;
    }

    /**
     * Método para devolver o livro.
     * Define a disponibilidade do livro como true e imprime uma mensagem de confirmação.
     */
    @Override
    void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido");
    }
}
