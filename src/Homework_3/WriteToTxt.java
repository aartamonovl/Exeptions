package Homework_3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {
    public static void write(Human human) {
        try (FileWriter writer = new FileWriter(human.getLastName(), true)){
            writer.write(human.toString() + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи в файл." + e);
        }
    }
}
