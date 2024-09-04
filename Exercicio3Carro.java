package sistemaTransporte;

/**
 * A classe Exercicio3Carro representa um carro no sistema de transporte.
 * Implementa o comportamento de um transporte que utiliza combustível e
 * pode se mover e parar.
 */
public class Exercicio3Carro extends Exercicio3Transporte implements Exercicio3Combustivel {

    /**
     * Construtor para criar um carro com capacidade e velocidade máxima especificadas.
     *
     * @param capacidade      A capacidade de passageiros ou carga do carro.
     * @param velocidadeMax   A velocidade máxima do carro.
     */
    Exercicio3Carro(int capacidade, float velocidadeMax) {
        super(capacidade, velocidadeMax);
    }

    /**
     * Abastece o carro com combustível.
     */
    @Override
    public void abastecer() {
        System.out.println("Carro abastecendo");
    }

    /**
     * Move o carro, simulando o seu deslocamento.
     */
    @Override
    void mover() {
        System.out.println("Carro se movendo");
    }

    /**
     * Para o carro, simulando o término do seu deslocamento.
     */
    @Override
    void parar() {
        System.out.println("Carro parado");
    }
}
