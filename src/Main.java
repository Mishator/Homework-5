public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}