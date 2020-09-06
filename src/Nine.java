public class Nine {
    public static void main(String[] args) {
        int [] arr = {15, 10, 51, -6, -5, 3, -10,-34, 0 , 32, 56,-12,24,-52};
        int length = 0;
        for (int el :arr){
            length++;
        }
        for (int i = length - 1; i >= 0; i--){
            System.out.print(" " + arr[i]);
        }

    }
}
