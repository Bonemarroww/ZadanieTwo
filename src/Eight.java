public class Eight {
    public static void main(String[] args) {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = 0;
        int sum = 0;
        int minus = 0;
        int positiv = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение массива:" + max); // Вывод максимального числа
        for (int i = 0; i< arr.length; i++){
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Сумма положительных чисел: "+sum); // Вывод суммы положительных чисел

        for (int i = 0; i< arr.length; i++){
            if (arr[i] < 0 && arr[i]%2==0) {
                minus = minus + arr[i];
            }
        }
        System.out.println("Сумма четных отрицательных чисел: "+minus); // Вывод суммы четных отрицательных чисел

        for (int i = 0; i< arr.length; i++){
            if (arr[i] > 0) {
                positiv++;
            }
        }
        System.out.println("Кол-во положительных эллементов: " + positiv ); // Вывод кол-ва положительных эллементов

        for (int i = 0; i< arr.length; i++){
            if (arr[i] < 0) {
                average = average + arr[i];
            }
        }
        System.out.println("Среднее арифметическое отрицательных эллементов:"+average/ arr.length); // Вывод средне арифметического отрицательных эллементов

    }
}

