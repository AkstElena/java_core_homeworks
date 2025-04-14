package homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = {3, 1, 1, 2, 0, 1, 3, 2, 0};

        // Используем класс для записи байтов в файл
        try (FileOutputStream file = new FileOutputStream("src/homework5/task2.bin")){
            for (int b = 0; b < 3; b++) { //задаем три байта максимум
                byte wb = 0;
                for (int i = 0; i < 3; i++) { //записываем в каждый байт 3 значения
                    wb += (byte) (array[3 * b + i] << (i * 2)); // используем сдвиг битов влево
                }
                file.write(wb);
            }
            file.flush();
        }


        // проверяем размер файла
        File file = new File("src/homework5/task2.bin");
        long size = file.length();
        System.out.println("The file size is " + size + " bytes");
    }
}
