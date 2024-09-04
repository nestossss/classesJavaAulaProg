package sistemaVeiculos;

/**
 * A classe Exercicio6Moto representa uma moto no sistema de veículos.
 * Implementa o comportamento de um veículo de duas rodas.
 */
public class Exercicio6Moto extends Exercicio6Veiculo implements Manutencao {

    /**
     * Construtor para criar uma moto com marca, modelo e ano especificados.
     *
     * @param marca  A marca da moto.
     * @param modelo O modelo da moto.
     * @param ano    O ano de fabricação da moto.
     */
    public Exercicio6Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga a moto, simulando o processo de inicialização do motor.
     */
    @Override
    void ligar() {
        System.out.println("Moto ligada");
    }

    /**
     * Desliga a moto, simulando o processo de desligamento do motor.
     */
    @Override
    void desligar() {
        System.out.println("Moto desligada");
    }

    /**
     * Acelera a moto, simulando o aumento da velocidade.
     */
    @Override
    void acelerar() {
        System.out.println("Moto acelerando");
    }

    /**
     * Realiza a manutenção da moto.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção da moto realizada");
    }
}
