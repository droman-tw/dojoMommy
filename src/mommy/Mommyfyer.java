package mommy;

/**
 * Created by droman on 6/29/16.
 */
public class Mommyfyer {

    public boolean isVowel(String character) {
        if(character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u")) {
            return true;
        }
        return false;
    }

    public String mommyfyCharacter(String character, boolean previousIsVowel) {
        if(!isVowel(character)) {
            return character;
        }
        if(!previousIsVowel) {
            return "mommy";
        }
        return "";
    }

    public String getMommyfyed(String input) {

        String output = "";
        boolean previousIsVowel = false;

        for(int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            output += mommyfyCharacter(currentChar, previousIsVowel);
            previousIsVowel = isVowel(currentChar);
        }

        return output;
    }
}
