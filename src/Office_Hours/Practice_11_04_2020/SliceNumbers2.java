package Office_Hours.Practice_11_04_2020;

public class SliceNumbers2 {
    public static void main(String[] args) {
     int number =12345;
     String str=""+number;
        //System.out.println("digit  1: "+str.charAt(0));
        //System.out.println("digit  2: "+str.charAt(1));
        //System.out.println("digit  3: "+str.charAt(2));
        //System.out.println("digit  4: "+str.charAt(3));
        //System.out.println("digit  5: "+str.charAt(4));


        for (int i =0; i<=str.length()-1; i++){
            System.out.println("digit "+i+": "+str.charAt(i));
        }






    }
}
