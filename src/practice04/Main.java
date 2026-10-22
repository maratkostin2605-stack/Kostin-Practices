package practice04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // task1();
        // task2(scan);
        // task3();
        // task4(scan);
        // task5(scan);
        // task6();
        // task7(scan);
        // task8(scan);
        // task9(scan);
        // task10(scan);
        // task11(scan);
        // task12(scan);
        // task13(scan);
        // task14(scan);
        // task15(scan);
        // task16(scan);
        // task17(scan);
        // task18();
        // task19(scan);
        // task20(scan);
        // task21(scan);
        // task22(scan);
        // task23();
        // task24();
        // task25();
        // task26();
        // task27(scan);
        // task28(scan);
        // task29();
        // task30(scan);
        // task31(scan);
        // task32();
        // task33();
        // task34();
        // task35();
        // task36();
        // task37(scan);
        // task38(scan);
        // task39(scan);
        // task40(scan);

        scan.close();
    }

    public static void task1() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Java - надійна та кросплатформна мова!");
        }
    }

    public static void task2(Scanner scan) {
        scan.nextLine();
        System.out.print("Введіть рядок тексту: ");
        String text = scan.nextLine();
        System.out.print("Введіть кількість повторень N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }
    }

    public static void task3() {
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }
    }

    public static void task4(Scanner scan) {
        System.out.print("Введіть курс євро до гривні: ");
        double rate = scan.nextDouble();

        System.out.println("Євро\tГривні");
        for (int euro = 10; euro <= 100; euro += 10) {
            System.out.println(euro + "\t" + (euro * rate));
        }
    }

    public static void task5(Scanner scan) {
        System.out.print("Введіть ширину рамки W: ");
        int w = scan.nextInt();

        for (int i = 0; i < w; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void task6() {
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        System.out.println("Поїхали! Ракета запущена!");
    }

    public static void task7(Scanner scan) {
        int sum = 0;
        System.out.println("Вводьте цілі числа (0 для завершення):");
        int num = scan.nextInt();

        while (num != 0) {
            sum += num;
            num = scan.nextInt();
        }
        System.out.println("Загальна сума: " + sum);
    }

    public static void task8(Scanner scan) {
        System.out.print("Введіть число M: ");
        int m = scan.nextInt();
        int power = 1;

        while (power <= m) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();
    }

    public static void task9(Scanner scan) {
        System.out.print("Введіть додатне ціле число N: ");
        int n = scan.nextInt();
        int count = 0;
        int sum = 0;
        int temp = Math.abs(n);

        if (temp == 0) {
            count = 1;
        }

        while (temp > 0) {
            sum += temp % 10;
            count++;
            temp /= 10;
        }
        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);
    }

    public static void task10(Scanner scan) {
        System.out.print("Введіть додатне число: ");
        int n = scan.nextInt();
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        System.out.println("Реверс числа: " + reversed);
    }

    public static void task11(Scanner scan) {
        System.out.print("Введіть початковий внесок S: ");
        double s = scan.nextDouble();
        System.out.print("Введіть річний відсоток P: ");
        double p = scan.nextDouble();

        double target = s * 2;
        int years = 0;

        while (s < target) {
            s += s * (p / 100);
            years++;
        }
        System.out.println("Сума подвоїться через років: " + years);
    }

    public static void task12(Scanner scan) {
        System.out.print("Введіть число N (> 1): ");
        int n = scan.nextInt();
        int divisor = 2;

        while (n % divisor != 0) {
            divisor++;
        }
        System.out.println("Найменший дільник: " + divisor);
    }

    public static void task13(Scanner scan) {
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int guess = 0;

        System.out.println("Вгадайте число від 1 до 100:");

        while (guess != secret) {
            guess = scan.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Менше!");
            }
        }
        System.out.println("Вітаємо! Ви вгадали за спроб: " + attempts);
    }

    public static void task14(Scanner scan) {
        int choice;
        do {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Розпочати нову гру");
            System.out.println("2. Завантажити збереження");
            System.out.println("3. Налаштування");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Старт нової гри...");
                case 2 -> System.out.println("Завантаження...");
                case 3 -> System.out.println("Відкрито налаштування.");
                case 0 -> System.out.println("Вихід з програми.");
                default -> System.out.println("Некоректний вибір!");
            }
        } while (choice != 0);
    }

    public static void task15(Scanner scan) {
        int age;
        do {
            System.out.print("Введіть ваш вік (1-120): ");
            age = scan.nextInt();
        } while (age < 1 || age > 120);

        System.out.println("Вік підтверджено: " + age);
    }

    public static void task16(Scanner scan) {
        int correctPin = 1234;
        int attempts = 0;
        int enteredPin;

        do {
            System.out.print("Введіть PIN-код: ");
            enteredPin = scan.nextInt();
            attempts++;

            if (enteredPin == correctPin) {
                System.out.println("Доступ надано");
                return;
            } else {
                System.out.println("Невірний PIN! Залишилось спроб: " + (3 - attempts));
            }
        } while (attempts < 3);

        System.out.println("Карту заблоковано!");
    }

    public static void task17(Scanner scan) {
        char answer;
        do {
            System.out.print("Введіть перше число: ");
            double a = scan.nextDouble();
            System.out.print("Введіть друге число: ");
            double b = scan.nextDouble();
            System.out.println("Сума: " + (a + b));

            System.out.print("Бажаєте продовжити? (y/n): ");
            answer = scan.next().toLowerCase().charAt(0);
        } while (answer == 'y');
    }

    public static void task18() {
        int dice1, dice2;
        int count = 0;

        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            count++;
            System.out.println("Кидок " + count + ": [" + dice1 + "] i [" + dice2 + "]");
        } while (dice1 != dice2);

        System.out.println("Випав дубль за спроб: " + count);
    }

    public static void task19(Scanner scan) {
        System.out.print("Введіть чисельник: ");
        double num = scan.nextDouble();
        double denom;

        do {
            System.out.print("Введіть знаменник (не нуль): ");
            denom = scan.nextDouble();
            if (denom == 0) {
                System.out.println("Помилка: ділення на нуль неможливе!");
            }
        } while (denom == 0);

        System.out.println("Результат ділення: " + (num / denom));
    }

    public static void task20(Scanner scan) {
        double total = 0;
        int count = 0;
        double grade;

        do {
            System.out.print("Введіть бал від 0 до 100 (або від'ємне число для завершення): ");
            grade = scan.nextDouble();

            if (grade >= 0 && grade <= 100) {
                total += grade;
                count++;
            } else if (grade > 100) {
                System.out.println("Некоректний бал! Введіть від 0 до 100.");
            }
        } while (grade >= 0);

        if (count > 0) {
            System.out.println("Середній бал: " + (total / count));
        } else {
            System.out.println("Бали не введено.");
        }
    }

    public static void task21(Scanner scan) {
        System.out.print("Введіть число A: ");
        int a = scan.nextInt();
        System.out.print("Введіть число B (B >= A): ");
        int b = scan.nextInt();

        System.out.print("Парні числа: ");
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task22(Scanner scan) {
        System.out.print("Введіть N (0-20): ");
        int n = scan.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }

    public static void task23() {
        System.out.println("Число\tКвадрат\tКуб");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
        }
    }

    public static void task24() {
        System.out.print("Числа (не діляться на 3 і 5): ");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task25() {
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println("Перше число, яке ділиться на 13 і 7: " + i);
                break;
            }
        }
    }

    public static void task26() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " -> ASCII " + (int) ch);
        }
    }

    public static void task27(Scanner scan) {
        System.out.print("Введіть кількість елементів N: ");
        int n = scan.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Знакозмінна сума: " + sum);
    }

    public static void task28(Scanner scan) {
        System.out.print("Введіть перший член a1: ");
        int a1 = scan.nextInt();
        System.out.print("Введіть різницю d: ");
        int d = scan.nextInt();
        System.out.print("Введіть кількість членів n: ");
        int n = scan.nextInt();

        int sum = 0;
        System.out.print("Прогресія: ");
        for (int i = 0; i < n; i++) {
            int current = a1 + i * d;
            System.out.print(current + " ");
            sum += current;
        }
        System.out.println("\nСума прогресії: " + sum);
    }

    public static void task29() {
        byte b = 125;
        System.out.println("Початкове значення: " + b);
        for (int i = 0; i < 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Крок " + (i + 1) + ": " + b);
        }
    }

    public static void task30(Scanner scan) {
        System.out.print("Введіть кількість чисел N: ");
        int n = scan.nextInt();
        int sum = 0;

        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            sum += scan.nextInt();
        }

        double exactAverage = (double) sum / n;
        double wrongAverage = sum / n;

        System.out.println("Точне середнє (з приведенням): " + exactAverage);
        System.out.println("Неточне середнє (цілочисельне): " + wrongAverage);
    }

    public static void task31(Scanner scan) {
        scan.nextLine();
        System.out.print("Введіть слово або рядок з 5 символів: ");
        String str = scan.nextLine();

        System.out.print("Зашифрований рядок: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char encrypted = (char) (ch + 1);
            System.out.print(encrypted);
        }
        System.out.println();
    }

    public static void task32() {
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};
        int totalHryvnias = 0;
        double totalKopecks = 0.0;

        for (double price : prices) {
            int hrv = (int) price;
            double kop = price - hrv;
            totalHryvnias += hrv;
            totalKopecks += kop;
        }

        System.out.println("Сума цілих гривень: " + totalHryvnias + " грн");
        System.out.printf("Сума копійок: %.2f грн\n", totalKopecks);
    }

    public static void task33() {
        System.out.println("Завантаження файлу 50 МБ:");
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "% (" + i + "/50 МБ)");
        }
    }

    public static void task34() {
        long bigNumber = 3_000_000_000L;
        int castedNumber = (int) bigNumber;

        System.out.println("Оригінальне значення long: " + bigNumber);
        System.out.println("Результат після (int): " + castedNumber);
    }

    public static void task35() {
        System.out.println("--- Цикл з double (накопичення похибки) ---");
        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println("d = " + d);
        }

        System.out.println("\n--- Точний цикл з int ---");
        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println("val = " + val);
        }
    }

    public static void task36() {
        System.out.println("=== Таблиця Піфагора ===");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static void task37(Scanner scan) {
        System.out.print("Введіть висоту H: ");
        int h = scan.nextInt();
        System.out.print("Введіть ширину W: ");
        int w = scan.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 || i == h - 1 || j == 0 || j == w - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void task38(Scanner scan) {
        System.out.print("Введіть висоту трикутника N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void task39(Scanner scan) {
        System.out.print("Введіть N: ");
        int n = scan.nextInt();

        System.out.print("Прості числа від 2 до " + n + ": ");
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
            }
        }
        System.out.println();
    }

    public static void task40(Scanner scan) {
        System.out.print("Введіть розмір шахівниці N: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}