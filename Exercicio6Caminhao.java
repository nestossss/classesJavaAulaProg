package sistemaVeiculos;

/**
 * A classe Exercicio6Caminhao representa um caminhão no sistema de veículos.
 * Implementa o comportamento de um veículo grande e pesado.
 */
public class Exercicio6Caminhao extends Exercicio6Veiculo implements Manutencao {

    /**
     * Construtor para criar um caminhão com marca, modelo e ano especificados.
     *
     * @param marca  A marca do caminhão.
     * @param modelo O modelo do caminhão.
     * @param ano    O ano de fabricação do caminhão.
     */
    public Exercicio6Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    /**
     * Liga o caminhão, simulando o processo de inicialização do motor.
     */
    @Override
    void ligar() {
        System.out.println("Caminhão ligado");
    }

    /**
     * Desliga o caminhão, simulando o processo de desligamento do motor.
     */
    @Override
    void desligar() {
        System.out.println("Caminhão desligado");
    }

    /**
     * Acelera o caminhão, simulando o aumento da velocidade.
     */
    @Override
    void acelerar() {
        System.out.println("Caminhão acelerando");
    }

    /**
     * Realiza a manutenção do caminhão.
     */
    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção do caminhão realizada");
    }
}
