<<<<<<< HEAD
public abstract class Cupom {
=======
public class Cupom {
>>>>>>> 71a519826e253751321ffe78881d028e7fa99cf7

    private String nome_cupom;
    private int desconto;
    private String desc_cupom;
    private int codigo;
    private int validade;

    public Cupom(String nome_cupom, int desconto, String desc_cupom, int codigo, int validade) {
        this.nome_cupom = nome_cupom;
        this.desconto = desconto;
        this.desc_cupom = desc_cupom;
        this.codigo = codigo;
        this.validade = validade;
    }
<<<<<<< HEAD
    @Override
    public String toString() {
        return "Cupom [nome_cupom=" + nome_cupom + ", desconto=" + desconto + ", desc_cupom=" + desc_cupom + ", codigo="
                + codigo + ", validade=" + validade + "]";
=======

    @Override
    public String toString() {
        return "Cupom: " + nome_cupom + "\n" + "Desconto: " + desconto +"\n"+ "Descriçao: " + desc_cupom+"\n" + "Codigo: "
        +codigo + "\n"+"Validade: " + validade;
>>>>>>> 71a519826e253751321ffe78881d028e7fa99cf7
    }

}
