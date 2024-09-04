package sistemaTransporte;

/**
 * A classe Exercicio3Aviao representa um avião no sistema de transporte.
 * Implementa o comportamento de um transporte que utiliza combustível e
 * pode se mover e parar.
 */
public class Exercicio3Aviao extends Exercicio3Transporte implements Exercicio3Combustivel {

    /**
     * Construtor para criar um avião com capacidade e velocidade máxima especificadas.
     *
     * @param capacidade      A capacidade de passageiros ou carga do avião.
     * @param velocidadeMax   A velocidade máxima do avião.
     */
    Exercicio3Aviao(int capacidade, float velocidadeMax) {
        super(capacidade, velocidadeMax);
    }

    /**
     * Abastece o avião com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("Avião abastecendo");
    }

    /**
     * Move o avião, simulando o seu deslocamento.
     */
    @Override
    void mover() {
        System.out.println("Avião se movendo");
    }

    /**
     * Para o avião, simulando o término do seu deslocamento.
     */
    @Override
    void parar() {
        System.out.println("Avião parado");
    }
}
