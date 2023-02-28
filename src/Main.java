public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием.");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperatureStreet = -10;
        if (temperatureStreet <= -5) {
            System.out.println("Холодно!!! Нужно надеть шапку!");
                   }
        if (temperatureStreet >= 5) {
            System.out.println("Тепло!!! Шапку одевать не надо!");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
    int speedLimit = 59;
    if (speedLimit > 60) {
        System.out.println("Ваша скорость больше 60 км в час, придётся заплатить штраф.");
    }
    if (speedLimit <= 60) {
        System.out.println("Ваша скорость в пределах 60 км в час, можно ехать спокойно, штраф не придёт.");
    }
    }
    public static void task4 () {
        System.out.println("Задача 4");
    int yearsOld =25;
    if (yearsOld >= 2 && yearsOld <= 6) {
        System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
    } else if (yearsOld > 6 && yearsOld <= 18) {
        System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
    } else if (yearsOld > 18 && yearsOld <= 24) {
        System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в университет.");
    } else if (yearsOld > 24) {
        System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу.");
    }
    }
}