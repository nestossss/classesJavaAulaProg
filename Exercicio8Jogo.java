package sistemaJogos;

/**
 * A classe abstrata Exercicio8Jogo representa um jogo genérico no sistema de jogos.
 * Ela serve como base para diferentes tipos de jogos, como jogos de cartas, digitais e de tabuleiro.
 */
public abstract class Exercicio8Jogo {
    /**
     * Título do jogo.
     */
    String titulo;

    /**
     * Gênero do jogo (ex: Ação, Aventura, Estratégia).
     */
    String genero;

    /**
     * Faixa etária recomendada para o jogo.
     */
    int faixaEtaria;

    /**
     * Inicia o jogo.
     */
    abstract void iniciar();

    /**
     * Pausa o jogo.
     */
    abstract void pausar();

    /**
     * Finaliza o jogo.
     */
    abstract void finalizar();
}
