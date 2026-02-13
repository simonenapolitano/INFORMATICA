import java.util.ArrayList;

public class Sorting {
    public static void arraySort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void arraySort(ArrayList<Integer> arr){
        for(int i=0; i<arr.size()-1; i++){
            for(int j=0; j<arr.size()-1; j++){
                if(arr.get(j) < arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }
    
}
