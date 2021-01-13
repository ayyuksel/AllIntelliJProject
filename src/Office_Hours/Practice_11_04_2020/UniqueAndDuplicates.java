package Office_Hours.Practice_11_04_2020;

class UniqueAndDuplicates {
    public static void main(String[] args) {
    String str = "aabccd";
    String unique = "";
    String duplicates="";


    for (int j =0; j<str.length();j++) {
        char ch = str.charAt(j);
        int frequency = 0;
//inner loop finding frequency of one character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }

        if (frequency == 1) {
            unique += ch;
        }
        if(frequency > 1 && !duplicates.contains(""+ch)){
            duplicates+=ch;
        }

    }

        System.out.println("unique = " + unique);
        System.out.println("duplicates = " + duplicates);












    }
}
