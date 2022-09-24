# Vectors
# Creating vectors
# Vectors can store only same type of variable

a <- c(1L, 2L, 3L, 4L, 5L) # All intigers
a
typeof(a)
class(a)

b <- c(1, 2, 3, 4, 5) # All double
b
typeof(b)
class(b)

c <- c("hello", "Hola", "Hye", "Halo") # All Characters
c
typeof(c)
class(c)

# If one is character all are converted in character
d <- c(1, 2.4, "Kunwar", 4 + 9i)
d
typeof(d)
class(d)

# Create sequence of numbers in a vector
e <- c(2:12)
e
class(e)

# Create a sequence which is incremented by some number
f <- c(seq(1, 10, by = 2))
f
class(f)

f <- c(seq(3, 14, by = 2.3))
f
class(f)

# Arthmetic operation in vectors
g <- c(10, 9, 8, 7, 6)
h <- c(1, 2, 3, 4, 5)

# Must have equal no. of element in vectors
i <- g + h # Addition
i

j <- g - h # Substraction
j

k <- g * h # Multiplication
k

l <- g / h # Division
l

# Sorting vectors
g
sort(g)
h <- sort(g) # Ascending
h

i <- sort(g, decreasing = TRUE) # Descending
i

# Indexing
i
i[2] # Access one element by giving its position

i[c(2, 5)] # Access more than one element by its position

i[c(T, T, F, F, T)] # Access element by logical operators T
i[c(TRUE, TRUE, FALSE, FALSE, TRUE)]

i[i > 8] # We can access index with condition

i
i[-1] # Access all element by skipping the negetive index

i[c(-2, -4)] # Access all element by skipping the negetive index

i[3] <- 15 # Modify an element in the vector
i

i <- NULL # Deleting all element from vector
i

rm(i) # Delete variable i
