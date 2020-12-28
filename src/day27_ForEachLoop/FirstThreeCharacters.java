package day27_ForEachLoop;

public class FirstThreeCharacters {
    public static void main(String[] args) {
        String[] names={ "Erjon", "Katrin", "Aamir", "Lola", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};
    for(String each : names){
        System.out.println(each.substring(0,3));
    }


    }
}
