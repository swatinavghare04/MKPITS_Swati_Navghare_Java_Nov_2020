/* Java SequenceInputStream Example - in this  we are printing the data of two files testin.txt and testout.txt
using SequenceInputStream.
 */

import java.io.*;
public class PrintDataFromTwoFiles {
    public static void main(String args[])throws Exception{
        FileInputStream input1=new FileInputStream("D:\\testin.txt");
        FileInputStream input2=new FileInputStream("D:\\testout.txt");
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        int j;
        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
