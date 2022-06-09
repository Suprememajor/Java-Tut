package advance.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) throws IOException {

        try (FileInputStream inStream = new FileInputStream("source.txt"); FileOutputStream outStream = new FileOutputStream("dest.txt")) {

            //reads a byte at a time, if it reached end of the file, returns -1
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }
        }
    }
}
