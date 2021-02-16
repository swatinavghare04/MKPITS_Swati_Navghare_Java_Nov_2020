#include<stdio.h>
#include<conio.h>
void main()
{
int side,area;
int peri;
clrscr();
printf("enter the value of side of square : ");
scanf("%d",&side);
area=side*side;
printf("Area of rectangle is : %d\n",area);
peri=4*side;
printf("\nPerimeter of rectangle is : %d",peri);
getch();

}