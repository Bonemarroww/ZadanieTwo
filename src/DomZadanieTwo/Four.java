package DomZadanieTwo;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            a = a + 1;
        } else if (a < 0) {
            a = a - 2;
        } else a = 10;
        System.out.println(a);
    }
}
