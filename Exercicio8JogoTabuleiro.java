package sistemaJogos;

/**
 * A classe Exercicio8JogoTabuleiro representa um jogo de tabuleiro no sistema de jogos.
 * Exemplos incluem xadrez, damas e jogos de estratégia.
 */
public class Exercicio8JogoTabuleiro extends Exercicio8Jogo implements Exercicio8Multiplayer {

    /**
     * Inicia o jogo de tabuleiro, configurando o tabuleiro e as peças.
     */
    @Override
    void iniciar() {
        System.out.println("Iniciando o jogo de tabuleiro: " + titulo);
        // Lógica para iniciar o jogo de tabuleiro
    }

    /**
     * Pausa o jogo de tabuleiro, salvando o estado atual das peças.
     */
    @Override
    void pausar() {
        System.out.println("Jogo de tabuleiro pausado.");
        // Lógica para pausar o jogo de tabuleiro
    }

    /**
     * Finaliza o jogo de tabuleiro, declarando o vencedor e guardando as peças.
     */
    @Override
    void finalizar() {
        System.out.println("Finalizando o jogo de tabuleiro: " + titulo);
        // Lógica para finalizar o jogo de tabuleiro
    }

    /**
     * Conecta jogadores para o jogo de tabuleiro em modo multiplayer.
     *
     * @param jogadores Lista de jogadores que irão participar do jogo.
     */
    @Override
    public void conectarJogadores(String[] jogadores) {
        System.out.println("Conectando jogadores para o jogo de tabuleiro.");
        // Lógica para conectar jogadores
    }
}
