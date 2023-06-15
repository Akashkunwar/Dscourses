#include <stdio.h>
void swap(int *a, int *b);
void swap_loc(int *a, int *b);
int main(void)
{
    int a = 1;
    int b = 2;

    prntf("a is %i, b is %i", a,b);
    swap(a,b);
    prntf("a is %i, b is %i", a,b);
    swap_loc(&a,&b);
    prntf("a is %i, b is %i", a,b);
}

void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swap_loc(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}


#include <stdio.h>

void swap(int a, int b);
void swap_loc(int *a, int *b);

int main(void)
{
    int a = 1;
    int b = 2;

    printf("a is %i, b is %i\n", a, b);
    swap(a, b);
    printf("a is %i, b is %i\n", a, b);
    swap_loc(&a, &b);
    printf("a is %i, b is %i\n", a, b);

    return 0;
}

void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swap_loc(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

