package sistemaRestaurante;

public class Exercicio4PedidoDelivery extends Exercicio4Pedido implements Exercicio4Desconto {

    float frete;
    String localizacao;

    public Exercicio4PedidoDelivery(int numeroPedido, String status, String[] pedidos) {
        super(status, pedidos, numeroPedido);
    }


    @Override
    public void aplicarDesconto(float porcentagem) {
        this.valorTotal = this.valorTotal*porcentagem;
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
