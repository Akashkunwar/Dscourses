// 1. Print average of 3 numbers
#include <stdio.h>
int main(void)
{
    int score1 = 72;
    int score2 = 77;
    int score3 = 45;
    
    // Calculating and printing the average
    printf("Average %f\n", (score1 + score2 + score3) / 3.0);

    return 0;
}


// 2. This can also be achieved bu using arrays
#include <stdio.h>
int main(void)
{
    int scores[3];
    scores[0] = 72;
    scores[1] = 77;
    scores[2] = 45;
    
    // Calculating and printing the average
    printf("Average %f\n", (scores[0] + scores[1] + scores[2]) / (float)3);

    return 0;
}


// 3. This can also be achieved bu using arrays but by taking user input
#include <stdio.h>
int main(void)
{
    int scores[3];
    // Taking input from the user for the scores
    scanf("%d", &scores[0]);
    scanf("%d", &scores[1]);
    scanf("%d", &scores[2]);
    
    // Calculating and printing the average
    printf("Average %f\n", (scores[0] + scores[1] + scores[2]) / (float)3);

    return 0;
}

// 4. Creating funciton with an array
#include <stdio.h>

int size = 3;

// Function that calculates the average of an array
float avrg(int ary[]);

int main(void)
{
    int scores[size];
    
    // Taking input from the user for the scores
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &scores[i]);
    }
    
    // Calculating and printing the average using the avrg function
    printf("Average %f\n", avrg(scores));

    return 0;
}

// Creating a function that calculates the average of an array
float avrg(int ary[])
{
    int sum = 0;
    
    // Calculating the sum of array elements
    for (int i = 0; i < size; i++)
    {
        sum += ary[i];
    }
    
    return sum / (float)size;
}
