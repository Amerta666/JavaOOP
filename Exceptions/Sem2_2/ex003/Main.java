/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
значение ?, заменить его на соответствующее число. Если на каком-то месте встречается символ, отличный от
числа или ?, бросить подходящее исключение. Записать в тот же файл данные с замененными символами ?
*/

package Sem2_2.ex003;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File fileToRead = new File("names.txt");
        File fileToWrite = new File ("names2.txt");
        HashMap<String, Integer> names = readFile(fileToRead);
        writeFile(fileToWrite, names);
    }

    public static HashMap<String, Integer> readFile(File file) {

        HashMap<String, Integer> names = new HashMap<>();

        try (FileReader fr = new FileReader(file); BufferedReader reader = new BufferedReader(fr)) {
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                String[]  lineArray = line.split("=");
                System.out.println(Arrays.toString(lineArray));
                if (lineArray[1].equals("?")) {
                    int temp = lineArray[0].length();
                    names.put(lineArray[0], temp);
                } else {
                    try {
                        names.put(lineArray[0], Integer.parseInt(lineArray[1]));
                    } catch (NumberFormatException e) {
                        System.out.println("NumberFormatException");
                    }
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public static void writeFile(File file, HashMap<String, Integer> names) {
        try (FileWriter fw = new FileWriter(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }

            names.forEach((s, integer) ->  {
                try {
                    fw.write(String.format("%s=%s\n",s,integer));
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            });
        } catch (IOException e) {
            System.out.println("Ошибка с файлом IO");
        }
    }
}