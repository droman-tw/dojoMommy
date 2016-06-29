package mommy;

/**
 * Created by droman on 6/29/16.
 */
public class Mommyfyer {
    public String getMommyfyed(String s) {

        String Vowels= "AEIOUaeiou";

        if (s.contains("a") || s.contains("e") || s.contains("u") || s.contains("o") || s.contains("i")) {
            return "mommy";
        }

        return s;
    }
}
