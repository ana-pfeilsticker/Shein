public class Pedido {

	private int valor;
    private String Endereco;
    private int cdg_comp;
    private String Pagamento;
    private Produto produto;
    private Conta_Cliente conta;
    private Cupom cupom;


    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public String getEndereco() {
        return Endereco;
    }


    public void setEndereco(String endereco) {
        Endereco = endereco;
    }


    public int getCdg_comp() {
        return cdg_comp;
    }


    public void setCdg_comp(int cdg_comp) {
        this.cdg_comp = cdg_comp;
    }


    public String getPagamento() {
        return Pagamento;
    }


    public void setPagamento(String pagamento) {
        Pagamento = pagamento;
    }


    public Produto getProduto() {
        return produto;
    }


    public void setProduto(Produto produto) {
        this.produto = produto;
    }


    public Conta_Cliente getConta() {
        return conta;
    }


    public void setConta(Conta_Cliente conta) {
        this.conta = conta;
    }


    public Cupom getCupom() {
        return cupom;
    }


    public void setCupom(Cupom cupom) {
        this.cupom = cupom;
    }


    public Pedido(int valor, String endereco, int cdg_comp, String pagamento, Produto produto, Conta_Cliente conta,
            Cupom cupom) {
        this.valor = valor;
        Endereco = endereco;
        this.cdg_comp = cdg_comp;
        Pagamento = pagamento;
        this.produto = produto;
        this.conta = conta;
        this.cupom = cupom;
    }


    @Override
    public String toString() {
        return "Pedido \n" + "Valor: " + valor + "\n" + "Endereco: " + Endereco + "\n" + "Código do pedido: " + cdg_comp + "\n" +"Forma de pagamento: "
                + Pagamento + "\n" +"Produtos: " + produto + "\n" + "Cupom: " + cupom + "]";
    }

    
}
