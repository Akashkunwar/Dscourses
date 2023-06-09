// 1. Pointer (Address of variables stored in memory)
#include <stdio.h>
int main(void)
{
    int n = 50;
    printf("%i\n", n);
    printf("%p\n", &n); // Address where that integer is stored in the memory

    int *p = &n; // Storing the address of integer in p variable
    printf("%p\n", p);

    printf("%i\n", *p); // Go to address of p and print whatever is there
}

// 2. Getting address of the strings 
#include <stdio.h>
int main(void)
{
    char *s = "hello!";
    printf("%s\n", s); // Print string
    printf("%p\n",s);
    printf("%p\n", &s[0]);
    printf("%p\n", &s[1]);
    printf("%p\n", &s[2]);
    printf("%p\n", &s[3]);
    printf("%p\n", &s[4]);
}

// Printing all character address and letters
#include <stdio.h>
int main(void)
{
    char *a = "Hello!";
    
    printf("%p\n", a);
    printf("%c\n", *a);
    printf("%p\n", *(a+1));
    printf("%c\n", *(a+1));
    printf("%p\n", &a[0]);

    printf("%p\n", *(a+2));
    printf("%c\n", *(a+2));
    printf("%p\n", &a[1]);

    printf("%p\n", *(a+3));
    printf("%c\n", *(a+3));
    printf("%p\n", &a[2]);

    printf("%p\n", *(a+4));
    printf("%c\n", *(a+4));
    printf("%p\n", &a[3]);

    printf("%p\n", *(a+5));
    printf("%c\n", *(a+5));
    printf("%p\n", &a[4]);
}


// Printing all characters with the help of pointers
#include <stdio.h>
int main(void)
{
    char *a = "Hello!";
    printf("%s\n",a);
    printf("%s\n",a+1);
    printf("%s\n",a+2);
    printf("%s\n",a+3);
}
