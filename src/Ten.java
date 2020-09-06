import java.util.Arrays;

public class Ten {
    public static void main(String[] args) {
        int[] arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int tmp;
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i]==0){
                for (int j = i + 1; j< arr.length; j++){
                    if (arr[j]!=0){
                        tmp = arr[j];
                        arr[j]= arr[i];
                        arr[i] = tmp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
