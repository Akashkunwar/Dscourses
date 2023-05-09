// Write functions in C 
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

