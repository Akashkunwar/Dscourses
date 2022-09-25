# Matrix
aa <- matrix(1:9, nrow = 3, ncol = 3)
aa
# Output[,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
# [3,]    3    6    9

matrix(1:9, nrow = 3, ncol = 3, byrow = TRUE)

# Output[,1] [,2] [,3]
# [1,]    1    2    3
# [2,]    4    5    6
# [3,]    7    8    9

z <- matrix(1:9, nrow = 3, ncol = 3, byrow = TRUE, dimnames = list(c("A","B","C"), c("X","Y","Z"))) # Renaming rows and columns
z
#   X Y Z
# A 1 2 3
# B 4 5 6
# C 7 8 9

a <- cbind(c(1,2,3,4),c(10,11,12,13)) # Creating matrix in column format
a
#      [,1] [,2]
# [1,]    1   10
# [2,]    2   11
# [3,]    3   12
# [4,]    4   13

b <- rbind(c(1,2,3,4),c(10,11,12,13)) # Creating matrix in row format
b
#      [,1] [,2] [,3] [,4]
# [1,]    1    2    3    4
# [2,]   10   11   12   13

dim(a) # Check dimension of metrix
# 4 2

b[1,2] # Accesing element of matrix by row, column
# 2

aa
#      [,1] [,2] [,3]
# [1,]    1    4    7
# [2,]    2    5    8
# [3,]    3    6    9

aa[c(2,3), c(2,3)] # Access 2nd, 3rd row & 2nd, 3rd column

aa[, 2] # Access 2nd column
# 4 5 6

aa[1, ] # Access 1st row
# 1 4 7

aa[-1, ] # Access/Show all element except 1st row

aa[-1] # Access/Show all element except 1st element

b
b[c(T,T), c(F,F,T,T)]  # Access/Show elements using logical operators (It keeps on repeatins)

z
#   X Y Z
# A 1 2 3
# B 4 5 6
# C 7 8 9

z["B","Z"] # Access element using rows and column

t(z) # Transpose

z[z%%2==0] # Access elements using conditional statement

z[2,2] <- 100 # Change element of matrix
z
#   X   Y Z
# A 1   2 3
# B 4 100 6
# C 7   8 9

z <- z[c(1,2),] # Add or remove rows by assigning in the values
z
#   X   Y Z
# A 1   2 3
# B 4 100 6

a
rbind(a,c(12,34)) # Addong rows in a matrics
cbind(a,c(23,56)) # Addong columns in a matrics

rownames(z) # Getting row names
colnames(z) # Getting column names

# Arthmetic operation on matrics
# Arthmetic operation can be performed on matrix with same dimensions
s <- matrix(1:4, ncol=2)
s
#      [,1] [,2]
# [1,]    1    3
# [2,]    2    4

t <- matrix(6:9,ncol=2)
t
#      [,1] [,2]
# [1,]    6    8
# [2,]    7    9

t + s # Matrix Addition
#      [,1] [,2]
# [1,]    7   11
# [2,]    9   13

t - s # Matrix Substraction
#      [,1] [,2]
# [1,]    5    5
# [2,]    5    5

t * s # Matrix Multiplication
#      [,1] [,2]
# [1,]    6   24
# [2,]   14   36

t / s # Matrix Division
#      [,1]     [,2]
# [1,]  6.0 2.666667
# [2,]  3.5 2.250000

v <- c(7:10) # Assigning values in matrix
v
# [1]  7  8  9 10

z <- matrix(v,ncol=2) # We can create matrix with vector
z
#      [,1] [,2]
# [1,]    7    9
# [2,]    8   10
