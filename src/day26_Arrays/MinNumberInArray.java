package day26_Arrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int [] number ={300, 100, 400, 50, 500, 150,170};
        int min = number[0];
        for(int i =0; i<number.length; i++){
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("min = " + min);
    }
}
