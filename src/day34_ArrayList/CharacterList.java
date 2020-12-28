package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterList {
    public static void main(String[] args) {
        String str = "abcd@!#$etyi123lkjhaqwer%^&879";
        ArrayList<String> digits = new ArrayList<>(Arrays.asList(str.split("")));
        digits.removeIf(p->!Character.isDigit(p.charAt(0)));
        System.out.println("digits = " + digits);

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        letters.removeIf(p->!Character.isLetter(p.charAt(0)));
        System.out.println("letters = " + letters);

        ArrayList<String> specialCharacter = new ArrayList<>(Arrays.asList(str.split("")));
          /*
        specialCharacters.removeAll( digits );
        specialCharacters.removeAll( letters );
         */

        specialCharacter.removeIf(p->Character.isLetterOrDigit(p.charAt(0)));
        System.out.println("specialCharacter = " + specialCharacter);

    }
}
