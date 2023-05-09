#include <stdio.h>
int main(void)
{
    long long a;
    printf("Enter 1st number : ");
    scanf("%lld",&a);
    long long b;
    printf("Enter 2nd number : ");
    scanf("%lld",&b);
    char op;
    printf("Enter Operation : ");
    scanf(" %c",&op);

    if (op == '+')
    {
        printf("%lld\n",a+b);
    }
    else if (op == '-')
    {
        printf("%lld\n", a-b);
    }
    else if (op == '/')
    {
        printf("%lf\n", (double)a/b);
    }
    else if (op == '*')
    {
        printf("%lld\n", a*b);
    }
    else{
        printf("Invalid command!");
    }
    return 0;
}
