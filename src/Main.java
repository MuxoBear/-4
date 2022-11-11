public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 13;
        if (age >= 2 && age <=6){
            System.out.println("Если возраст равен " +age+ " то, человек должен ходить в садик");
        } else if (age >6 && age <=18) {
            System.out.println("Если возраст человека равен " +age+ " то, человек должен ходить в школу");
        } else if (age >18 && age <= 24) {
            System.out.println("Если возраст человека равен " +age+ " то, человек должен ходить в универ");
        } else if (age >24) {
            System.out.println("Если возраст человека равен " +age+ " то, человек должен ходить на работу");
        }

    }
}