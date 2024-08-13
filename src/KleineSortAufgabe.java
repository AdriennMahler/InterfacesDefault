import java.util.Arrays;
import java.util.Comparator;

  /*
        1. Array ausgeben
        2. Array aufsteigend sortieren
        3. Array ausgeben
        4. Array absteigend sortieren
        5. Array ausgeben
         */

class Buchstaben implements Comparable<Buchstaben>{

    String buchstabe;
    Buchstaben(String buchstabe){
        this.buchstabe=buchstabe;
    }

    public String getBuchstabe() {
        return buchstabe;
    }

    public String toString(){
        return "Buchstaben: "+ buchstabe;
    }

    public int compareTo(Buchstaben b2){
        int result = buchstabe.compareTo(b2.buchstabe);
        return result;
    }
}

class BuchstabenComparator implements Comparator<Buchstaben>{
    public int compare(Buchstaben b1, Buchstaben b2){
        return b2.compareTo(b1);
    }
}




public class KleineSortAufgabe {
    public static void main(String[] args) {
        Buchstaben[]arr={
                new Buchstaben("gg"),
                new Buchstaben("dd"),
                new Buchstaben("bb"),
                new Buchstaben("rr"),
                new Buchstaben("ii")
        };


        System.out.println("+++ aufsteigend sortiertes array");
        Arrays.sort(arr);
        print(arr);

        System.out.println("+++ absteigend sortiertes array");
        Comparator<Buchstaben> cmp = new BuchstabenComparator();
        Arrays.sort(arr, cmp);
        print(arr);

    }

    static void print(Buchstaben[] arr){
        for (int i=0; i< arr.length; i++){
            System.out.println(i+". "+arr[i]);
        }
    }
}
