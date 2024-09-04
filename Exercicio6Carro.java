package sistemaVeiculos;

/**
 * A classe Exercicio6Carro representa um carro no sistema de veículos.
 * Implementa o comportamento de um veículo de passeio.
 */
public class Exercicio6Carro extends Exercicio6Veiculo implements Manutencao {

    /**
     * Construtor para criar um carro com marca, modelo e ano especificados.
     *
     * @param marca  A marca do carro.
     * @param modelo O modelo do carro.
     * @param ano    O ano de fabricação do carro.
     */
    public Exercicio6Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o carro, simulando o processo de inicialização do motor.
     */
    @Override
    void ligar() {
        System.out.println("Carro ligado");
    }

    /**
     * Desliga o carro, simulando o processo de desligamento do motor.
     */
    @Override
    void desligar() {
        System.out.println("Carro desligado");
    }

    /**
     * Acelera o carro, simulando o aumento da velocidade.
     */
    @Override
    void acelerar() {
        System.out.println("Carro acelerando");
    }

    /**
     * Realiza a manutenção do carro.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do carro realizada");
    }
}
