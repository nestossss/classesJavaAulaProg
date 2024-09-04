package sistemaJogos;

/**
 * A classe Exercicio8JogoCartas representa um jogo de cartas no sistema de jogos.
 * Exemplos incluem pôquer, truco e blackjack.
 */
public class Exercicio8JogoCartas extends Exercicio8Jogo implements Exercicio8Multiplayer {

    /**
     * Inicia o jogo de cartas, configurando as cartas e distribuindo-as entre os jogadores.
     */
    @Override
    void iniciar() {
        System.out.println("Iniciando o jogo de cartas: " + titulo);
        // Lógica para iniciar o jogo de cartas
    }

    /**
     * Pausa o jogo de cartas, salvando o estado atual.
     */
    @Override
    void pausar() {
        System.out.println("Jogo de cartas pausado.");
        // Lógica para pausar o jogo de cartas
    }

    /**
     * Finaliza o jogo de cartas, declarando o vencedor e encerrando a partida.
     */
    @Override
    void finalizar() {
        System.out.println("Finalizando o jogo de cartas: " + titulo);
        // Lógica para finalizar o jogo de cartas
    }

    /**
     * Conecta jogadores para o jogo de cartas em modo multiplayer.
     *
     * @param jogadores Lista de jogadores que irão participar do jogo.
     */
    @Override
    public void conectarJogadores(String[] jogadores) {
        System.out.println("Conectando jogadores para o jogo de cartas.");
        // Lógica para conectar jogadores
    }
}
