public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием.");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно подождать.");
        }
    }
}