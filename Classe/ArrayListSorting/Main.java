import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(6);
        arr.add(5);
        arr.add(100);
        arr.add(57);
        arr.add(56);
        for (Integer n : arr) {
            System.out.println(n);
        }
        System.out.println("----------------------");
        Sorting.arraySort(arr);
        for (Integer n : arr) {
            System.out.println(n);
        }
    }   
    
}