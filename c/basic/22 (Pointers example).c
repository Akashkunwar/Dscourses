#include <stdio.h>
int main(void)
{
    char *a = "Hello";
    char *b = "Hello!";

    printf("%s\n", "Printing the strings : ");
    printf("%s", "a : ");
    printf("%s\n", a);
    printf("%s", "b : ");
    printf("%s\n", b);
    printf("\n");

    printf("%s\n", "The location of 1st letters of strings are : ");
    printf("%s", "a : ");
    printf("%p\n", a);
    printf("%s", "b : ");
    printf("%p\n", b);
    printf("\n");

    printf("%s\n", "The the letters at that location of 1st letters of strings are : ");
    printf("%s", "b : ");
    printf("%c\n", *a);
    printf("%s", "b : ");
    printf("%c\n", *a);
    printf("\n");


    if (*a == *b && *(a+1) == *(b+1) && *(a+2) == *(b+2) && *(a+3) == *(b+3) && *(a+4) == *(b+4))
    {
        printf("%s","First 4 letters of string is : ");
        printf("Same\n");
        printf("\n");
    }

    if (*a == *b && *(a+1) == *(b+1) && *(a+2) == *(b+2) && *(a+3) == *(b+3) && *(a+4) == *(b+4) && *(a+5) == *(b+5))
    {
        printf("%s","First 5 letters of string is : ");
        printf("Same\n");
        printf("\n");
    }
    else
    {
        printf("%s","First 4 letters of string is : ");
        printf("Different\n");
        printf("\n");
    }
}
