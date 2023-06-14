// When you copy a string like this it just assign same address to it and any change in coppied string will start reflecting in 1st string as well
#include <stdio.h>
#include <string.h>
#include <ctype.h>
// #include <stdlib.h>

int main(void)
{
    char c[] = "topper";
    char *d = c;

    d[0] = toupper(d[0]);
    
    printf("c : %s\n",c);
    printf("d : %s\n",d);
}


#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int main(void)
{
    char *c = "topper";
    char *d = malloc(strlen(c) + 1); // malloc Allocate memory for d

    int n = strlen(c) + 1; // Length of c plus 1 for the null terminator

    for (int i = 0; i < n; i++)
    {
        d[i] = c[i]; // Copy characters from c to d
    }

    d[0] = toupper(d[0]);

    printf("c : %s\n", c);
    printf("d : %s\n", d);

    free(d); // Free the dynamically allocated memory

    return 0;
}


// Simple 1 line code for that
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int main(void)
{
    char *c = "topper";
    char *d = malloc(strlen(c) + 1); // Allocate memory for d

    strcpy(d, c); // Copy contents of c into d
    d[0] = toupper(d[0]);

    printf("c : %s\n", c);
    printf("d : %s\n", d);

    free(d); // Free the dynamically allocated memory

    return 0;
}



#include <stdio.h>
int main(void)
{
    int *x; // Declearing Pointers
    int *y;

    x = malloc(sizeof(x));
    
    *x = 34;
    // *y = 43;

    y = x;

    y = 13;



    // printf("%i", x);
    printf("%p\n", y);
}
