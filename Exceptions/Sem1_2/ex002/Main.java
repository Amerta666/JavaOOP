/*
Реализовать ввод имени файла и проверку есть ли этот файл
*/

package Sem1_2.ex002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String file = scanner.nextLine();
            try {
                FileReader fr = new FileReader(new File(file));
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл с таким именем не найден, введите другое имя файла");
            }
        }
    }
}