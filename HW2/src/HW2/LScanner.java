package HW2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import java.util.Scanner;

public class LScanner {
    public static void main(String[] args) {

        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDirectory);

        try {
            String str = System.getProperty("user.dir");
            System.out.println(str + "/" + "main.java");
            Scanner fileStream = new Scanner(Paths.get(str + "/" + "proj2/" + "txt.txt"), StandardCharsets.UTF_8);

            while (fileStream.hasNext()) {
                String word = fileStream.next();
                System.out.println("Word: " + word);
            }

        } catch (NoSuchFileException e) {
            // Обрабатываем исключение, если файл не найден
            System.out.println("Exception 1: File not found - " + e);
        } catch (IOException e) {
            // Обрабатываем другие исключения ввода/вывода
            System.out.println("Exception 2: I/O error - " + e);
        } catch (Exception e) {
            // Общий обработчик исключений
            System.out.println("Exception 3: " + e);
        }
    }
}
