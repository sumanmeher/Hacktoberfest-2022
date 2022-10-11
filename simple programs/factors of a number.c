//Program for print factors of any given numbers...
#include<stdio.h>
#include<conio.h>
int main()
{
    int num, i=1;
    printf("Enter any number : ");
    scanf("%d", &num);
    printf("Factors of %d: \n", num);

    for(i; i<=num; i++)
    {
        if(num%i==0)
            printf("%d\n", i);
    }
    return 0;
}
 