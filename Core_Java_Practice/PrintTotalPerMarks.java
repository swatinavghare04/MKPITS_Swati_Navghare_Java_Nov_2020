// program to print total, percent of the marks of three subjects.

class PrintTotalPerMarks
{
public static void main(String[] args)
{
int m1=80,m2=80,m3=80;
int total = m1+m2+m3;
float per = (float)(total/300.0f)*100.0f;
System.out.println("total ="+total);
System.out.println("per ="+per);
if(per>75)
{
	System.out.println("Grade : Distinction");
	}
	else if(per>60&&per<75)
	{
		System.out.println("Grade :First class");
		}
		else
		{
			System.out.println("Fail");
			}
}
}