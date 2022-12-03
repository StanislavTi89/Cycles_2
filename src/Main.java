public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Часть 2");

        //Задание 1
        System.out.println("Задание 1");
        int accumulation = 15000;
        int sumPercent = 0;
        double percent = 0.01;
        int i = 0;
        while (sumPercent < 2_459_000){
            i++;
            sumPercent = (int) ((sumPercent + accumulation) * (1 + percent));
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей");
        }


        //Задание 2
        System.out.println("Задание 2");
        int ia = 0;
        while (ia <10) {
            ia++;
            System.out.print(" " + ia);
        }
        System.out.println();
        for (ia = 10; ia >= 1; ia--){
            System.out.print(" " + ia);
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++){
            population += (population*(born-death))/1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        //Задание 4
        System.out.println("Задание 4");
        int fullSum = 12_000_000;
        int monthSum = 1;
        int accumulation2 = 15000;
        double percent2 = 0.07;
        for (; accumulation2 < fullSum; monthSum++){
            accumulation2+=accumulation2*percent2;
            System.out.println("Месяц " + monthSum + ", сумма накоплений равна " + accumulation2 + " рублей");

        }

        //Задание 5
        System.out.println("Задание 5");
        int fullSum6 = 12_000_000;
        int monthSum6 = 1;
        int accumulation6 = 15000;
        double percent6 = 0.07;
        for (; accumulation6 < fullSum6; monthSum6++){
            accumulation6 += accumulation6 * percent6;
            if (monthSum6 % 6 == 0) {
                System.out.println("Месяц " + monthSum6 + ", сумма накоплений равна " + accumulation6 + " рублей");
            }
        }


        //Задание 6
        System.out.println("Задание 6");
        int month9 = 9*12;
        int monthSum9 = 1;
        int accumulation9 = 15000;
        double percent9 = 0.07;
        for (; monthSum9 <= month9; monthSum9++){
            accumulation9 += accumulation9 * percent9;
                System.out.println("Месяц " + monthSum9 + ", сумма накоплений равна " + accumulation9 + " рублей");
        }

        //Задание 7
        System.out.println("Задание 7");


        //Задание 8
        System.out.println("Задание 8");
    }
}