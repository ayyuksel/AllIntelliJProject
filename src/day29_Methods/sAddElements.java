package day29_Methods;

import java.util.Arrays;

public class sAddElements {
    public static void main(String[] args) {
int arr []={10,20,30,40};
addElements(arr,50);
    }
    public static void addElements(int [] arr, int num){
      int [] result = new int [arr.length+1];
      for(int i = 0; i<arr.length; i++){
          result[i]=arr[i];//represent for loop element arr[i] assign to result
      }
      result[result.length-1]=num;
        System.out.println(Arrays.toString(result));
    }
}
