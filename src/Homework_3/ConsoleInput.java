package Homework_3;

import java.util.Scanner;

public class ConsoleInput {
    public static String inputData(boolean message) {
        if (message)
            startInputMessage();
        else
            repeatMessage();
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
            return str;
        }
    }

    private static void repeatMessage(){
        System.out.println("Хотите ввести данные другого человека? (Y/N)");
    }

    private static void startInputMessage() {
        System.out.println("""
                Введите следующие данные через пробел:фамилия,
                имя,
                отчество,
                дата рождения (формат dd.mm.yyyy),
                номер телефона (7 цыфр),
                пол (f/m).""");
    }
}
