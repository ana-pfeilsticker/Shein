public class Main{
    public static void main(String[] args) throws Exception {

        Endereco o = new Endereco();
        o.cadastrarEndereco("72430-105", "Brasil", "Gama", "Setor Norte", "Conjunto E Casa 420", 0, "Distrito Federal", "Quadra 01");
        System.out.println(o.visualizarEndereco());
        
    }
}
