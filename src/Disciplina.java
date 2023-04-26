public class Disciplina {
    private ICalcMedia calculo;
    private double p1;
    private double p2;
    public double media;
    private String nome;
    public String situacao;

    public double getP1() {
        return p1;
    }
    public void setP1(double p1) {
        this.p1 = p1;
    }
    public double getP2() {
        return p2;
    }
    public void setP2(double p2) {
        this.p2 = p2;
    }
    public double getMedia() {
        return media;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSituacao() {
        return situacao;
    }
    public Disciplina()
    {

    }
    public Disciplina(ICalcMedia calculo, String nome, double p1, double p2){
        this.calculo = calculo;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void CalculaMedia() {
        double resultado = this.calculo.CalculoMedia(this.p1, this.p2);
        this.media = resultado;
        this.situacao = this.calculo.Situacao(resultado);
    }
}


