// WAP in java to read all character from file using FileInputStream.

import java.io.FileInputStream;
public class ReadAllCharInFromFileUseFileInputStram {
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("D:\\testout.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(Exception e){System.out.println(e);}
    }
}
