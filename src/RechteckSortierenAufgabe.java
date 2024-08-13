import java.util.Arrays;

class Rechteck{
    int breite;
    int hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }
    public String toString(){
        return breite*hoehe + "";
    }
}

public class RechteckSortierenAufgabe {
    public static void main(String[] args) {
        Rechteck[] rechteck={
                new Rechteck(3,4),
                new Rechteck(5,2),
                new Rechteck(10,3),
                new Rechteck(1,4),
                new Rechteck(7,8),
                new Rechteck(2,2)

        };
        System.out.println("*** Rechteck Fläche abstegiend: ");

        Arrays.sort(rechteck, (a,b) ->a.hoehe*a.breite-b.hoehe*b.breite);
        System.out.println(Arrays.toString(rechteck));

        System.out.println("*** Rechteck Fläche aufstegiend: ");

        Arrays.sort(rechteck, (a,b) ->b.hoehe*b.breite-a.hoehe*a.breite);
        System.out.println(Arrays.toString(rechteck));
    }
}
