//  WAP to demonstrate example that how we can use the available() method to get number of available bytes
// in the input stream.

package src.com.mkpits.java.practiceprogram;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx02 {
    public static void main(String[] args) {

        // create an array of byte
        byte[] array = {1, 2, 3, 4};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            // Returns the available number of bytes
            System.out.println("Available bytes at the beginning : " + input.available());

            // Reads 2 bytes from the input stream
            input.read();
            input.read();

            // Returns the available number of bytes
            System.out.println("Available bytes at the end : " + input.available());

            input.close();
        } catch (Exception ee) {
            ee.getStackTrace();
        }
    }
}
