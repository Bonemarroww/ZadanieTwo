import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        System.out.println("Введите код города: 905 - Москва; 194 - Ростов; 491 - Краснодар; 800 - Киров");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 905:
                System.out.println("Москва. Стоимость разговора за 10 минут:" + 4.15 * 10);
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора за 10 минут:" + 1.98 * 10);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора за 10 минут:" + 2.69 * 10);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора за 10 минут:" + 5.00 * 10);
                break;
            default:
                System.out.println("вы ввели не корректное значение. Пожалуйста введите, из предложенных вариантов");
        }
        }
        }
