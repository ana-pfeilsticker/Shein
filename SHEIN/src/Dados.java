import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Dados {

    /*private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int qntd_produtos = 0;
    private ArrayList<Conta_Cliente> contas = new ArrayList<Conta_Cliente>();
    private int qntd_contas = 0;
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private int qntd_cupons = 0;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    private int qntd_pedidos = 0;
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private int qntd_pagamentos = 0;
    private ArrayList<Medida> medidas = new ArrayList<Medida>();
    private int qntd_medidas = 0;
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private int qntd_endereco = 0;*/

    private ArrayList<String> primeiro_nome = new ArrayList<>(Arrays.asList("Alice","Bob","Charlie","Diana","Eva","Frank","Grace","Henry","Isabella","Jack","Kate","Liam","Mia","Noah","Olivia"));
    private ArrayList<String> segundo_nome = new ArrayList<>(Arrays.asList("Johnson","Smith","Williams","Brown","Davis","Miller","Wilson","Martinez","Thompson","Garcia","Rodriguez","Lopez","Lee","Perez","Scott"));
    private ArrayList<String> ddd = new ArrayList<>(Arrays.asList("11", "12", "13", "14", "15", "16", "17", "18", "19", "21", "22", "24", "27", "28","31", "32", "33", "34", "35", "37", "38", "41", "42", "43", "44", "45", "46", "47", "48","49", "51", "53", "54", "55", "61", "62", "63", "64", "65", "66", "67", "68", "69", "71","73", "74", "75", "77", "79", "81", "82", "83", "84", "85", "86", "87", "88", "89", "91","92", "93", "94", "95", "96", "97", "98", "99"));

    private ArrayList<String> nomes = new ArrayList<String>();
    private ArrayList<String> CPF = new ArrayList<String>();

    private ArrayList<String> email = new ArrayList<String>();
    private ArrayList<String> telefone = new ArrayList<String>();

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
            CPF.add(cpftemp);
            cpftemp = "";
        }
        // gerar nomes e email
        String nometemp = "";
        String emailtemp = "";
        for (int i = 0; i < 15; i++){
            nometemp = "";
            emailtemp = "";
            Random rand = new Random();
            int numeroAleatorio1 = rand.nextInt(15);
            int numeroAleatorio2 = rand.nextInt(15);
            emailtemp += primeiro_nome.get(numeroAleatorio1);
            emailtemp += segundo_nome.get(numeroAleatorio2);
            emailtemp += "@gmail.com";
            nometemp += primeiro_nome.get(numeroAleatorio1);
            nometemp+= " ";
            nometemp += segundo_nome.get(numeroAleatorio2);
            nomes.add(nometemp);
            email.add(emailtemp);
        }
        //gerar telefone
        String telefonetemp = "";
        Random rand = new Random();
        for (int i = 0; i < 15; i++){
            telefonetemp = "";
            int numeroAleatorio3 = rand.nextInt(67);
            telefonetemp += "(";
            telefonetemp += ddd.get(numeroAleatorio3);
            telefonetemp += ")9";
            for (int j = 0; j < 8; j++){
                if (j == 4){
                    telefonetemp += "-";
                }
                int numeroAleatorio4 = rand.nextInt(10);
                telefonetemp += numeroAleatorio4;
            }
            telefone.add(telefonetemp);
        }

    }
    public ArrayList<String> visualizar(){
        return telefone;
    }
}