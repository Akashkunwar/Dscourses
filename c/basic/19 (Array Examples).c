// Finding whether a number is in a array or not
#include <stdio.h>
#include <string.h>
int main(void)
{
    int arr[]={2,5,3,6,4,3,45,34,67,2};
    int inp;
    scanf("%i",&inp);
    for (int x=0; x<10; x++)
    {
        if (inp==arr[x])
        {
            printf("Yes, number %i is present in this array\n", inp);
            return 0;
        }
    }
    printf("Not found\n");
    return 1;
}

// Finding a number from an array by giving name only
#include <stdio.h>
#include <stdbool.h>
#include <string.h>
int main(void)
{
    char name[5][20] = {"Akash","Anuj","Carter","Milli","Tom"};
    char number[5][15] = {"+91-9835759437", "9374638992", "+918937667832", "9653456927", "+918767399003"};
    char get_name[20];
    scanf("%s",get_name);
    for (int x=0; x<5;x++)
    {
        if (strcmp(name[x], get_name)==0)
        {
            printf("Found!\n%s : %s\n",get_name,number[x]);
            return 0;
        }
    }
    printf("Not found!\n");
    return 1;
}

// Searching a number from contact
#include <stdio.h>
#include <string.h>

int main(void)
{
    char name[][10] = {"Akash", "Anuj", "Carter", "Milli", "Tom"};
    char number[][15] = {"+91-9835759437", "9374638992", "+918937667832", "9653456927", "+918767399003"};
    char get_name;
    
    scanf(" %c", &get_name);
    
    for (int x = 0; x < 5; x++)
    {
        if (name[x][0] == get_name)
        {
            printf("Found!\n%s : %s\n", name[x], number[x]);
            return 0;
        }
    }
    
    printf("Not found!\n");
    return 1;
}
