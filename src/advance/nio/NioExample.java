package advance.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {
    public static void main(String[] args) throws IOException {
        //Reading from a file
        FileChannel readChannel;
        try (FileInputStream fin = new FileInputStream("source.txt")) {
            readChannel = fin.getChannel();
        }
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        int result = readChannel.read(readBuffer);
        System.out.println("file read successfully " + result);


        //Writing to a file
        FileChannel writeChannel;
        try (FileOutputStream fout = new FileOutputStream("dest2.txt")) {
            writeChannel = fout.getChannel();
        }
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        String message = "this is a test string";
        writeBuffer.put(message.getBytes());
        writeBuffer.flip();
        writeChannel.write(writeBuffer);
        System.out.println("file written successfully");
    }
}
