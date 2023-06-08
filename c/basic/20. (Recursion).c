// Piramid before recursion
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
        for (int j=0; j<i+1; j++)
        {
            printf("#");
        }
        printf("\n");
    }
}


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
    if (size<=0)
    {
        return;
    }
    
    print_grid(size-1); // Here recursion is beting used
    
    for (int i = 0; i<size; i++)
    {
        printf("#");
    }
    printf("\n");
}
