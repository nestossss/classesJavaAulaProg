package sistemaJogos;

/**
 * A interface Exercicio8Multiplayer define o comportamento para jogos que suportam modo multiplayer.
 * Classes que implementam essa interface devem fornecer uma implementação para conectar jogadores.
 */
public interface Exercicio8Multiplayer {
    /**
     * Conecta jogadores para um jogo multiplayer.
     *
     * @param jogadores Lista de jogadores que irão participar do jogo.
     */
    void conectarJogadores(String[] jogadores);
}
