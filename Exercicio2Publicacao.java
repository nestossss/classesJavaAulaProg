package sistemaBiblioteca;

/**
 * A classe abstrata Exercicio2Publicacao representa uma publicação genérica na biblioteca.
 * Ela serve como base para outras publicações específicas, como livros e revistas.
 */
public abstract class Exercicio2Publicacao {
    /**
     * O título da publicação.
     */
    String titulo;

    /**
     * O autor da publicação.
     */
    String autor;

    /**
     * O ano de publicação.
     */
    int anoPublicacao;

    /**
     * Indica se a publicação está disponível para empréstimo.
     */
    boolean disponivel = true;

    /**
     * Construtor da classe Exercicio2Publicacao.
     *
     * @param titulo O título da publicação.
     * @param autor O autor da publicação.
     * @param anoPublicacao O ano de publicação.
     */
    Exercicio2Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Empresta a publicação para um cliente, se ela estiver disponível.
     *
     * @param nomeCliente O nome do cliente que deseja emprestar a publicação.
     */
    void emprestar(String nomeCliente) {
        if (disponivel) {
            this.disponivel = false;
            System.out.println("Livro: " + this.titulo + "\nEmprestado para " + nomeCliente + " ");
            return;
        }
        System.out.println("Livro: " + this.titulo + "\nJá emprestado");
    }

    /**
     * Método abstrato para devolver a publicação.
     * As subclasses devem implementar esse método para definir o comportamento específico da devolução.
     */
    abstract void devolver();
}
