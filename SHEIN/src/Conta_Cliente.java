import java.util.*;

public class Conta_Cliente extends Medida{

    private String nome_conta;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;
    private int id_Conta;
    private ArrayList<Cupom> cupons = new ArrayList<Cupom>();
    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
    
}
