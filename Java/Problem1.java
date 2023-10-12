import java.util.Arrays;
import java.util.Random;

public class Problem1 {
    public static void main(String[] args) {
        int[] arrayBeforeShuffle = {1,2,3,4,5,6,7};
        System.out.println("Array Before Shuffling : "+ Arrays.toString(arrayBeforeShuffle));
        shuffledArray(arrayBeforeShuffle);
        System.out.println("Array After Shuffling : "+ Arrays.toString(arrayBeforeShuffle));
    }
    public static void shuffledArray(int[] array){
        Random random = new Random();
        for (int i = array.length-1; i > 0 ; i--) {
            int value = random.nextInt(i+1);
            swap(array,i,value);
        }
    }
    public static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
