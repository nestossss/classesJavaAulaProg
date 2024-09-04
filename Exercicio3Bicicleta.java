package sistemaTransporte;

/**
 * A classe Exercicio3Bicicleta representa uma bicicleta no sistema de transporte.
 * Como bicicletas não utilizam combustível, essa classe não implementa a interface
 * Exercicio3Combustivel.
 */
public class Exercicio3Bicicleta extends Exercicio3Transporte {

    /**
     * Construtor para criar uma bicicleta com capacidade e velocidade máxima especificadas.
     *
     * @param capacidade      A capacidade de carga da bicicleta (geralmente para passageiros).
     * @param velocidadeMax   A velocidade máxima da bicicleta.
     */
    Exercicio3Bicicleta(int capacidade, float velocidadeMax) {
        super(capacidade, velocidadeMax);
    }

    /**
     * Move a bicicleta, simulando o seu deslocamento.
     */
    @Override
    void mover() {
        System.out.println("Bicicleta se movendo");
    }

    /**
     * Para a bicicleta, simulando o término do seu deslocamento.
     */
    @Override
    void parar() {
        System.out.println("Bicicleta parada");
    }
}
