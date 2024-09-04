package sistemaRestaurante;

public class Exercicio4PedidoReserva extends Exercicio4Pedido {
    float frete;
    String dataEntrega;
    String localEntrega;

    public Exercicio4PedidoReserva(int numeroPedido, String status, String[] pedidos, String dataEntrega, String localEntrega, float frete) {
        super(status, pedidos, numeroPedido);
        this.dataEntrega = dataEntrega;
        this.localEntrega = localEntrega;
        this.frete =  frete;
    }

    @Override
    float calcularTotal() {
        return this.valorTotal + this.frete;
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
