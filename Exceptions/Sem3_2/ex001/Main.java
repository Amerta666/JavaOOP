package Sem3_2.ex001;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        rwLine(Path.of("d:\\Learning\\JavaOOP\\1.txt"), Path.of("d:\\Learning\\JavaOOP\\2.txt"));
    }

    private static void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader(pathRead.toFile()));
             BufferedWriter out = new BufferedWriter(new FileWriter(pathWrite.toFile()))) {
            out.write(in.readLine());
        }
    }
}
