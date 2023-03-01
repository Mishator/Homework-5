import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
    public static void task5 () {
        System.out.println("Задача 5");
        int yearsOld = 15;
        if (yearsOld <= 5) {
            System.out.println("Если возраст ребёнка равен " + yearsOld + ", то ему нельзя кататься на атракционе.");
        } else if (yearsOld > 5 && yearsOld <= 14) {
            System.out.println("Если возраст ребёнка равен " + yearsOld + ", то ему можно кататьтся на атракционе, но только в сопровождении взрослого.");
        } else if (yearsOld > 14) {
            System.out.println("Если возрост ребёнка равен " + yearsOld + ", то он может кататься на атракционе без сопровождения взрослого.");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int capacity = 102;
        int seatingPlace = 60;
        int standingPlace = capacity - seatingPlace;
        int seatingUsed = 33;
        int standingUsed = 42;
        if (seatingUsed < seatingPlace) {
            System.out.println("Есть ещё " + (seatingPlace - seatingUsed) + " сидячих мест.");
        } else if (seatingUsed == seatingPlace) {
            System.out.println("Сидячих мест нет!");
        }
        if (standingUsed < standingPlace) {
            System.out.println("Есть ещё " + (standingPlace - standingUsed) + " стоячих мест.");
        } else if (standingUsed == standingPlace) {
            System.out.println("Стоячих мест нет");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 28;
        int two = -11;
        int three = 118;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число  " + one);
            } else {
                System.out.println("Максимальное число  " + three);
            }
        }else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число  " + two);
            } else  {
                System.out.println("Максимальное число  " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число  " + one);
            } else if (three > one) {
                System.out.println("Максимальное число  " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}