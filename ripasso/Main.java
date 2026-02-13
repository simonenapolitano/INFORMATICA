import java.util.Random;

public class Main{
    public Main(){
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
            System.out.println("NUM " + (i+1) + " " + arr[i]);
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}