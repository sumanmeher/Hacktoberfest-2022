// Fahrenheit to Celsius converting  in C
#include<stdio.h>
int main()
{
    float far, cel;
    printf("Enter Temperature in Fahrenheit : ");
    scanf("%f", &far);
    cel = (far-32)/1.8;
    printf("Equivalent Temperature in Celsius = %0.2f", cel);
    return 0;
}