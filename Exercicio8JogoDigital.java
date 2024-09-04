package sistemaJogos;

/**
 * A classe Exercicio8JogoDigital representa um jogo digital no sistema de jogos.
 * Exemplos incluem jogos de computador, consoles e dispositivos móveis.
 */
public class Exercicio8JogoDigital extends Exercicio8Jogo implements Exercicio8Multiplayer {

    /**
     * Inicia o jogo digital, carregando os dados necessários e iniciando a jogabilidade.
     */
    @Override
    void iniciar() {
        System.out.println("Iniciando o jogo digital: " + titulo);
        // Lógica para iniciar o jogo digital
    }

    /**
     * Pausa o jogo digital, congelando a jogabilidade e salvando o progresso.
     */
    @Override
    void pausar() {
        System.out.println("Jogo digital pausado.");
        // Lógica para pausar o jogo digital
    }

    /**
     * Finaliza o jogo digital, salvando o progresso final e encerrando a sessão de jogo.
     */
    @Override
    void finalizar() {
        System.out.println("Finalizando o jogo digital: " + titulo);
        // Lógica para finalizar o jogo digital
    }

    /**
     * Conecta jogadores para o jogo digital em modo multiplayer.
     *
     * @param jogadores Lista de jogadores que irão participar do jogo.
     */
    @Override
    public void conectarJogadores(String[] jogadores) {
        System.out.println("Conectando jogadores para o jogo digital.");
        // Lógica para conectar jogadores
    }
}
