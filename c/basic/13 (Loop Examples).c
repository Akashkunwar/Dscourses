// To run 1st code comment other code and vice-versa

// // Infinite loop to print Hello forever
// 1. For working with boolian values
#include <stdbool.h>
#include <stdio.h>
int main(void)
{
    while (true)
    {
        printf("Hello\n");
    }
}


// 2. print ? many times in loop
#include <stdio.h>
int main(void)
{
    int count = 0;
    int num = 10;
    while (count<num)
    {
        printf("?");
        count++;
    }
}

// 3. print square block of wall 
#include <stdio.h>
int main(void)
{
    for (int i = 0; i < 4; i++)
    {
        printf("####\n");
    }
}


// 4. It is also take negative numbers
#include <stdio.h>
int main(void)
{
    // int n = 4;
    // To protect change in value of n by mistake 
    // const int n = 4;
    // To take user input and printing according to it 
    int n;
    scanf("%d",&n);

    // Take input while user give some positive number
    while (n<1)
    {
        scanf("%d",&n);
    }

    for (int i = 0; i < n; i++)
    {
        for (int j=0; j<n;j++)
        {
            printf("#");
        }
        printf("\n");
    }
}

// 5. It will filter negetive number for above code 
#include <stdio.h>
int main(void)
{
    int n;
    do 
    {
        scanf("%d",&n);
    }
    while (n<1);
    
    for (int i = 0; i < n; i++)
    {
        for (int j=0; j<n;j++)
        {
            printf("#");
        }
        printf("\n");
    }
}
