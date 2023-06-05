// Finding length of string
#include <stdio.h>
#include <string.h>
int main(void)
{
    char str[100];
    printf("Input a string : ");
    scanf("%s",str);
    printf("You entered : %s\n",str);
    int n = 0;
    while (str[n] != '\0')
    {
        n++;
    }
    printf("Manual length of string you entered is %i\n",n);
    int n1 = strlen(str);
    printf("Sterlen length of string you entered is %i\n",n1);
}

// convert string into uppercase string 
#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(void)
{
    char str[100];
    printf("Before : ");
    scanf("%s",str);
    printf("After manual : ");
    for (int i = 0; i < strlen(str);i++)
    {
        if (str[i]>='a' && str[i]<='z')
        {
            printf("%C",str[i]-32);
        }
        else
        {
            printf("%c",str[i]);
        }
    }
    printf("\n");
        printf("After lib : ");

    for (int i = 0; i < strlen(str);i++)
    {
        if (isupper(str[i]))
        {
            printf("%C",tolower(str[i]));
        }
        else
        {
            printf("%c",str[i]);
        }
    }
    printf("\n");

    printf("After lib : ");
    for (int i = 0; i < strlen(str);i++)
    {
        printf("%C",toupper(str[i]));
    }
    printf("\n");

}
