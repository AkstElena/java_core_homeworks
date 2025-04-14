package homework5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*
Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
во вновь созданную папку ./backup
 */
public class Task1 {

    public static void copyDirectory(String oldDirectory, String newDirectory) throws IOException {
        File oldFolder = new File(oldDirectory);
        for (File file : oldFolder.listFiles()) {
            if (file.isDirectory()) continue;
            Files.copy(Path.of(file.getPath()), Path.of(newDirectory + file.getName()), REPLACE_EXISTING);
            System.out.printf(file.getName() + " скопирован\n");
        }
    }

    public static void copyDirectoryToBackup(String directory) throws IOException {
        if (Files.notExists(Path.of(directory))) {
            System.out.println("Данной директории не существует");
        } else {
            String newDirectory = "src/homework5/backup/";
            Path pathBackup = Paths.get(newDirectory);
            if (Files.notExists(pathBackup)) {
                Path backup = Files.createDirectory(pathBackup);
            }
            copyDirectory(directory, newDirectory);
        }
    }

    public static void main(String[] args) throws IOException {
        copyDirectoryToBackup("src/homework5/oldDirectory");
    }
}
