import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0 && a > 0) {
            System.out.println("Четное положительное число");
        } else if (a % 2 == 0 && a <0){
            System.out.println("Четное отрицательное число");
        } else if (a % 2 != 0 && a >0){
            System.out.println("Нечетное положительное число");
        } else
            System.out.println("Нечетное отрицательное число");
    }
}
