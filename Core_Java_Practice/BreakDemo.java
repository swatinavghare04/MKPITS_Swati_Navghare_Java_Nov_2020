// use of break

class BreakDemo
{
public static void main(String[] args)
{
 int[] arrayofints={{32,87,3,589},{12,1076,2000,8},{622,127,77,955}};
 int searchfor =12;
 int i;
int j=0;
 boolean foundIt= false;

 for(i=0;i<arrayofints.length;i++)
 {
	 for(j=0;j<arrayofints[i].length;j++)
	 {
 if(arrayofints[i][j]==searchfor)
 {
 foundIt = true;
 break;
 }
 }
}
 if(foundIt)
 {
 System.out.println("found " + searchfor + " at"+ i+","+j);
 }
 else
 {
 System.out.println(searchfor +"not found in array");
 }
}
}
