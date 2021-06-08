/* WAP to demonstrate example that how we can use the available() method to get number of available bytes
 in the input stream. */

package src.com.mkpits.java.practiceprogram;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx03 {
    public static void main(String[] args) {

        // create an array of byte
        byte[] array = {1, 2, 3, 4};
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(array);

            // using the skip() method
            input.skip(2);
            System.out.print("Input Stream after skipping 2 bytes : ");

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ",");
                data = input.read();
            }

            // close() method
            input.close();
        } catch (Exception ee) {
            ee.getStackTrace();
        }
    }
}
