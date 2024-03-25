public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int i = 0;

        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");


        // Задача 2
        System.out.println("Задача 2");

        int number = 1;

        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }

        System.out.println();

        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }


        System.out.println();
        // Задача 3
        System.out.println("Задача 3");

        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int year = 1;

        while (year <= 10) {
            totalPopulation = totalPopulation + (birthRate - deathRate) * 1000;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulation);
            year++;
        }


        // Задача 4
        System.out.println("Задача 4");

        int Deposit = 15_000;
        int sum = 12_000_000;
        float percent = 0.07f;
        i = 1;

        while (Deposit <= sum) {
            Deposit = (int) (Deposit + Deposit * percent);
            System.out.println("Месяц " + i + " сумма накопления " + Deposit);
            i++;
        }


        // Задача 5
        System.out.println("Задача 5");

        Deposit = 15_000;
        sum = 12_000_000;
        percent = 0.07f;
        i = 1;

        while (Deposit <= sum) {
            Deposit = (int) (Deposit + Deposit * percent);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накопления " + Deposit);
            }
            i++;
        }


        // Задача 6
        System.out.println("Задача 6");

        Deposit = 15_000;
        percent = 0.07f;
        int years = 9;
        i = 1;

        while (i <= years * 12) {
            Deposit = (int) (Deposit + Deposit * percent);
            if (i % 6 == 0) {
                System.out.println(i / 12 + " год " + i % 12 + " месяцев: cумма накопления " + Deposit);
            }
            i++;
        }


        // Задача 7
        System.out.println("Задача 7");

        int friday = 3;
        int day = 0;

        while (day <= 31) {
            day++;
            if (day == friday) {
                System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
                friday = friday + 7;
            }
        }


        // Задача 8
        System.out.println("Задача 8");

        int yearComet = 0;
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;

        for (yearComet = yearBefore; yearComet < yearAfter; yearComet ++) {
            if (yearComet % 79 == 0){
                System.out.println(yearComet);
            }
        }
    }
}