import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dados {

    private ArrayList<String> primeiro_nome = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","Diana","Eva","Frank","Grace","Henry","Isabella","Jack","Kate","Liam","Mia","Noah","Olivia"));
    private ArrayList<String> segundo_nome = new ArrayList<>(Arrays.asList("Johnson","Smith","Williams","Brown","Davis","Miller","Wilson","Martinez","Thompson","Garcia","Rodriguez","Lopez","Lee","Perez","Scott"));
    private ArrayList<String> ddd = new ArrayList<>(Arrays.asList("11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24", "27", "28","31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47", "48","49", "51", "53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71","73", "74", "75", "77", "79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91","92", "93", "94", "95", "96", "97", "98", "99"));

    private ArrayList<String> nomes = new ArrayList<String>();
    private ArrayList<String> CPFS = new ArrayList<String>();
    private ArrayList<String> emails = new ArrayList<String>();
    private ArrayList<String> telefones = new ArrayList<String>();
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private ArrayList<Integer> ids = new ArrayList<Integer>();
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void gerarDADOS(){


        // gerar cpfs
        String cpftemp = "";
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 11; j++){
                Random rand = new Random();
                int numeroAleatorio = rand.nextInt(10);
                String numcpf = String.valueOf(numeroAleatorio);
                cpftemp+= numcpf;
                if (j == 2 || j == 5){
                    cpftemp += ".";
                }
                if (j == 8){
                    cpftemp += "-";
                }
            }
            CPFS.add(cpftemp);
            cpftemp = "";
        }


        // gerar nomes e emails
        String nometemp = "";
        String emailstemp = "";
        for (int i = 0; i < 15; i++){
            nometemp = "";
            emailstemp = "";
            Random rand = new Random();
            int numeroAleatorio1 = rand.nextInt(15);
            int numeroAleatorio2 = rand.nextInt(15);
            emailstemp += primeiro_nome.get(numeroAleatorio1);
            emailstemp += segundo_nome.get(numeroAleatorio2);
            emailstemp += "@gmail.com";
            nometemp += primeiro_nome.get(numeroAleatorio1);
            nometemp+= " ";
            nometemp += segundo_nome.get(numeroAleatorio2);
            nomes.add(nometemp);
            emails.add(emailstemp);
        }


        //gerar telefones
        String telefonestemp = "";
        Random rand = new Random();
        for (int i = 0; i < 15; i++){
            telefonestemp = "";
            int numeroAleatorio3 = rand.nextInt(67);
            telefonestemp += "(";
            telefonestemp += ddd.get(numeroAleatorio3);
            telefonestemp += ")9";
            for (int j = 0; j < 8; j++){
                if (j == 4){
                    telefonestemp += "-";
                }
                int numeroAleatorio4 = rand.nextInt(10);
                telefonestemp += numeroAleatorio4;
            }
            telefones.add(telefonestemp);
        }


        int idstemp = 0;
        for (int i = 0; i < 15; i++){


            //gerar cupons
            Cupom cupom = new Cupom("Cupom "+(i+1), (i+1)*2, "Descricao "+(i+1), i, i*3);
            cupons.add(cupom);


            //gerar ids
            Random random = new Random();
            idstemp = random.nextInt(1000);
            ids.add(idstemp);


            //gerar enderecos
            Endereco endereco = new Endereco("Cep "+(i+1), "Pais "+(i+1), "Cidade "+(i+1)
            , "Bairro "+(i+1), "Complemento "+(i+1), i+1, "Estado "+(i+1), "Quadra "+(i+1));
            enderecos.add(endereco);


            //gerar pagamentos
            Pagamento pagamento = new Pagamento();
            Random random1 = new Random();
            String numtemp = "";
            for (int j = 0; j < 16; j++){
                numtemp += String.valueOf(random1.nextInt(10));                
            }
            pagamento.adicionarPagamento(numtemp, nomes.get(random.nextInt(15)), "Bandeira: "+(i+1), ""+(i+1), (i+1));
            pagamentos.add(pagamento);
            

            //gerar produtos
            int j = 0;
            while (produtos.size() < 15){
                Bolsa bolsa = new Bolsa("\nBolsa "+(j+1), String.valueOf((j+1)), (j+1)*random.nextInt(20), String.valueOf((j+1)),String.valueOf((j+1)), String.valueOf((j+1))
                    ,String.valueOf((j+1)), j+1, false, String.valueOf((j+1)), String.valueOf((j+1)), (j+1)*random.nextInt(20));
                Acessorio acessorio = new Acessorio("\nAcessorio "+(j+1), String.valueOf((j+1)), (j+1)*random.nextInt(20), String.valueOf((j+1)),String.valueOf((j+1)), String.valueOf((j+1))
                    ,String.valueOf((j+1)), j+1, false, String.valueOf((j+1)), ""+(j+1), (i+1)*random.nextInt(20));
                Roupa roupa = new Roupa("\nRoupa "+(j+1), String.valueOf((j+1)), (j+1)*random.nextInt(20), String.valueOf((j+1)),String.valueOf((j+1)), String.valueOf((j+1))
                    ,String.valueOf((j+1)), j+1, false, ""+(j+1), ""+(j+1), (i+1)*random.nextInt(20));
                produtos.add(bolsa);
                produtos.add(acessorio);
                produtos.add(roupa);
                j++;
            }

            //gerar pedidos
            int valor = 0;
            for (int k = 0; k < produtos.size(); k++){
                valor += produtos.get(i).getPreco_produto();
            }
            valor *= rand.nextInt(2);
            Pedido pedido = new Pedido(valor, enderecos.get(rand.nextInt(15)), (i+1)*2
            , pagamentos.get(rand.nextInt(15)), produtos);
            pedidos.add(pedido);
        }
    }




    public ArrayList<Pedido> visualizar(){
        return pedidos;
    }




    
    //mostra todos os produtos
	public static String listarProdutos(ArrayList<Produto> produtos) {
		for(Produto produto : produtos){
			return produto.toString();
        }
        return "Sem produtos";
    }
	
	
	//buscar prosutos por categoria
	public static String buscarCategoria(ArrayList<Produto> produtos, String categoria) {
		for(Produto produto : produtos){
			if(produto.getCategoria() == categoria) {
				return produto.toString();
			}
	    }
        return "Nao foi encontrado";
    }
	
	
	//buscar produtos por nome
	public static String buscarNome(ArrayList<Produto> produtos, String nome_produto) {
		for(Produto produto : produtos){
			if(produto.getNome_produto() == nome_produto) {
                return produto.toString();
			}
        }
        return "Nao foi encontrado";
    }
	
	
	//conta quantos objetos foram adicionados por nome
	/*public static int quantidade_estoque(ArrayList<Produto> produtos, String nome_produto) {
		int quantidade = 0;
		for(Produto produto : produtos)
			if(produto.getNome_produto() == nome_produto)
				quantidade++;
		
		return quantidade;
	}*/
}