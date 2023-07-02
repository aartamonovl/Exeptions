package Homework_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Homework2 {
    /*    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
        и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
        вместо этого, необходимо повторно запросить у пользователя ввод данных.*/
    public static float inputFloatNumber() {
        boolean noFloat = true;
        float fNumber = 0;
        Scanner scanner = null;
        while (noFloat) {
            System.out.print("Input float number: ");
            scanner = new Scanner(System.in);
            if (scanner.hasNextFloat()) {
                fNumber = scanner.nextFloat();
                noFloat = false;
            } else {
                System.out.println("There is no float number. Try again!");
            }
        }
        scanner.close();
        return fNumber;
    }

    /*Если необходимо, исправьте код:
     * Не понятно, что и как исправлять, так как нет определения intArray. Поэтому сделал double[] и никаких ошибок при делении на 0.*/
    public static void task2() {
        double[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    }

    //Если необходимо, исправьте код:
    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void task4() throws NullStrException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (!str.isEmpty()){
            System.out.println(str);
        } else throw new NullStrException();
    }

    static class NullStrException extends Exception {

        public NullStrException() {
            super("String cant be null");
        }
    }
}