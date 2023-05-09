// Write functions in C 
// 1.) Function to create a vrick of #
#include <stdio.h>

int get_size(void);
void print_grid(int size);

int main(void)
{
    // Getting the size of grid
    int n = get_size();

    // Printing grid of brick
    print_grid(n);

}

int get_size(void)
{
    int n;
    do
    {
        scanf("%d", &n);
    }
    while (n<1);
    return n;
}

void print_grid(int size)
{
    for (int i=0; i<size; i++)
    {
        for (int j=0; j<size; j++)
        {
            printf("#");
        }
        printf("\n");
    }
}


// 2.) Function to get only negetive value as input
#include <stdio.h>
int get_negetive(void);
int main(void)
{
    int i = get_negetive();
    printf("%i\n",i);
}

int get_negetive(void)
{
    int n;
    do
    {
        printf("Negetive integer : ");
        scanf("%d",&n);
    }
    while (n>0);
    return n;
}

