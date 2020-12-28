package JavaProgramming2020_B21.src.day22_JavaRecap;

public class FrequencyOfSingleChar {
    public static void main(String[] args) {

        String str = "I like to learn Java, I would love to join Cybertek";
        char ch= ' ';
        int count =0;

        for(int i = 0; i<=str.length()-1; i++){
            char ecahChar = str.charAt(i);
            if(ch==ecahChar){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("Numbers of words: "+(count+1));


    }
}
