package day33_ArrayList;

public class WrapperClassPractice {
    public static void main(String[] args) {

//sum of digit from giving string?
        String str = "a1b2c3";
        int sum =0;
        //for(char each:str.toCharArray()){//convert string to char array
           // if(Character.isDigit(each)){//verify Character  is digit and each is char need to be convert to string
               // sum+=Integer.parseInt(""+each);//need tobe convert to integer
           // }
       // }
        //System.out.println(sum);

        for(int i =0 ; i<=str.length()-1; i++){
            if(Character.isDigit(str.charAt(i))){
                sum+=Integer.valueOf(""+str.charAt(i));
            }
        }
        System.out.println(sum);

      //Password validation
        String password ="Password#7";

        String upperLetter="";
        String lowerLetter="";
        String digits="";
        String specialChar="";
        for(char each : password.toCharArray()){
            if(Character.isUpperCase(each)){//verify character is upper case
                upperLetter+=each;
            }else if(Character.isLowerCase(each)){
                lowerLetter+=each;
            } else if (Character.isDigit(each)) {
                digits+=each;
            }else{
                specialChar+=each;
            }
        }


        System.out.println("upperLetter = " + upperLetter);
        System.out.println("lowerLetter = " + lowerLetter);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);

        boolean isValid= password.length()>=8 &&upperLetter.length()>0&&lowerLetter.length()>0&&digits.length()>0&&specialChar.length()>0;
        System.out.println(isValid);




    }
}
