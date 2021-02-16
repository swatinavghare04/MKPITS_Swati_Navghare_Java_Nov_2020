#include<stdio.h>
#include<conio.h>
void main()
{
int len,bre,area;
int peri;
clrscr();
printf("enter the value of length and breadth : ");
scanf("%d%d",&len,&bre);
area=len*bre;
printf("Area of rectangle is : %d",area);
peri=2*(len+bre);
printf("Perimeter of rectangle is : %d",peri);
getch();

}