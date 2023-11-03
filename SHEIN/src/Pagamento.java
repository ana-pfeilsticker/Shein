public class Pagamento {
    
    private int num_cartao;
    private String nome_titular;
    private String bandeira;
    private String vencimento;
    private int cod_seg;

    public Pagamento(int num_cartao, String nome_titular, String bandeira, String vencimento, int cod_seg) {
        this.num_cartao = num_cartao;
        this.nome_titular = nome_titular;
        this.bandeira = bandeira;
        this.vencimento = vencimento;
        this.cod_seg = cod_seg;
    }

    public int getNum_cartao() {
        return num_cartao;
    }
    public void setNum_cartao(int num_cartao) {
        this.num_cartao = num_cartao;
    }
    public String getNome_titular() {
        return nome_titular;
    }
    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getVencimento() {
        return vencimento;
    }
    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    public int getCod_seg() {
        return cod_seg;
    }
    public void setCod_seg(int cod_seg) {
        this.cod_seg = cod_seg;
    }
   
}
