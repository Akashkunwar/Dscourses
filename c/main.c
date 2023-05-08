// Print Hello world in C

#include <stdio.h>
int main(void)
{
    printf("hello World");
}

// To run 1st code comment other code and vice-versa
// Taking a input and printing it 

#include <stdio.h>

int main() {
    char name[50];
    printf("Please enter your name: ");
    scanf("%s", name);
    printf("Hello %s!\n", name);
    return 0;
}

#include <stdio.h>
int main(void)
{
    int inpt;
    printf("Enter a input : ");
    scanf("%d", &inpt);
    printf("Your input is : %d",inpt);
    return 0;
}

// Conditoinal operators in c
// It has if else operators

#include <stdio.h>
int main() {
    int a = 4;
    int b = 4;
    if (a<b) 
    {
        printf("A is less than B");
    }
    else if (a>b)
    {
        printf("A is greater than B");
    }
    else
    {
        printf("A is equal to B");
    }
    return 0;
}


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


// 1. Infinite loop to print Hello forever
// For working with boolian values
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
