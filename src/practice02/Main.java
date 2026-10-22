package practice02;
public class Main {

    public static void main (String[] args) {
        //завдання 1
        System.out.println("завдання 1");
        int age = 17;
        float height = 1.78f;
        char firstLetter = 'M';
        boolean isStudent = true;

        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);

        //завдання 2
        System.out.println("\nзавдання 2");
        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L;

        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);


        //завдання 3
        System.out.println("\nзавдання 3");
        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        //завдання 4
        System.out.println("\nзавдання 4");

        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';

        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);

        //завдання 5
        System.out.println("\nзавдання 5");
        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;

        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);

        //завдання 6
        System.out.println("\nзавдання 6");
        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";

//        GRAVITY = 10.0;

        //завдання 7
        System.out.println("\nзавдання 7");

        int intVal = 250;
        double dobleVal = intVal;

        System.out.println("int: " + intVal);
        System.out.println("double: " + dobleVal);

        //завдання 8

        System.out.println("\nзавдання 8");

        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;

        System.out.println(roundedPrice);

        //завдання 9

        System.out.println("\nзавдання 9");

        int firstnumber = 5;
        double userweight = 72.5;
        String userCity = "Kyiv";
        boolean isvalidUser = true;

        System.out.println(firstnumber + "," + userweight + "," + userCity + "," + isvalidUser);

        //завдання 10

        System.out.println("\nзавдання 10");

        String firstName = "Траса";
        String lastName = "Шевченко";
        int ageTaras = 47;

        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + ageTaras + ".");

        //Завдання 11

        System.out.println("\nзавдання 11");

        int a = 10;
        int b = 20;

        System.out.println("Сума без дужок: " + a + b);
        System.out.println("Сума з дужками: " + (a + b));

        // без дужок просто виконується дія додавання
        // з дужками джава просто пише та склеює ці числа як текст

        //завдання 12

        System.out.println("\nзавдання 12");

        String login = "marat.kostin";
        String domain = "marat.kostin2605@gmail.com";
        String role = "student";

        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + domain);

        //завдання 13

        System.out.println("\nзавдання 13");

        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;

        System.out.println("ЧЕК:\n" + "Товар: " + productName + "\n" + "Кількість: " + quantity + " шт" + "\n" + "Ціна: " + pricePerUnit + " грн");

        //завдання 14

        System.out.println("\nзавдання 14");

        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);

        //завдання 15

        System.out.println("\nзавдання 15");

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;

        System.out.println("Запит відправлено на:\n" + protocol + host + endpoint + "/" + userId);

        //завдання 16

        System.out.println("\nзавдання 16");

        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + "\t| " + "Рівень: " + level + "\t| " + "готовність дл практики: " + isReady);

        //завдання 17
        System.out.println("\nзавдання 17");

        int number = 19;
        int remainder = number % 2;

        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);

        //завдання 18

        System.out.println("\nзавдання 18");

        int totalSeconds = 385;
        int fullSeconds = totalSeconds / 60;
        int remainderSeconds = totalSeconds % 60;

        System.out.println(totalSeconds + " секунд = " + fullSeconds + " хв " + remainderSeconds + " сек");

        //завдання 19

        System.out.println("\nзавдання 19");

        int n = 47;
        int an = n / 10;
        int bn = n % 10;

        System.out.println("Число: " + n + ". Десятки: " + an + ", Одиниці: " + bn + ". Сума цифр: " + (an + bn));

        //завдання 20

        System.out.println("\nзавдання 20");

        int score = 100;
        int PlusScore = score += 50;
        int MinusScore = score -= 20;
        int DoubleScore = score *= 2;
        int DivisionScore = score /= 4;

        System.out.println("Результат\n Після додавання: " + PlusScore + "\n Після віднімання: " + MinusScore + "\n Після множення: " + DoubleScore + "\n Після ділення: " + DivisionScore);

        //завдання 21

        System.out.println("\nзавдання 21");

        int counter = 5;
        System.out.println(counter++);
        System.out.println(counter);
        //спочатку вивелося 5 бо ++ ззаду спрацьовує після вже друку..  другим вивелося 6 бо змінна вже встигла оновитися в пам’яті

        //завдання 22

        System.out.println("\nзавдання 22");

        int Xcounter = 5;
        System.out.println(++Xcounter);
        // зараз же ++ перед змінною тому спочатку виконолась дія і потім вже вивелось значення цієї змінної

        //завдання 23

        System.out.println("\nзавдання 23");

        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double MiddleGrade = (grade1 + grade2 + grade3) / 3.0;

        System.out.println("Середній бал: " + MiddleGrade);

        //завдання 24

        System.out.println("\nзавдання 24");

        double celsius = 25.0;
        double Fahrenheit = celsius * 1.8 + 32;
        double kelvins = celsius + 273.15;
        System.out.println("Результат\n" + celsius + "°C = " + Fahrenheit + "°F\n" + celsius + "°C = " + kelvins + " K");

        //завдання 25

        System.out.println("\nзавдання 25");

        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітнім: " + isAdult);

        //завдання 26

        System.out.println("\nзавдання 26");

        int x = 15;
        int y = 20;

        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        boolean isMore = x > y;
        System.out.println(" x = y: " + isEqual + "\n x != y: " + isNotEqual + "\n x > y: " + isMore);

        //завдання 27

        System.out.println("\nзавдання 27");

        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);

        System.out.println(isSafeSpeed);

        //завдання 28

        System.out.println("\nзавдання 28");

        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);

        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);

        //завдання 29

        System.out.println("\nзавдання 29");

        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;

        System.out.println("Двері зачинені: " + isDoorLocked + "\nЧи можна увійти: " + canEnter);

        //завдання 30

        System.out.println("\nзавдання 30");

        int Cnumber = 30;
        boolean isDivisibleByBoth = ( Cnumber % 3 == 0 ) && (Cnumber % 5 == 0 );
        int Xnumber = 25;
        boolean XisDivisibleByBoth = ( Xnumber % 3 == 0 ) && (Xnumber % 5 == 0 );

        System.out.println("Чи ділится число 30 на 3 та 5 без остачі: " + isDivisibleByBoth);
        System.out.println("Чи ділится число 25 на 3 та 5 без остачі: " + XisDivisibleByBoth);

        //завдання 31

        System.out.println("\nзавдання 31");

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;

        System.out.println("Корисутвач може увійти: " + canLogin);

        //завдання 32

        System.out.println("\nзавдання 32");

        int year = 2024;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println(isLeapYear);

        //завдання 33

        System.out.println("\nзавдання 33");

        double chateta = 3.0;
        double chatetb = 4.0;
        double c = Math.sqrt(Math.pow(chateta, 2) + Math.pow(chatetb, 2));
        System.out.println("Катети: " + chateta + " та " + chatetb + ". Гіпотенуза: " + c);

        //завдання 34

        System.out.println("\nзавдання 34");

        double radius = 5.0;

        double L = 2 * Math.PI * radius;
        double S = Math.PI * Math.pow(radius, 2);

        System.out.println("Радіус: " + radius + "\nДовжина кола: " + L + "\nПлоща круга: " + S);

        //завдання 35

        System.out.println("\nзавдання 35");

        double dayTemp = 18.5;
        double nightTemp = -3.2;
        System.out.println("Перепад температури: " + Math.abs(dayTemp - nightTemp) + "\nМаксимальна температура: " + Math.max(dayTemp, nightTemp) + "\nМінімальна температура: " + Math.min(dayTemp, nightTemp));

        //завдання 36

        System.out.println("\nзавдання 36");

        double num = 5.67;
        System.out.println(Math.round(num) + "\n" + Math.ceil(num) + "\n" + Math.floor(num));

        double negNum = -5.67;
        System.out.println("З відємним числом: " + "\n" + Math.round(negNum) + "\n" + Math.ceil(negNum) + "\n" + Math.floor(negNum));

        //завдання 37

        System.out.println("\nзавдання 37");

        double Xa = 1.0;
        double Xb = -7.0;
        double Xc = 10.0;
        double D = Math.pow(Xb, 2) - 4 * Xa * Xc;
        double X1 = (-Xb + Math.sqrt(D)) / (2 * Xa);
        double X2 = (-Xb - Math.sqrt(D)) / (2 * Xa);

        System.out.println("Дискримінант D = " + D + "\nКорінь x1 = " + X1 + "\nКорінь x2 = " + X2);

        //завдання 38

        System.out.println("\nзавдання 38");

        int dice = (int) (Math.random() * 6 +1);
        System.out.println("Випало на кубику: " + dice);

        //завдання 39

        System.out.println("\nзавдання 39");

        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min +1)) + min;

        System.out.println("Погода на завтра: " + randomTemp + "°C");

        //завдання 40 Фінал юху

        System.out.println("\nзавдання 40");

        double StartCash = 10000.0;
        int numberYears = 3;
        double annualRate = 12.0;

        double S1 = StartCash * Math.pow(1 + (annualRate / 100), numberYears);
        double roundedS1 = Math.round(S1 * 100.0) / 100.0;

        double netProfit = S1 - StartCash;
        double roundedNetProfit = Math.round(netProfit * 100.0) / 100.0;


        System.out.println("+------------------------------------+\n|     ДЕПОЗИТНИЙ КАЛЬКУЛЬАТОР        |\n+------------------------------------+");
        System.out.println("Початкова сума: " + StartCash + " грн\n" + "Термін: " + numberYears + " під " + annualRate + "% річних\nПідсумкова сума: " + roundedS1 + " грн\nЧистий прибуток: " + roundedNetProfit + " грн");
        System.out.println("+------------------------------------+");


    }
}