package practice03;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        task1(scan);
//        task2(scan);
//        task3(scan);
//        task4(scan);
//        task5(scan);
//        task6(scan);
//        task7(scan);
//        task8(scan);
//        task9(scan);
//        task10(scan);
//        task11(scan);
//        task12(scan);
//        task13(scan);
//        task14(scan);
//        task15(scan);
//        task16(scan);
//        task17(scan);
//        task18(scan);
//        task19(scan);
//        task20(scan);
//        task21(scan);
//        task22(scan);
//        task23(scan);
//        task24(scan);
//        task25(scan);
//        task26(scan);
//        task27(scan);
//        task28(scan);
//        task29(scan);
//        task30(scan);
//        task31(scan);
//        task32(scan);
//        task33(scan);
//        task34(scan);
//        task35(scan);
//        task36(scan);
//        task37(scan);
//        task38(scan);
//        task39(scan);
//        task40(scan);








        scan.close();

    }
    public static void task1(Scanner scan) {

        System.out.println("Введіть ім'я: ");
        String name = scan.nextLine();

        System.out.println("Введіть фамілію: ");
        String lastName = scan.nextLine();

        System.out.println("Введіть вік: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Введіть ваше місто: ");
        String city = scan.nextLine();

        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Вік: " + age);
        System.out.println("Місто: " + city);
        System.out.println("-------------------");
        System.out.println("Привіт, " + name + " " + lastName + " з міста " + city + "!\nТвій вік: " + age + "р.");
    }

    public static void task2(Scanner scan){

        System.out.println("Введіть перше число: ");
        int num1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Введіть друге число: ");
        int num2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Сума: " + (num1 + num2));
        System.out.println("Різниця: " + (num1 - num2));
        System.out.println("Добуток: " + (num1 * num2));
        System.out.println("Остача від ділення: " + (num1 % num2));
    }

    public static void task3(Scanner scan){


        System.out.println("Введіть суму в гривнях (UAH): ");
        double UAH = scan.nextDouble();

        System.out.println("Введіть курс USD: ");
        double USD = scan.nextDouble();

        double result = Math.round((UAH / USD));


        System.out.println("Сума до видачі: " + result + " USD");

        // чомусь я можу вписати курс тільки через кому..
        // якщо пишу через крапку видає помилку
    }

    public static void task4(Scanner scan){

        System.out.println("Введіть номер квитка: ");
        int numTicket = scan.nextInt();
        scan.nextLine();

        System.out.println("Введіть повне ім'я студента: ");

        String Fullname = scan.nextLine();

        System.out.println("Введіть спеціальність: ");
        String specialyti = scan.nextLine();

        System.out.println("Студент: " + Fullname + ", квиток №" + numTicket + ", спеціальність: " + specialyti);
    }

    public static void task5(Scanner scan){

        System.out.println("Введіть зріст у метрах: ");
        double height = scan.nextDouble();

        System.out.println("Введіть вагу в кілошрамах: ");
        double weight = scan.nextDouble();

        double index = weight / Math.pow(height, 2);
        index = Math.round(index * 100.0) / 100.0;



        System.out.println("Розрахований BMI: " + index);
    }
    public static void task6(Scanner scan){
        System.out.print("Введіть символ: ");
        char ch = scan.next().charAt(0);
        int code = (int) ch;

        System.out.println("Символ: " + ch + " | Код символу: " + code);

    }
    public static void task7(Scanner scan){
        double cut1 = 3.0;
        double cut2 = 4.0;
        double hypotenuse = Math.pow(cut1, 2) + Math.pow(cut2, 2);
        double hypotenuse1 = Math.sqrt(hypotenuse);
        double perimeter = cut1 + cut2 + hypotenuse1;
        double square = (cut1 * cut2) / 2;
        System.out.println("Катет А: " + cut1);
        System.out.println("Катет В: " + cut2);
        System.out.println("Гіпотенуза: " + hypotenuse1);
        System.out.println("Площа: " + square);

    }
    public static void task8(Scanner scan){
        String keyboard = "Клавіатура";
        double price = 850.0;
        int quantity = 2;
        double sumTotal = price * quantity;
        double tax = sumTotal * 0.2;
        System.out.println("Товар: " + keyboard);
        System.out.println("Ціна: " + price);
        System.out.println("Кількість: " + quantity);
        System.out.println("Загальна сума: " + sumTotal + " грн" + " (з них ПДВ 20%: " + tax + " грн)");


    }
    public static void task9(Scanner scan){
        System.out.println("Введіть число: ");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Число додатне.");
        } else if (num < 0) {
            System.out.println("Число від'ємне.");
        } else {
            System.out.println("Це нуль.");
        }

    }
    public static void task10(Scanner scan){
        System.out.println("Введіть число: ");
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("Число є нулем");
        } else if (num % 2 == 0) {
            System.out.println("Число " + num + " є парним.");
        } else
            System.out.println("Число " + num + " є непарним.");
    }
    public static void task11(Scanner scan){
        System.out.println("Введіть ваш вік: ");
        int age = scan.nextInt();
        if (age == 0 || age > 120){
            System.out.println("Некоректний вік");
        } else if (age > 0 && age <= 12) {
            System.out.println("Дитина");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Підліток");
        } else if (age >=18 && age <= 64) {
            System.out.println("Дорослий");
        } else if (age >= 65) {
            System.out.println("Пенсіонер");
        }
    }
    public static void task12(Scanner scan){
        System.out.println("Введіть ваш бал: ");
        int mark = scan.nextInt();
        if (mark == 0 || mark > 100){
            System.out.println("Помилка некоректний бал!");
        } else if (mark >= 90 && mark <= 100) {
            System.out.println("Відмінно (A)");
        } else if (mark >= 82 && mark <= 89) {
            System.out.println("Дуже добре (B)");
        } else if (mark >=74 && mark <= 81) {
            System.out.println("Добре (C)");
        } else if (mark >= 64 && mark <= 73) {
            System.out.println("Задовільно (D)");
        } else if (mark >= 60 && mark <= 63) {
            System.out.println("Достатньо (E)");
        } else if (mark > 0 && mark <= 59) {
            System.out.println("Незадовільно (F)");
        }
    }
    public static void task13(Scanner scan){
        System.out.println("Введіть 3 числа: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Максимум: " + max);
        System.out.println("Мінімум: " + min);
    }
    public static void task14(Scanner scan){
        System.out.println("Введіть Х: ");
        double x = scan.nextDouble();
        System.out.println("Введіть Y: ");
        double y = scan.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Точка знаходиться в початку координат (0, 0)");
        } else if (x == 0 || y == 0) {
            System.out.println("Точка лежить на осі координат");
        } else if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у I четверті.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у II четверті.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у III четверті.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка (" + x + "; " + y + ") знаходиться у IV четверті.");
        }
    }
    public static void task15(Scanner scan) {
        int x = 5;
        int y = 20;

        if (x > 10)
            if (y > 10)
                System.out.println("x > 10 и y > 10");
            else
                System.out.println("y <= 10");

        if (x > 10) {
            if (y > 10) {
                System.out.println("x > 10 и y > 10");
            }
        } else {
            System.out.println("x <= 10");
        }
    }
    public static void task16(Scanner scan) {
        System.out.println("Введіть обсяг спожитої електроенергії (кВт·год): ");
        double kwh = scan.nextDouble();

        if (kwh <= 0) {
            System.out.println("Некоректний обсяг!");
        } else if (kwh <= 100) {
            double sum = kwh * 2.64;
            System.out.println("Сума до сплати: " + sum + " грн");
        } else {
            double sum = (100 * 2.64) + ((kwh - 100) * 4.32);
            System.out.println("Сума до сплати: " + sum + " грн");
        }
    }
    public static void task17(Scanner scan) {
        System.out.println("Введіть перше число: ");
        int x = scan.nextInt();
        System.out.println("Введіть друге число: ");
        int y = scan.nextInt();

        int max = (x > y) ? x : y;

        System.out.println("Більше число: " + max);
    }
    public static void task18(Scanner scan) {
        System.out.println("Введіть число: ");
        int n = scan.nextInt();

        int abs = (n < 0) ? -n : n;

        System.out.println("Модуль числа: " + abs);
    }
    public static void task19(Scanner scan) {
        System.out.println("Введіть число: ");
        int num = scan.nextInt();

        String result = (num % 2 == 0) ? "Парне" : "Непарне";

        System.out.println("Результат: " + result);
    }

    public static void task20(Scanner scan) {
        System.out.println("Введіть бал: ");
        int score = scan.nextInt();

        System.out.println("Результат: " + ((score >= 60) ? "Зараховано" : "Незараховано"));
    }

    public static void task21(Scanner scan) {
        System.out.println("Введіть число: ");
        int n = scan.nextInt();

        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";

        System.out.println("Характеристика числа: " + status);
    }
    public static void task22(Scanner scan) {
        System.out.println("Введіть суму покупки: ");
        double sum = scan.nextDouble();

        double finalCost = (sum > 1000) ? sum * 0.9 : sum * 0.98;

        System.out.println("До сплати зі знижкою: " + finalCost + " грн");
    }

    public static void task23(Scanner scan) {
        System.out.println("Введіть ділене a: ");
        int a = scan.nextInt();
        System.out.println("Введіть дільник b: ");
        int b = scan.nextInt();

        if (b != 0) {
            double result = (double) a / b;
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Помилка: ділення на нуль неможливе!");
        }
    }

    public static void task24(Scanner scan) {
        System.out.println("Введіть кількість помилок: ");
        int count = scan.nextInt();

        String message = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";

        System.out.println(message);
    }
    public static void task25(Scanner scan) {
        int x = 10;
        int divisor = 0;

        if (divisor != 0 && (x / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
    }

    public static void task26(Scanner scan) {
        int counter1 = 0;
        int counter2 = 0;

        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);

        System.out.println("counter1 (&&): " + counter1);
        System.out.println("counter2 (&): " + counter2);
    }

    public static void task27(Scanner scan) {
        int number = 5;

        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }
    }

    public static void task28(Scanner scan) {
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        System.out.println("counterA (||): " + counterA);
        System.out.println("counterB (|): " + counterB);
    }
    public static void task29(Scanner scan) {
        System.out.println("Введіть години (0-23): ");
        int hours = scan.nextInt();
        System.out.println("Введіть хвилини (0-59): ");
        int minutes = scan.nextInt();

        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);

        if (isValidTime) {
            System.out.println("Введений час: " + hours + ":" + minutes);
        } else {
            System.out.println("Помилка: некоректний час!");
        }
    }

    public static void task30(Scanner scan) {
        System.out.println("Введіть сторону a: ");
        double a = scan.nextDouble();
        System.out.println("Введіть сторону b: ");
        double b = scan.nextDouble();
        System.out.println("Введіть сторону c: ");
        double c = scan.nextDouble();

        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);

        System.out.println("Трикутник існує: " + exists);
    }

    public static void task31(Scanner scan) {
        System.out.println("Введіть число: ");
        int n = scan.nextInt();

        boolean isEvenBitwise = (n & 1) == 0;

        System.out.println("Парне (побітово): " + isEvenBitwise);
        System.out.println("Парне (через %): " + (n % 2 == 0));
    }

    public static void task32(Scanner scan) {
        boolean isPinCorrect = true;
        boolean isCardActive = true;
        boolean hasSufficientBalance = true;
        boolean isDailyLimitExceeded = false;

        boolean isAllowed = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded;

        if (isAllowed) {
            System.out.println("Транзакція дозволена");
        } else {
            System.out.println("Транзакцію відхилено");
        }
    }
    public static void task33(Scanner scan) {
        System.out.println("Введіть номер дня (1-7): ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    public static void task34(Scanner scan) {
        System.out.println("Введіть номер дня (1-7): ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній (робочий) день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
                break;
        }
    }

    public static void task35(Scanner scan) {
        System.out.println("Введіть номер місяця (1-12): ");
        int month = scan.nextInt();

        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days != 0) {
            System.out.println("Кількість днів: " + days);
        } else {
            System.out.println("Неіснуючий місяць!");
        }
    }

    public static void task36(Scanner scan) {
        scan.nextLine(); // Очищення буфера
        System.out.println("Введіть назву місяця: ");
        String month = scan.nextLine().toLowerCase();

        String season = switch (month) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };

        System.out.println("Пора року: " + season);
    }
    public static void task37(Scanner scan) {
        System.out.println("Оберіть спосіб доставки (1 - Самовивіз, 2 - Кур'єр, 3 - Поштомат): ");
        int type = scan.nextInt();

        int cost = switch (type) {
            case 1 -> 0;
            case 2 -> {
                System.out.println("Введіть вагу товару (кг): ");
                double weight = scan.nextDouble();
                if (weight > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        if (cost != -1) {
            System.out.println("Вартість доставки: " + cost + " грн");
        } else {
            System.out.println("Некоректний вибір!");
        }
    }

    public static void task38(Scanner scan) {
        System.out.println("Введіть перше число a: ");
        double a = scan.nextDouble();
        System.out.println("Введіть операцію (+, -, *, /): ");
        char op = scan.next().charAt(0);
        System.out.println("Введіть друге число b: ");
        double b = scan.nextDouble();

        switch (op) {
            case '+' -> System.out.println("Результат: " + (a + b));
            case '-' -> System.out.println("Результат: " + (a - b));
            case '*' -> System.out.println("Результат: " + (a * b));
            case '/' -> {
                if (b != 0) {
                    System.out.println("Результат: " + (a / b));
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                }
            }
            default -> System.out.println("Невідома операція!");
        }
    }

    public static void task39(Scanner scan) {
        scan.nextLine(); // Очищення буфера
        System.out.println("Введіть команду (start, pause, stop, exit): ");
        String command = scan.nextLine();

        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Систему поставлено на паузу.");
            case "stop" -> System.out.println("Систему зупинено.");
            case "exit" -> System.out.println("Вихід з програми.");
            default -> System.out.println("Невідома команда!");
        }
    }

    public static void task40(Scanner scan) {
        System.out.println("=== БАНКОМАТ ===");
        System.out.println("Введіть PIN: ");
        int pin = scan.nextInt();

        if (pin != 1234) {
            System.out.println("Невірний PIN! Доступ заборонено.");
            return;
        }

        System.out.println("Авторизація успішна!");
        double balance = 5000.0;

        System.out.println("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Ваш баланс: " + balance + " грн");
            case 2 -> {
                System.out.println("Введіть суму поповнення: ");
                double amount = scan.nextDouble();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Рахунок поповнено! Поточний баланс: " + balance + " грн");
                } else {
                    System.out.println("Некоректна сума!");
                }
            }
            case 3 -> {
                System.out.println("Введіть суму зняття: ");
                double amount = scan.nextDouble();
                if (amount > 0 && amount <= balance) {
                    double fee = (amount > 1000) ? amount * 0.01 : 0.0;
                    balance -= (amount + fee);
                    System.out.println("Комісія: " + fee + " грн");
                    System.out.println("Видано: " + amount + " грн. Залишок: " + balance + " грн");
                } else {
                    System.out.println("Помилка: недостатньо коштів або сума некоректна!");
                }
            }
            case 4 -> System.out.println("Дякуємо за роботу!");
            default -> System.out.println("Невідома операція!");
        }
    }
}

