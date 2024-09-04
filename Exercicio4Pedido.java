package sistemaRestaurante;

import java.util.Random;

public abstract class Exercicio4Pedido {
    int numeroPedido;
    int quantidade;
    float valorTotal;
    String status;
    String[] itens = new String[100];

    public Exercicio4Pedido(String status, String[] itens, float valorTotal) {
        this.status = status;
        System.arraycopy(itens, 0, this.itens, 0, itens.length);
        this.valorTotal = valorTotal;
        this.numeroPedido = (new Random()).nextInt(0, 1000000);
    }

    public Exercicio4Pedido(String status){
        this.status = status;
        this.numeroPedido = (new Random()).nextInt(0, 1000000);
    }

    abstract float calcularTotal();
    abstract void adicionarItem(String novoItem, float valorItem);
    abstract void removerUltimoItem();

}
