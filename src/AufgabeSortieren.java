import java.util.Arrays;
import java.util.Comparator;


interface StringTester{
    int test(String s1, String s2);
}
class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.length()-s2.length();
    }
}

public class AufgabeSortieren  {
    public static void main(String[] args) {
        String[] arr={
                "aa",
                "vg",
                "cvds",
                "ewl",
                "plaw",
                "uufrwqt",
                "wrkgk",
                "s",
                "hfea"
        };

        System.out.println("*** nicht sortiert");
        System.out.println(Arrays.toString(arr));

        System.out.println("*** aufsteigend sortiert");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("*** nach lönge sortiert");
       Comparator<String> cmp = new StringComparator();
        Arrays.sort(arr, cmp);
        System.out.println(Arrays.toString(arr));

        System.out.println("*** nach lönge sortiert mit Lambda");

       printSelected(arr, (s1,s2) -> s1.length()-s2.length());

    }
    static void printSelected(String[] arr, StringTester tester) {
        for (int i = 0; i < arr.length; i++) {
                String s1 = arr[i];
                String s2=s1;
                int result = tester.test(s1, s2);
                if (result==0) {
                    System.out.println(i + 1 + ". " +s1);
                }
            }
        }

}
