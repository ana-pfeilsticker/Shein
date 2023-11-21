import java.util.*;

public class Main{
		
	
	
	public static void main(String[] args) throws Exception {
        Dados dados = new Dados();
        dados.gerarDADOS();
        ArrayList<Produto> produtos = dados.getProdutos();
        ArrayList<Pedido> pedidos = dados.getPedidos();
        ArrayList<Conta_Cliente> contas = dados.getContas();
        ArrayList<Cupom> cupons = dados.getCupons();
        ArrayList<Endereco> enderecos = dados.getEnderecos();
        ArrayList<Pagamento> pagamentos = dados.getPagamentos();
        
        
        Scanner scanner = new Scanner(System.in);
        int opcao, opcaoConta;
        String categoria;


        do{
        	System.out.println("Bem vindo a Shein\n");
            System.out.println("---------------MENU---------------");
            System.out.println("1. Visualizar Conta");
            System.out.println("2. Visualizar Pedido");
            System.out.println("3. Ver Todos os Produtos");
            System.out.println("4. Ver produtos por categoria");
            System.out.println("5. Sair");
            System.out.print("Escolha uma Opcao: ");
            opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                	System.out.println("Digite o ID da conta: (1 - 15)");
                	opcaoConta = scanner.nextInt();
                	exibirContas(contas, cupons, enderecos, pagamentos, pedidos, opcaoConta);
                    break;
                case 2:
                	exibirPedidos(pedidos);
                    break;
                case 3:
                	exibirProdutos(produtos);
                    break;
                case 4:
                	System.out.println("Digite a categoria desejada: (Bolsa, Acessorio, Roupa)");
                	categoria = scanner.next();
                    categoria = categoria.substring(0, 1).toUpperCase() + categoria.substring(1).toLowerCase();
                    exibirProdutosCategoria(produtos, categoria);
                    break;
                case 5:
                	System.out.println("Saindo. Volte Sempre !");
                	break;
                default:
                    System.out.println("Opção Inválida !");
            }
        }while(opcao != 5);
   }


public static void exibirProdutos(ArrayList<Produto> produtos) {
    // Exibir os produtos e suas quantidades
    for (Produto produto : produtos) {
        System.out.println(produto.toString() + " Quantidade: " + produto.getQuantidade_disponivel() + "\n\n------------------------------------------------------------------------------------");
    }
}

public static void exibirProdutosCategoria(ArrayList<Produto> produtos, String categoria) {
	int a = 0;
	for (int i = 0; i < produtos.size(); i++){
        if (produtos.get(i).getCategoria().equals(categoria)){
            System.out.println(produtos.get(i).toString());
        }
        a++;
    }
	if(a == 0)
		System.out.println("Nâo encontrado !");
}

public static void exibirContas(ArrayList<Conta_Cliente> contas, ArrayList<Cupom> cupons, ArrayList<Endereco> enderecos, ArrayList<Pagamento> pagamentos, ArrayList<Pedido> pedidos, int opcaoConta) {

	for(Conta_Cliente conta: contas) {
		if(opcaoConta == conta.getId_Conta()) {
		System.out.println(conta.infoConta());
		
		Scanner scanner = new Scanner(System.in);
        int opcao;
		
		do{ 
			
			System.out.print("\n");
			
            System.out.println("1. Visualizar Cupons");
            System.out.println("2. Visualizar Enderecos");
            System.out.println("3. Visualizar Pagamentos");
            System.out.println("4. Ver todos os Pedidos");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma Opcao: ");
            
            
            //scanner.nextLine();
            
            opcao = scanner.nextInt();
            System.out.print("\n");
            
            switch(opcao){
                case 1:
                	for(Cupom cupom: contas.get(opcaoConta).getCupons()) {
                		System.out.println(cupom.toString()); //cupom.toString()
                	};
                	System.out.print("------------------------------------------------------------------\n");
                    break;
                case 2:
                	for(Endereco endereco: contas.get(opcaoConta).getEnderecos()) {
                		System.out.println(endereco.visualizarEndereco());
                	};
                	System.out.print("------------------------------------------------------------------\n");
                    break;
                case 3:
                	for(Pagamento pagamento: contas.get(opcaoConta).getPagamentos()) {
                		System.out.println(pagamento.toString());
                	};
                	System.out.print("------------------------------------------------------------------\n");
                    break;
                case 4:
                	int ultimoElemento = 1;
                	for(Pedido pedido: contas.get(opcaoConta).getPedidos()) {
                		
                		System.out.println(pedido.visualizarPedido());
                		System.out.println("\n                             Produtos Comprados");
                		for (Produto produto: pedido.getProduto()) {
                			System.out.println("\nProduto: " + produto.getNome_produto().trim() + "\n" + "ID do Produto: " + produto.getId_produto());
                		}
                		
                		if (pedidos.size() == ultimoElemento) {
                			continue;
                		}
                		else {
                        	System.out.print("\n------------------------------------------------------------------\n");
                		}
                		ultimoElemento++;
                			
                	};
                	System.out.print("\n------------------------------------------------------------------\n");
                    break;
                case 5:
                	break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }while(opcao != 5);
		
		
		
		//System.out.println("----------------------------------------------------------------------------------------------");
		//System.out.println("Quantidade de Contas: "+contas.size());
		}
	}
	
}

public static void exibirPedidos(ArrayList<Pedido> pedidos) {
	for(Pedido pedido: pedidos) {
		System.out.println(pedido.toString());
		System.out.println("----------------------------------------------------------------------------------------------");
	}
}
}