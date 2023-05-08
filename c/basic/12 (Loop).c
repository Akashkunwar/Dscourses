// To run 1st code comment other code and vice-versa

// Task : printing hello 3 times

// 1. Manually printing hello 3 times
#include <stdio.h>
int main(void)
{
    printf("hello\n");
    printf("hello\n");
    printf("hello\n");
}

// 2. It will loop till 3 and print Hello 3 times by using while loop
#include <stdio.h>
int main (void)
{
    int counter = 0;
    while (counter < 3)
    {
        printf("Hello\n");
        counter = counter+1;
        
        // Below counter+=1 and counter++ is using same task as counter = counter+1
        // counter+=1;
        // counter++;
    }
}

// 3. It will loop till 3 and print Hello 3 times by using for loop

#include <stdio.h>
int main(void)
{
    for (int i = 0; i<3; i++)
    {
        printf("Hello\n");
    }
}
