public class Produto {

	protected String nome_produto;
    protected String categoria;
    protected double preco_produto;
    protected String cor;
    protected String descricao_produto;
    protected String origem;
    protected String tamanho;
    protected int id_produto;
    protected boolean favoritado;
	protected int quantidade_disponivel;
	
	public int getQuantidade_disponivel() {
		return quantidade_disponivel;
	}
	public void setQuantidade_disponivel(int quantidade_disponivel) {
		this.quantidade_disponivel = quantidade_disponivel;
	}
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPreco_produto() {
		return preco_produto;
	}
	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDescricao_produto() {
		return descricao_produto;
	}
	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getId_produto() {
		return id_produto;
	}
	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}
	public boolean isFavoritado() {
		return favoritado;
	}
	public void setFavoritado(boolean favoritado) {
		this.favoritado = favoritado;
	}
	
	public Produto(String nome_produto, String categoria, double preco_produto, String cor, String descricao_produto,
			String origem, String tamanho, int id_produto, boolean favoritado, int quantidade_disponivel) {
		super();
		this.nome_produto = nome_produto;
		this.categoria = categoria;
		this.preco_produto = preco_produto;
		this.cor = cor;
		this.descricao_produto = descricao_produto;
		this.origem = origem;
		this.tamanho = tamanho;
		this.id_produto = id_produto;
		this.favoritado = favoritado;
		this.quantidade_disponivel = quantidade_disponivel;
	}
	@Override
	public String toString() {
		return nome_produto +"\n"+ " Categoria: " + categoria +"\n"+ " Preco: " + preco_produto
				+"\n"+ " Cor: " + cor +"\n"+ " Descricao: " + descricao_produto +"\n"+ " Origem: " + origem +"\n"+ " Tamanho: "
				+ tamanho+"\n" + " id: " + id_produto+"\n";
	}
}
