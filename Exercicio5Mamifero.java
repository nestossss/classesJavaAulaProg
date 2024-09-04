package sistemaZoologico;

/**
 * A classe Exercicio5Mamifero representa um mamífero no zoológico.
 * Implementa o comportamento específico para mamíferos.
 */
public class Exercicio5Mamifero extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor para criar um mamífero com nome, idade e espécie especificados.
     *
     * @param nome    O nome do mamífero.
     * @param idade   A idade do mamífero.
     * @param especie A espécie do mamífero.
     */
    public Exercicio5Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de um mamífero, como um rugido ou um rosnado.
     */
    @Override
    void emitirSom() {
        System.out.println("O mamífero está rugindo");
    }

    /**
     * Alimenta o mamífero com comida adequada, como carne ou vegetais.
     */
    @Override
    void alimentar() {
        System.out.println("Alimentando o mamífero com carne");
    }

    /**
     * Cuida do mamífero, realizando tarefas como higiene e verificação de saúde.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do mamífero");
    }
}
