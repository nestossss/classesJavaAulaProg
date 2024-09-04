package sistemaZoologico;

/**
 * A classe abstrata Exercicio5Animal representa um animal genérico no zoológico.
 * Fornece as propriedades básicas de nome, idade e espécie, além dos métodos
 * abstratos para emitir som e alimentar o animal.
 */
public abstract class Exercicio5Animal {
    String nome;
    int idade;
    String especie;

    /**
     * Construtor para criar um animal com nome, idade e espécie especificados.
     *
     * @param nome    O nome do animal.
     * @param idade   A idade do animal.
     * @param especie A espécie do animal.
     */
    public Exercicio5Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato para emitir um som característico do animal.
     * Implementações específicas devem definir o som que o animal emite.
     */
    abstract void emitirSom();

    /**
     * Método abstrato para alimentar o animal.
     * Implementações específicas devem definir como o animal é alimentado.
     */
    abstract void alimentar();
}
