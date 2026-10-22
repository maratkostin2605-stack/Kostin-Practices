package practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // task1();
        // task2();
        // task3();
        // task4(scan);
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
        // task10();
        // task11();
        // task12(scan);
        // task13(scan);
        // task14();
        // task15();
        // task16();
        // task17();
        // task18();
        // task19();
        // task20();
        // task21();
        // task22();
        // task23();
        // task24();
        // task25();
        // task26();
        // task27();
        // task28();
        // task29();
        // task30();
        // task31();
        // task32();
        // task33();
        // task34();
        // task35();
        // task36();
        // task37();
        // task38();
        // task39();
        // task40();

        scan.close();
    }

    public static void task1() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        numbers[0] = 10;
        numbers[2] = 30;
        numbers[numbers.length - 1] = 50;

        System.out.println(Arrays.toString(numbers));
    }

    public static void task2() {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println(days.length);
        System.out.println(days[0] + " " + days[days.length - 1]);

        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println(Arrays.toString(days));
    }

    public static void task3() {
        double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};
        System.out.println(Arrays.toString(prices));

        prices[2] = prices[2] * 0.8;
        System.out.println(Arrays.toString(prices));
    }

    public static void task4(Scanner scan) {
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task5() {
        int[] arr = {4, 8, 15, 16, 23, 42};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
    }

    public static void task6() {
        int[] powersOfTwo = new int[10];
        powersOfTwo[0] = 1;
        for (int i = 1; i < powersOfTwo.length; i++) {
            powersOfTwo[i] = powersOfTwo[i - 1] * 2;
        }
        System.out.println(Arrays.toString(powersOfTwo));
    }

    public static void task7() {
        int[] original = {3, 7, 1, 9, 4};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        copy[0] = 999;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
    }

    public static void task8() {
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.length;
        System.out.println("Сума: " + sum + ", Середній бал: " + average);
    }

    public static void task9() {
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0];
        int max = temps[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
                minIndex = i;
            }
            if (temps[i] > max) {
                max = temps[i];
                maxIndex = i;
            }
        }

        System.out.println("Мінімум: " + min + " (індекс " + minIndex + "), Максимум: " + max + " (індекс " + maxIndex + ")");
    }

    public static void task10() {
        int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : data) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Додатних: " + positiveCount + ", Від'ємних: " + negativeCount + ", Нулів: " + zeroCount);
    }

    public static void task11() {
        int[] arr = {4, 7, 2, 9, 12, 15, 6, 3, 8, 10};
        int evenCount = 0;
        int oddSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Сума непарних чисел: " + oddSum);
    }

    public static void task12(Scanner scan) {
        int[] students = {1042, 2031, 3055, 4018, 5099};
        int target = scan.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Елемент знайдено на позиції " + foundIndex);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }
    }

    public static void task13(Scanner scan) {
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        int target = scan.nextInt();
        int count = 0;

        for (int roll : rolls) {
            if (roll == target) {
                count++;
            }
        }

        System.out.println("Кількість входжень: " + count);
    }

    public static void task14() {
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
        int sum = 0;

        for (int salary : salaries) {
            sum += salary;
        }

        double average = (double) sum / salaries.length;
        for (int salary : salaries) {
            if (salary > average) {
                System.out.print(salary + " ");
            }
        }
        System.out.println();
    }

    public static void task15() {
        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min = prices[0];
        double max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        double amplitude = max - min;
        System.out.printf("Мінімум: %.2f, Максимум: %.2f, Розмах: %.2f\n", min, max, amplitude);
    }

    public static void task16() {
        String[] cities = {"Київ", "Львів", "Харків", "Одеса", "Дніпро"};
        for (String city : cities) {
            System.out.println("Ласкаво просимо до міста " + city + "!");
        }
    }

    public static void task17() {
        double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] *= 1.10;
        }
        System.out.println(Arrays.toString(salaries));
    }

    public static void task18() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task19() {
        int[] base = {2, 4, 6, 8, 10};
        int[] squares = new int[base.length];
        for (int i = 0; i < base.length; i++) {
            squares[i] = base[i] * base[i];
        }
        System.out.println(Arrays.toString(base));
        System.out.println(Arrays.toString(squares));
    }

    public static void task20() {
        int[] arr = {1, 3, 5, 7, 9};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Масив відсортований: " + isSorted);
    }

    public static void task21() {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    public static void task22() {
        int[] test = {45, 12, 89, 3, 27};
        System.out.println(Arrays.toString(test));
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
        Arrays.fill(test, -1);
        System.out.println(Arrays.toString(test));
    }

    public static void task23() {
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task24() {
        int[][] matrix = {
                {10, 20, 30, 40},
                {50, 60, 70, 80}
        };

        System.out.println("Кількість рядків: " + matrix.length);
        System.out.println("Кількість стовпчиків у першому рядку: " + matrix[0].length);
        System.out.println("Лівий верхній: " + matrix[0][0]);
        System.out.println("Правий верхній: " + matrix[0][matrix[0].length - 1]);
        System.out.println("Лівий нижній: " + matrix[matrix.length - 1][0]);
        System.out.println("Правий нижній: " + matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1]);
    }

    public static void task25() {
        int[][] grid = new int[3][4];
        int counter = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = counter++;
                System.out.print(grid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task26() {
        int[][] randomGrid = new int[4][3];

        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                randomGrid[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        System.out.println(Arrays.deepToString(randomGrid));

        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                System.out.print(randomGrid[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task27() {
        int[][] multTable = new int[9][9];

        for (int i = 0; i < multTable.length; i++) {
            for (int j = 0; j < multTable[i].length; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multTable[i][j]);
            }
            System.out.println();
        }
    }

    public static void task28() {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task29() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], 1);
        }

        for (int j = 0; j < matrix[1].length; j++) {
            matrix[1][j] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][2] = 7;
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void task30() {
        int[][] matrix = {
                {2, 4, 6},
                {8, 10, 12},
                {14, 16, 18}
        };
        int sum = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Сума: " + sum + ", Кількість: " + count + ", Середнє: " + average);
    }

    public static void task31() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] rowSums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
            System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
        }
    }

    public static void task32() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Стовпчик " + j + ": сума = " + colSum);
        }
    }

    public static void task33() {
        int[][] matrix = {
                {-3, 15, 4},
                {22, -1, 8},
                {10, 19, -5}
        };
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]");
    }

    public static void task34() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int mainDiagonalSum = 0;
        int antiDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
            antiDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Сума головної діагоналі: " + mainDiagonalSum);
        System.out.println("Сума побічної діагоналі: " + antiDiagonalSum);
    }

    public static void task35() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] transposed = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Оригінал: " + Arrays.deepToString(matrix));
        System.out.println("Транспонована: " + Arrays.deepToString(transposed));
    }

    public static void task36() {
        int[][] ladder = new int[4][];
        ladder[0] = new int[1];
        ladder[1] = new int[2];
        ladder[2] = new int[3];
        ladder[3] = new int[4];

        for (int i = 0; i < ladder.length; i++) {
            for (int j = 0; j < ladder[i].length; j++) {
                ladder[i][j] = i;
                System.out.print(ladder[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task37() {
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Фізика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(days[i] + " (пар: " + weekSchedule[i].length + "): " + Arrays.toString(weekSchedule[i]));
        }
    }

    public static void task38() {
        int[][] pascal = new int[5][];
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            System.out.println(Arrays.toString(pascal[i]));
        }
    }

    public static void task39() {
        int[][][] cube = new int[3][3][3];

        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    cube[x][y][z] = x + y + z;
                }
            }
        }

        for (int x = 0; x < cube.length; x++) {
            System.out.println("--- Шар " + x + " ---");
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.print(cube[x][y][z] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void task40() {
        double[][][] weather = {
                {
                        {20.5, 12.0}, {22.0, 14.5}, {19.0, 11.0}, {21.5, 13.0}, {23.0, 15.0}, {18.5, 10.0}, {19.5, 11.5}
                },
                {
                        {17.0, 9.0}, {18.5, 10.5}, {16.0, 8.0}, {17.5, 9.5}, {19.0, 11.0}, {15.5, 7.5}, {16.5, 8.5}
                },
                {
                        {24.0, 16.0}, {25.5, 17.5}, {23.0, 15.0}, {24.5, 16.5}, {26.0, 18.0}, {22.5, 14.0}, {23.5, 15.5}
                }
        };

        String[] cities = {"Київ", "Львів", "Одеса"};
        double coldestNight = weather[0][0][1];

        for (int i = 0; i < weather.length; i++) {
            double cityDaySum = 0;
            for (int j = 0; j < weather[i].length; j++) {
                cityDaySum += weather[i][j][0];
                if (weather[i][j][1] < coldestNight) {
                    coldestNight = weather[i][j][1];
                }
            }
            double avgDay = cityDaySum / weather[i].length;
            System.out.printf("Середня денна температура у місті %s: %.2f\n", cities[i], avgDay);
        }

        System.out.println("Найхолодніша ніч за тиждень: " + coldestNight);
    }
}