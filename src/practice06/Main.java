package practice06;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Марат";
        s1.age = 17;
        s1.gpa = 4.75;
        System.out.println(s1.name + ", " + s1.age + " років, бал: " + s1.gpa);

        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;
        System.out.println(car2.brand + " новіша за " + car1.brand + ": " + (car2.year > car1.year));

        Book emptyBook = new Book();
        System.out.println(emptyBook.title + " " + emptyBook.pages + " " + emptyBook.isRead);

        Rectangle rect = new Rectangle();
        rect.width = 7.5;
        rect.height = 4.0;
        double area = rect.width * rect.height;
        double perimeter = 2 * (rect.width + rect.height);
        System.out.println("Площа: " + area + ", Периметр: " + perimeter);

        Product prod = new Product();
        prod.name = "Монітор";
        prod.price = 6500.0;
        prod.quantity = 8;
        System.out.println("Загальна вартість партії: " + (prod.price * prod.quantity) + " грн");

        Smartphone phone = new Smartphone();
        phone.model = "iPhone";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;
        phone.batteryLevel -= 35;
        if (phone.batteryLevel <= 0) {
            phone.isTurnedOn = false;
        }
        System.out.println("Заряд: " + phone.batteryLevel + "%, Увімкнено: " + phone.isTurnedOn);

        Point2D pointA = new Point2D();
        pointA.x = 0;
        pointA.y = 0;
        Point2D pointB = new Point2D();
        pointB.x = 3;
        pointB.y = 4;
        double distance = Math.sqrt(Math.pow(pointB.x - pointA.x, 2) + Math.pow(pointB.y - pointA.y, 2));
        System.out.println("Відстань між точками: " + distance);

        Student first = new Student();
        first.name = "Іван";
        Student second = first;
        second.name = "Петро";
        System.out.println(first.name);
    }
}
