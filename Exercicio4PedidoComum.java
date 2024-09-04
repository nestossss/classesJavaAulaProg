package sistemaRestaurante;

public class Exercicio4PedidoComum extends Exercicio4Pedido implements Exercicio4Desconto {
    public Exercicio4PedidoComum(int numeroPedido, String status, String[] pedidos) {
        super(status, pedidos, numeroPedido);
    }

    @Override
    float calcularTotal() {
        return this.valorTotal;
    }

    @Override
    public void aplicarDesconto(float porcentagem) {
        this.valorTotal = this.valorTotal * porcentagem;
    }

    @Override
    void adicionarItem(String novoItem, float valorItem) {
        this.itens[this.itens.length-1] = novoItem;
        this.quantidade++;
        this.valorTotal = this.valorTotal + valorItem;
    }

    @Override
    void removerUltimoItem() {
        this.itens[--this.quantidade] = "";
    }

}
