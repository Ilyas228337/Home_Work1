public class Main {

    public static void main(String[] args) {
        // 1-вое задание
        String dragonCaveLit;

        // 2-рое задание
        final int NUM = 32000000;

        // 3-тье задание
        String word = "130000";


        // 4-тое задание
        dragonCaveLit = NUM + word;

        // 5-тое задание
        System.out.println(dragonCaveLit + " "+ word + " " + NUM);

        // 6-тое задание.

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        
    }

}