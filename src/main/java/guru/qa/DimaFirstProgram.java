package guru.qa;

public class DimaFirstProgram {

    public static void main(String[] args) {
        String strToBePrinted = "Hello world!";

        // Целочисленные типы данных
        byte aByte = (byte) 100;   //-128 ... 127
        short aShort = 100; // -32768... 32767
        int aInt = 100;
        long aLong = 100L;
        // Типы данных с плавающей точкой
        float aFloat = 1.1f;
        double aDouble = 1.2d;
        // Символьный
        char aChar = '\u0000';
        // Логический
        boolean aBoolean = false;


        // Операторы
        // 1. Присвоение =
        // Арифметические  + - * / %
        System.out.println(aByte + aShort);
        // Логические операторы < > <= >= == !=
        int age = 64;
        int staj = 30;
        String name = "Dima";

        if (age >= 65 && staj >= 10 && name.equals("Дима")) {
            System.out.println("Пенсия!");
        } else {
            System.out.println("Ты слишком молод");
        }
        // Операторы && ||

        char sex = 'm';

        if (sex == 'm') {
            name = "Dima";
        } else if (sex == 'w') {
            name = "Julia";
        }

        name = (sex == 'm')
                ? "Dima"
                : "Julia";



        System.out.println(strToBePrinted);
    }
}