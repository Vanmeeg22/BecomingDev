//  Solving the following Challenge using C language:
/*  Fetch a value from input and modify it.
    Multiply it by 5 and display the result.
    Divide the result by 3 and display that result. */

#include<stdio.h>

int main()
{
    float i;

    printf("Enter a value: ");
    scanf("%f", &i);
    printf("%f\n", i);

    float m = i*5;
    float result = m;
    printf("After multiplying it with 5: %f\n", result);

    float result2 = result/3;
    printf("After dividing the previous result by 3: %f\n", result2);
}