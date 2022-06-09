package advance.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("source.txt"); FileWriter writer = new FileWriter("dest.txt")) {
            //Reading source file and writing content to target file character by character
            int content;
            while ((content = reader.read()) != -1) {
                writer.append((char) content);
            }
        }
    }
}
