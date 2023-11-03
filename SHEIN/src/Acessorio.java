public class Acessorio extends Produto{
    
    private String material;
    private String tipo;
    
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Acessorio(String nome_produto, String categoria, double preco_produto, String cor, String descricao_produto,
			String origem, String tamanho, int id_produto, boolean favoritado, String material, String tipo) {
		super(nome_produto, categoria, preco_produto, cor, descricao_produto, origem, tamanho, id_produto, favoritado);
		this.material = material;
		this.tipo = tipo;
	}

    
}
