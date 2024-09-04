package sistemaVeiculos;

/**
 * A classe abstrata Exercicio6Veiculo representa um veículo genérico.
 * Fornece as propriedades básicas de marca, modelo e ano, além dos métodos
 * abstratos para ligar, desligar e acelerar o veículo.
 */
public abstract class Exercicio6Veiculo {
    String marca;
    String modelo;
    int ano;

    /**
     * Construtor para criar um veículo com marca, modelo e ano especificados.
     *
     * @param marca  A marca do veículo.
     * @param modelo O modelo do veículo.
     * @param ano    O ano de fabricação do veículo.
     */
    public Exercicio6Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     * Implementações específicas devem definir como o veículo será ligado.
     */
    abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     * Implementações específicas devem definir como o veículo será desligado.
     */
    abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     * Implementações específicas devem definir como o veículo acelerará.
     */
    abstract void acelerar();
}
