//  Solving the following challenge using C language.
/*  Use the Ternary operator.
    Fetch a positive integer greater than zero.
    Report whether that input is odd or even.   */

#include<stdio.h>

int main()
{
    int i;
    char *c;

    printf("Enter an integer greater than zero: ");
    scanf("%d", &i);

    if (i<1)
    {
        printf("Enter an integer greater than zero!");
    }
    else
    {
        c = (i % 2) ? "odd" : "even";
        printf("%d is an %s number.", i, c);
    }
    
}