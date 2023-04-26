public class Geometrica implements ICalcMedia{
    @Override
    public double CalculoMedia(double p1, double p2) {
        return Math.sqrt(p1*p2);
    }

    @Override
    public String Situacao(double CalculoMedia) {
        return (CalculoMedia>7) ? "Aprovado" : "Reprovado";
    }
}
