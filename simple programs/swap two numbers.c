//program for swaping two numbers....
#include<stdio.h>

int main(){
    int n1,n2,tem;
    printf("Enter Two numbers :: ");
    scanf("%d %d",&n1,&n2);
    printf("Before swap ...");
    printf("%d %d\n",n1,n2);
    tem=n1;
    n1=n2;
    n2=tem;
    printf("After swap ...");
    printf("%d %d",n1,n2);
    return 0;
}