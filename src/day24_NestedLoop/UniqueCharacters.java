package day24_NestedLoop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCD";

        for(int index =0; index<str.length(); index++){
            //purpose of this loop is to iterate through the char one at the time
        int frequency = 0;
        //charAt(index)-->A


            for(int inner =0; inner<str.length(); inner++){
                //other -> AABCCD

                if(str.charAt(index)==str.charAt(inner)){
                    frequency++;
                }


            }

            if(frequency==1){
                System.out.println(str.charAt(index));//Because original list
            }

        }


















    }
}
