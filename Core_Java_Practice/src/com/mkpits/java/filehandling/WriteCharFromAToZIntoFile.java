// WAP in java to create a file and write character from A to Z using FileOutputStream.

import java.io.*;
public class WriteCharFromAToZIntoFile {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("D:\\myfile.txt");
            int i = 1;
            for(i=65;i<=97;i++){
                fout.write(i);
            }
            fout.close();
            System.out.println("File Created");
        }
        catch (Exception ee){}
    }
}
