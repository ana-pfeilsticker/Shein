public class Endereco {

    private String cep;
    private String pais;
    private String cidade;
    private String bairro;
    private String complemento;
    private String quadra;
    private int numero;
    private String estado;

    public Endereco(String cep, String pais, String cidade, String bairro, String complemento, int numero,
            String estado, String quadra) {
        this.cep = cep;
        this.pais = pais;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.estado = estado;
        this.quadra = quadra;
    }
    public void adicionarEndereco(String cep, String pais, String cidade, String bairro, String complemento, int numero,
            String estado, String quadra) {
        this.cep = cep;
        this.pais = pais;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.estado = estado;
        this.quadra = quadra;
    }

    public String visualizarEndereco() {
        return "\nEndereco:\n\n"+ quadra +" "+ complemento+" Numero "+numero+"\n"+bairro+" "+cidade+"\n"+cep+"\n"+estado + " "+pais + "\n";
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
