package day27_ForEachLoop;

public class UniqueInteger {
    public static void main(String[] args) {
        int [] arr ={1,1,1,2,3,3,4};
        //           0 1 2 3 4 5 =array is ordered data structure
//nested loop
for(int j = 0; j<arr.length; j++){
        int element = arr[j];//element will change
        int frequency = 0;//frequency of element
        for(int i =0; i<arr.length; i++){//first loop responsible to find frequency of one element
            if(arr[i]==element){
                frequency++;
            }
        }
        if(frequency==1) {//verify if the element is unique
            System.out.println(element + " ");
        }
        }
    }
}
/*
write a programme that can print out the unique numbers from an array of integer
 */