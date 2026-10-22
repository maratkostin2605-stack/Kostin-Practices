package practice03;

import java.util.Scanner;

public class Task4SmartHomeClimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ПАНЕЛЬ КЛІМАТ-КОНТРОЛЮ SMART HOME ===");
        System.out.print("Поточна температура (°C): ");
        double currentTemp = scanner.nextDouble();

        System.out.print("Бажана температура (°C): ");
        double desiredTemp = scanner.nextDouble();

        System.out.print("Вологість повітря (%): ");
        int humidity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Сезон (зима/літо/міжсезоння): ");
        String season = scanner.nextLine();

        System.out.print("Режим будинку (1-Standby, 2-Eco, 3-Party, 4-Night, 5-Vacation): ");
        int mode = scanner.nextInt();

        System.out.print("Чи відчинені вікна? (true/false): ");
        boolean isWindowOpen = scanner.nextBoolean();

        System.out.println("\n------------- СТАТУС СИСТЕМИ -------------");

        if (isWindowOpen && (mode != 5)) {
            System.out.println("ПОПЕРЕДЖЕННЯ: Відчинені вікна! Обігрів та кондиціонування примусово заблоковано!");
            scanner.close();
            return;
        }

        double effectiveTargetTemp = switch (mode) {
            case 1 -> desiredTemp;
            case 2 -> {
                if (season.equalsIgnoreCase("зима")) {
                    yield desiredTemp - 2.0;
                } else if (season.equalsIgnoreCase("літо")) {
                    yield desiredTemp + 2.0;
                } else {
                    yield desiredTemp;
                }
            }
            case 3 -> desiredTemp - 1.5;
            case 4 -> 19.0;
            case 5 -> {
                if (season.equalsIgnoreCase("зима")) {
                    yield 12.0;
                } else {
                    yield 28.0;
                }
            }
            default -> desiredTemp;
        };

        String modeName = switch (mode) {
            case 1 -> "Standby (Звичайний)";
            case 2 -> "Eco (Енергозбереження)";
            case 3 -> "Party (Гості)";
            case 4 -> "Night (Ніч)";
            case 5 -> "Vacation (Відпустка)";
            default -> "Невідомий";
        };

        System.out.println("Режим роботи:              " + modeName);
        System.out.println("Цільова температура:       " + effectiveTargetTemp + "°C");
        System.out.println("Поточна температура:       " + currentTemp + "°C");

        if ((currentTemp - effectiveTargetTemp) > 0.5) {
            System.out.println("Стан терморегуляції:       Кондиціонер УВІМКНЕНО (Охолодження)");
        } else if ((effectiveTargetTemp - currentTemp) > 0.5) {
            System.out.println("Стан терморегуляції:       Опалення УВІМКНЕНО (Обігрів)");
        } else {
            System.out.println("Стан терморегуляції:       Температура в зоні комфорту");
        }

        String humidityStatus = (humidity < 40) ? "Зволожувач УВІМКНЕНО" :
                (humidity > 65) ? "Осушувач УВІМКНЕНО" : "Вологість оптимальна";
        System.out.println("Стан мікроклімату:         " + humidityStatus);
        System.out.println("==========================================");

        scanner.close();
    }
}