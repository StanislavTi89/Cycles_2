public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Часть 2");

        //Задание 1
        System.out.println("Задание 1");
        int accumulation = 15000;
        double sumPercent = 0;
        double percent = 0.01;
        int i = 0;
        while (sumPercent < 2_459_000){
            i++;
            sumPercent = (sumPercent + accumulation) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumPercent + " рублей");
        }


        //Задание 2
        System.out.println("Задание 2");
        int ia = 0;
        while (ia <10) {
            ia++;
            System.out.println(ia);
        }
        for (ia = 10; ia >= 1; ia--){
            System.out.println(ia);
        }

        //Задание 3
        System.out.println("Задание 3");
        int y = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 1;
        int totalBorn = y / 1000 * born - death;
        while (year > totalBorn){
            for (; year <= 10; year++)
                System.out.println("Год " + year + ", численность населения составляет " + totalBorn);
        }
// продолжение следует...

        //Задание 4
        System.out.println("Задание 4");
        int startCash = 15000;
        int percent1 = 7;

    }
}