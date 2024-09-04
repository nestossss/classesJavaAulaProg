package sistemaZoologico;

/**
 * A classe Exercicio5Reptil representa um réptil no zoológico.
 * Implementa o comportamento específico para répteis.
 */
public class Exercicio5Reptil extends Exercicio5Animal implements Exercicio5Cuidador {

    /**
     * Construtor para criar um réptil com nome, idade e espécie especificados.
     *
     * @param nome    O nome do réptil.
     * @param idade   A idade do réptil.
     * @param especie A espécie do réptil.
     */
    public Exercicio5Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    /**
     * Emite o som característico de um réptil, como um sibilo ou um rosnado baixo.
     */
    @Override
    void emitirSom() {
        System.out.println("O réptil está sibindo");
    }

    /**
     * Alimenta o réptil com comida adequada, como insetos ou pequenos roedores.
     */
    @Override
    void alimentar() {
        System.out.println("Alimentando o réptil com insetos");
    }

    /**
     * Cuida do réptil, realizando tarefas como limpeza do terrário e verificação de saúde.
     */
    @Override
    public void cuidar() {
        System.out.println("Cuidando do réptil");
    }
}
