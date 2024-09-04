package sistemaBiblioteca;

/**
 * A classe Exercicio2Jornal representa uma publicação do tipo jornal na biblioteca.
 * Ela herda da classe Exercicio2Publicacao e possui métodos específicos para gerenciar
 * a devolução de jornais.
 */
public class Exercicio2Jornal extends Exercicio2Publicacao {

    /**
     * Construtor da classe Exercicio2Jornal.
     *
     * @param titulo O título do jornal.
     * @param autor O autor do jornal.
     * @param anoPublicacao O ano de publicação do jornal.
     */
    Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    /**
     * Método para devolver o jornal.
     * Define a disponibilidade do jornal como true e imprime uma mensagem de confirmação.
     */
    @Override
    void devolver() {
        this.disponivel = true;
        System.out.println("Jornal devolvido?");
    }
}
