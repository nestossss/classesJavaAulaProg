package sistemaTransporte;

/**
 * A classe abstrata Exercicio3Transporte representa um meio de transporte genérico.
 * Fornece as propriedades básicas de capacidade e velocidade máxima, além dos métodos
 * abstratos para mover e parar o transporte.
 */
public abstract class Exercicio3Transporte {
    int capacidade;
    float velocidadeMaxima;

    /**
     * Construtor para criar um transporte com capacidade e velocidade máxima especificadas.
     *
     * @param capacidade      A capacidade de passageiros ou carga do transporte.
     * @param velocidadeMax   A velocidade máxima do transporte.
     */
    Exercicio3Transporte(int capacidade, float velocidadeMax) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMax;
    }

    /**
     * Método abstrato para mover o transporte.
     * Implementações específicas devem definir como o transporte se moverá.
     */
    abstract void mover();

    /**
     * Método abstrato para parar o transporte.
     * Implementações específicas devem definir como o transporte irá parar.
     */
    abstract void parar();
}
