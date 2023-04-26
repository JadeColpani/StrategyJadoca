
public class Main {

    public static void main(String[] args) {

        Disciplina d1 = new Disciplina(new Aritmetica(),"Jade",7,0);

        d1.CalculaMedia();

        System.out.println(d1.getNome());
        System.out.println(d1.getMedia());
        System.out.println(d1.getSituacao());

        Disciplina d2 = new Disciplina(new Geometrica(),"Mari",3,10);

        d2.CalculaMedia();

        System.out.println(d2.getNome());
        System.out.println(d2.getMedia());
        System.out.println(d2.getSituacao());
    }
}
