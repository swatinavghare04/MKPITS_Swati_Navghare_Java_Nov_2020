// wap in java to check whether a character is an alphabate,digit or a special symbol;

import java.util.*;
class asd
{
public static void main(String[] args)
{
char ch;

Scanner sct = new Scanner(System.in);
System.out.println("enter character");
ch =sct.next().charAt(0);

if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
{
System.out.println("enter character is an alphabate");
}
else if(ch>='0'&& ch<='9')
{
System.out.println("enter character is a digit");
}
else
{
System.out.println("character is a special symbol");
}

}
}