package Homework_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Controller {
    private static final int countNeedLength = 6;

    public static void run() {
        String humanData = ConsoleInput.inputData(true);
        String[] humanDataArray = humanData.split(" ");
        System.out.println(Arrays.toString(humanDataArray));
        isDataLength(humanDataArray.length);
        isString(humanDataArray[0]);
        isString(humanDataArray[1]);
        isString(humanDataArray[2]);
        isDateFormat(humanDataArray[3]);
        isPhone(humanDataArray[4]);
        isGender(humanDataArray[5]);
        Human human = new Human(humanDataArray);
        WriteToTxt.write(human);
        exit();
    }

    private static void exit() {
        System.exit(0);
    }

    private static void isGender(String gender) {
        if (!"f".equals(gender) && !"m".equals(gender)) {
            throw new RuntimeException("Таакого пола не существует");
        }
    }


    private static void isDataLength(int count) {
        if (count > countNeedLength) {
            throw new RuntimeException("Введено больше данных, чем требуется");
        } else if (count < countNeedLength) {
            throw new RuntimeException("Введено меньше данных, чем требуется");
        }
    }

    private static void isString(String str) {
        for (char chars : str.toCharArray()) {
            if (Character.isDigit(chars)) {
                throw new RuntimeException("В ФИО не может быть цыфры.");
            }
        }
    }

    private static void isDateFormat(String inDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(inDate.trim());
        } catch (ParseException pe) {
            throw new RuntimeException("Неправильный формат дня рождения." + pe);
        }
    }

    private static void isPhone(String phone) {
        if (phone.length() != 7) {
            throw new RuntimeException("Неправильный фомат телефона.");
        }
        try {
            Integer.parseInt(phone);
        } catch (NumberFormatException e) {
            throw new RuntimeException("В номере телефона не может быть символов" + e);
        }
    }
}
