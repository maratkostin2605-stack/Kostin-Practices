package practice04;

import java.util.Scanner;

public class Task4PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ДЕТЕКТОР ПРОСТИХ ЧИСЕЛ ===");
        System.out.print("Введіть верхню межу N (N >= 2): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Помилка: діапазон має починатися щонайменше з 2!");
            scanner.close();
            return;
        }

        int primeCount = 0;
        int primeSum = 0;

        System.out.println("\nЗнайдені прості числа у проміжку від 2 до " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                primeCount++;
                primeSum += i;
            }
        }
        System.out.println();

        int totalNumbers = n - 1; // кількість чисел від 2 до N
        double percentage = (totalNumbers > 0) ? ((double) primeCount / totalNumbers) * 100 : 0.0;

        System.out.println("\n--- СТАТИСТИКА ---");
        System.out.println("Усього чисел у діапазоні:    " + totalNumbers);
        System.out.println("Знайдено простих чисел:      " + primeCount + " шт.");
        System.out.println("Сума всіх простих чисел:     " + primeSum);
        System.out.printf("Частка простих чисел:        %.2f%%\n", percentage);
        System.out.println("==============================");

        scanner.close();
    }
}