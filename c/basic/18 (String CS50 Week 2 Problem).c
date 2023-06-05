// Week 2 Problem statement
// Average and total hour anyone have done CS%) course

#include <stdio.h>
#include <string.h>

int main(void)
{
    int week;
    printf("Enter number of weeks for CS50 : ");
    scanf("%i",&week);
    printf("you are taking %i couse\n", week);

    int arr[week];
    for (int x = 0; x<week; x++)
    {
        printf("Number of hour for week %i : ",x);
        scanf("%i", &arr[x]);
    }
    
    for (int x = 0; x<week; x++)
    {
        printf("Week %i you give %i hours.\n" ,x,arr[x]);
    }
    char inp;
    int tot = 0;
    for (int i = 0; i<week; i++)
    {
        tot = tot+arr[i];
    }
    printf("Total of %i\n",tot);
    printf("Enter a for average hour and t for total hour \n");
    scanf(" %c",&inp);
    
    if (inp == 'a')
    {
        printf("Average hour given in CS50 is : %i",tot/week);
    }
    else if (inp=='t')
    {
        printf("Total hour given in CS50 is %i",tot);
    }
    else
    {
        printf("invalid input !! \n");
    }
    return 0;
}
