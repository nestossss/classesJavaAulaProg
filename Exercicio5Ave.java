package sistemaZoologico;

/**
 * A classe Exercicio5Ave representa uma ave no zoológico.
 * Implementa o comportamento específico para aves.
 */
public class Exercicio5Ave extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor para criar uma ave com nome, idade e espécie especificados.
     *
     * @param nome    O nome da ave.
     * @param idade   A idade da ave.
     * @param especie A espécie da ave.
     */
    public Exercicio5Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de uma ave, como o canto ou o chilro.
     */
    @Override
    void emitirSom() {
        System.out.println("A ave está cantando");
    }

    /**
     * Alimenta a ave com comida adequada, como sementes ou insetos.
     */
    @Override
    void alimentar() {
        System.out.println("Alimentando a ave com sementes");
    }

    /**
     * Cuida da ave, realizando tarefas como limpeza do recinto e verificação de saúde.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando da ave");
    }
}
