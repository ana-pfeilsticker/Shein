public abstract class Medida {
 
    private double busto;
    private double cintura;
    private double quadril;
    private double braco;
    private double comprimento_manga;
    private double comprimento_perna;

    public double getBusto() {
        return busto;
    }
    public void setBusto(double busto) {
        this.busto = busto;
    }
    public double getCintura() {
        return cintura;
    }
    public void setCintura(double cintura) {
        this.cintura = cintura;
    }
    public double getQuadril() {
        return quadril;
    }
    public void setQuadril(double quadril) {
        this.quadril = quadril;
    }
    public double getBraco() {
        return braco;
    }
    public void setBraco(double braco) {
        this.braco = braco;
    }
    public double getComprimento_manga() {
        return comprimento_manga;
    }
    public void setComprimento_manga(double comprimento_manga) {
        this.comprimento_manga = comprimento_manga;
    }
    public double getComprimento_perna() {
        return comprimento_perna;
    }
    public void setComprimento_perna(double comprimento_perna) {
        this.comprimento_perna = comprimento_perna;
    }
    
    public String retornar_tamanho(){
        String tamanho = "";
        return tamanho;
    }
}
