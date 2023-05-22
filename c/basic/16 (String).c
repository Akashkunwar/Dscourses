// 1. Declare each charactor in a variable
#include <stdio.h>
int main(void)
{
    char c1 = 'H';
    char c2 = 'I';
    char c3 = '!';
    printf("%C%C %C\n",c1,c2,c3); //HI!
}

// 2. At the end of letters in string we add 0 to identify end of string
#include <stdio.h>
int main(void)
{
    char str[] = "hye!";
    printf("%s\n",str); //hye!
    printf("%c\n",str[0]); //h
    printf("%c\n",str[1]); //y
    printf("%c\n",str[2]); //e
    printf("%c\n",str[3]); //!
    printf("%i\n",str[4]); //0
    printf("%i\n",str[5]); //-128
}


#include <stdio.h>
#include <string.h>
int main(void)
{   
    char str[2][100];
    strcpy(str[0],"Hye!");
    strcpy(str[1],"Bye!");
    printf("%s %s\n",str[0], str[1]); // Hye! Bye!
    printf("%c%c%c%c %c%c%c%c\n",str[0][0],str[0][1],str[0][2],str[0][3],str[1][0],str[1][1],str[1][2],str[1][3]); // Hye! Bye!
}
