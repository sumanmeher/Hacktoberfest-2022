/* checking whether  number is odd or even*/

#include<stdio.h>
int main()
{
    int n;
    printf("\n ENTER ANY NUMBER: ");
    scanf("%d",&n);
    if (n % 2 == 0)
    printf("THE NUMBER IS EVEN\n");
    else
    printf("THE NUMBER IS ODD\n");
    return 0;
    
}