public class Pedido {

	private int valor;
    private String Endereco;
    private int cdg_comp;
    private String Pagamento;
    private Produto produto;
    private Conta_Cliente conta;
    private Cupom cupom;

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
	public Cupom getCupom() {
		return cupom;
	}
	public void setCupom(String cupom) {
		cupom = cupom;
	}

	
	
}
