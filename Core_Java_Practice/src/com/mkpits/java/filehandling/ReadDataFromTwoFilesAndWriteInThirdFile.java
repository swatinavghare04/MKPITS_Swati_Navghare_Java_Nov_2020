//Example that reads the data from two files and writes into another file.

import java.io.*;
public class ReadDataFromTwoFilesAndWriteInThirdFile {
    public static void main(String args[])throws Exception{
        FileInputStream fin1=new FileInputStream("D:\\testin.txt");
        FileInputStream fin2=new FileInputStream("D:\\testout.txt");
        FileOutputStream fout=new FileOutputStream("D:\\testout12.txt");
        SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
        int i;
        while((i=sis.read())!=-1)
        {
            fout.write(i);
        }
        sis.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Success..");
    }
}
