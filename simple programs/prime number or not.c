
//check prime number or composite number.........
#include<stdio.h>
int main()
{
    int num,i,c=0;
    printf("Enter any number to check prime or composite: ");
    scanf("%d",&num);
    
    for(i=2; i<num; i++)
    {
        if(num%i == 0)
        {
            c++;
            break;
        }
    }
    if(c==0)
        printf("\nIt's a prime number");
    else
        printf("\nIt's a composite number");
    return 0;
}
