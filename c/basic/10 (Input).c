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
