import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //задача 1
        Scanner console = new Scanner(System.in);
        System.out.print("Введите возраст ");
        int age = console.nextInt();
        if (age >= 18) System.out.println("он совершеннолетний");
        else System.out.println("он не достиг совершеннолетия");

        //задача 2
        System.out.print("Введите температуру ");
        Scanner consoleTemp = new Scanner(System.in);
        int temperature = consoleTemp.nextInt();
        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов(а)  нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов(а) можно идти без шапки");
        }
        // Задача 3
        System.out.print("Введите скорость ");
        Scanner consoleSpeed = new Scanner(System.in);
        int speed = consoleSpeed.nextInt();
        if (speed >= 60)
            System.out.println("Если скорость " + speed + "км, то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + "км, то можно ездить спокойно");

        // Задача 4
        System.out.print("Введите возраст ");
        Scanner consoleAge = new Scanner(System.in);
        int age3 = consoleAge.nextInt();
        if (age3 >= 2 && age3 < 7)
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в детский сад");
        else if (age3 >= 7 && age3 < 18)
            System.out.println("Если возраст человека равен " + age3 + " , то ему нужно ходить в школу");
        else if (age3 >= 18 && age3 < 25)
            System.out.println("Если возраст человека равен " + age3 + " , то его место в университете");
        else System.out.println("Если возраст больше " + age3 + " , то ему пора ходить на работу");



        // Задача 5
        System.out.print("Введите возраст ");
        Scanner consoleAge2 = new Scanner(System.in);
        int age2;
        age2 = consoleAge2.nextInt();
        if (age2 < 5) System.out.println("нельзя кататься на аттракционе");
        else if (age2 < 14) System.out.println( "можно кататься на аттракционе в сопровождении взрослого");
        else System.out.println("можно кататься на аттракционе без сопровождения взрослого");

        // Задача 6
        int carriageCapacity = 102;
        int seatPlace = 60;
        int standingPlace = carriageCapacity - seatPlace;

        System.out.print("Введите колличество занятых мест ");
        Scanner consolePlace = new Scanner(System.in);
        int place = consolePlace.nextInt();
        int sPlace = carriageCapacity - place;
        int ssPlace = seatPlace - place;

        if (place <= seatPlace)
            System.out.println("В вагоне " + ssPlace + " сидячих мест и "
                    + standingPlace + " стоячих");
        else if (place <= carriageCapacity)
                System.out.println("В вагоне нет сидячих мест, а количество стоячих мест равно " +
                        sPlace);
        else System.out.println("В вагоне нет мест");

        // Задача 7
        System.out.print("one = ");
        Scanner consoleOne = new Scanner(System.in);
        int one = consoleOne.nextInt();
        System.out.print("two = ");
        Scanner consoleTwo = new Scanner(System.in);
        int two = consoleTwo.nextInt();
        System.out.print("three = ");
        Scanner consoleThree = new Scanner(System.in);
        int three = consoleThree.nextInt();

        if (one > two && one > three) System.out.println("One самое большое число");
        else if (two > one && two > three) System.out.println("Two самое большое число");
        else System.out.println("Three самое большое число");

    }
}
