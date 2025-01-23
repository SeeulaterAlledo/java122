import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1: Четное или нечетное число
        System.out.println("Задача 1: Введите целое число:");
        int num = scanner.nextInt();
        System.out.println((num % 2 == 0) ? "Число четное" : "Число нечетное");

        // Задача 2: Минимальное из трех чисел
        System.out.println("Задача 2: Введите три целых числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("Минимальное число: " + Math.min(a, Math.min(b, c)));

        // Задача 3: Таблица умножения
        System.out.println("Задача 3: Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Задача 4: Сумма чисел от 1 до N
        System.out.println("Задача 4: Введите целое число N:");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);

        // Задача 5: Число Фибоначчи
        System.out.println("Задача 5: Введите целое число N:");
        n = scanner.nextInt();
        System.out.println("Первые " + n + " чисел Фибоначчи:");
        int f1 = 0, f2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
        System.out.println();

        // Задача 6: Проверка простого числа
        System.out.println("Задача 6: Введите целое число:");
        n = scanner.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Число простое" : "Число не является простым");

        // Задача 7: Обратный порядок чисел
        System.out.println("Задача 7: Введите целое число N:");
        n = scanner.nextInt();
        System.out.println("Числа от " + n + " до 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8: Сумма четных чисел
        System.out.println("Задача 8: Введите два целых числа A и B:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        sum = 0;
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println("Сумма четных чисел: " + sum);

        // Задача 9: Реверс строки
        System.out.println("Задача 9: Введите строку:");
        scanner.nextLine();  // Очистка буфера
        String str = scanner.nextLine();
        System.out.println("Реверс строки: " + new StringBuilder(str).reverse());

        // Задача 10: Количество цифр в числе
        System.out.println("Задача 10: Введите целое число:");
        num = scanner.nextInt();
        System.out.println("Количество цифр в числе: " + String.valueOf(Math.abs(num)).length());

        // Задача 11: Факториал числа
        System.out.println("Задача 11: Введите целое число N:");
        n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал: " + factorial);

        // Задача 12: Сумма цифр числа
        System.out.println("Задача 12: Введите целое число:");
        num = scanner.nextInt();
        sum = 0;
        while (num != 0) {
            sum += Math.abs(num % 10);
            num /= 10;
        }
        System.out.println("Сумма цифр: " + sum);

        // Задача 13: Палиндром
        System.out.println("Задача 13: Введите строку:");
        str = scanner.next();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversedStr) ? "Палиндром" : "Не палиндром");

        // Задача 14: Найти максимальное число в массиве
        System.out.println("Задача 14: Введите размер массива:");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int max = Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
        System.out.println("Максимальное число: " + max);

        // Задача 15: Сумма всех элементов массива
        System.out.println("Задача 15: Сумма всех элементов массива: " + Arrays.stream(array).sum());

        // Задача 16: Количество положительных и отрицательных чисел
        System.out.println("Задача 16: Количество положительных и отрицательных чисел:");
        int positiveCount = 0, negativeCount = 0;
        for (int value : array) {
            if (value > 0) positiveCount++;
            if (value < 0) negativeCount++;
        }
        System.out.println("Положительных: " + positiveCount + ", Отрицательных: " + negativeCount);

        // Задача 17: Простые числа в диапазоне
        System.out.println("Задача 17: Введите два числа A и B:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        System.out.println("Простые числа в диапазоне:");
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            isPrime = i > 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(i + " ");
        }
        System.out.println();

        // Задача 18: Подсчет гласных и согласных
        System.out.println("Задача 18: Введите строку:");
        str = scanner.next();
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else if (Character.isLetter(ch)) consonants++;
        }
        System.out.println("Гласных: " + vowels + ", Согласных: " + consonants);

        // Задача 19: Перестановка слов в строке
        System.out.println("Задача 19: Введите строку:");
        scanner.nextLine();  // Очистка буфера
        str = scanner.nextLine();
        String[] words = str.split(" ");
        Collections.reverse(Arrays.asList(words));
        System.out.println("Перестановка слов: " + String.join(" ", words));

        // Задача 20: Число Армстронга
        System.out.println("Задача 20: Введите целое число:");
        num = scanner.nextInt();
        int temp = num, armstrongSum = 0, digits = String.valueOf(Math.abs(num)).length();
        while (temp != 0) {
            armstrongSum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println((armstrongSum == num) ? "Число Армстронга" : "Не число Армстронга");
    }
}
