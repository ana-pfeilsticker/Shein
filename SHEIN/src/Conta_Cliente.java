import java.util.*;

public class Conta_Cliente extends Medida{

    private String nome_conta;
    private String cpf;
    private String email;
    private String telefone;
    private int id_Conta;
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public Conta_Cliente(String nome_conta, String cpf, String email, String telefone, int id_Conta,
            ArrayList<Cupom> cupom, ArrayList<Endereco> enderecos, ArrayList<Pagamento> pagamentos, ArrayList<Pedido> pedidos) {
        this.nome_conta = nome_conta;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.id_Conta = id_Conta;
        this.cupons = cupom;
        this.enderecos = enderecos;
        this.pagamentos = pagamentos;
        this.pedidos = pedidos;
    }
    
    public boolean excluirConta(){
        try{
            this.nome_conta = null;
            this.cpf = null;
            this.email = null;
            this.telefone = null;
            this.id_Conta = 0;
            this.cupons = null;
            this.enderecos = null;
            this.pagamentos = null;
            this.pedidos = null;
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome_conta +"\n"+ "CPF: " + cpf+"\n" + "e-mail: " + email +"\n"+ "Telefone: "
                + telefone +"\n"+ "ID: " + id_Conta +"\n"+ "Cupom: " + cupons+"\n" + "Enderecos: "
                + enderecos +"\n"+ "Pagamentos: " + pagamentos +"\n"+ "Pedidos: " + pedidos+"\n";
    }
}
