public class Aritmetica implements ICalcMedia {

    @Override
    public double CalculoMedia(double p1, double p2) {
        return (p1+p2)/2;
    }

    @Override
    public String Situacao(double CalculoMedia) {
        return (CalculoMedia>5) ? "Aprovado" : "Reprovado";
    }
}
