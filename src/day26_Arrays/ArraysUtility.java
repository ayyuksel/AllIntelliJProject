package day26_Arrays;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5,6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));
        //Arrays.toString() use when you need to print whole array


        String [] classMates = {"Adil","Yasin","Necdet","Daniel"};
        System.out.println(Arrays.toString(classMates));

//Arrays.sort(array): sort the array in ascending order

        int [] arr1 = {200000, 10000, 400000, 6000, 50};
        Arrays.sort(arr1);// does not return any value, cannot assign to variable,
        //you cannot pass in print statement

        System.out.println(Arrays.toString(arr1));
        System.out.println("max: "+arr1[arr1.length-1]);
        System.out.println("min: "+arr1[0]);

        double[] arr2 = {1.5,0.5, 2.5, 0, 3.5, 1.8, 10.5, 20.5, -0.75, -0.5 };

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Second minimum number "+arr2[1]);
        System.out.println("Second maximum number "+arr2[arr2.length-2]);


        String[] names = {"Haroon", "Nurahmet", "Livio", "Dean", "Ayah", "afrooz", "me"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        //equals(arr1,arr2): only compare Arrays end return boolean

        int [] a1 = {2,3,1};
        int [] a2 = {3,2,1};
        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean r1= Arrays.equals(a1,a2);
        System.out.println(r1);

    }
}
