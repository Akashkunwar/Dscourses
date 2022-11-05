# Creating list
a <- list(1,2,333,4)

class(a) # Type of list
# [1] "list"

str(a) # Structure of elements in the list
# List of 4
#  $ : num 1
#  $ : num 2
#  $ : num 333
#  $ : num 4

b <- list(1,"char", TRUE)
str(b)
# List of 3
#  $ : num 1
#  $ : chr "char"
#  $ : logi TRUE

c <- list(a, b) # Combining both list a and b
c
# [[1]]
# [[1]][[1]]
# [1] 1
# [[1]][[2]]
# [1] 2
# [[1]][[3]]
# [1] 333
# [[1]][[4]]
# [1] 4
# [[2]]
# [[2]][[1]]
# [1] 1
# [[2]][[2]]
# [1] "char"
# [[2]][[3]]
# [1] TRUE

b[2] # Accessing 2nd element of the list
c[[2]][2] # Accessing 2nd element of the list inside 2nd list

names(b) <- c("a", "b", "c") # Naming element in a list
b["b"]
# $b
# [1] "char"

names(c) <- c("list1", "lilst2")
c[["lilst2"]][3]

b[3]
# TRUE

b[3] <- FALSE # Update element in the list
b[3] # FALSE

class(a)
# [1] "list"

d <- unlist(a) # Converting list into vector
d
# [1]   1   2 333   4

class(d)
# [1] "numeric"

# Some predifined lists
letters
# [1] "a" "b" "c" "d" "e" "f" "g" "h" "i" "j" "k" "l" "m" "n" "o" "p" "q" "r" "s"
# [20] "t" "u" "v" "w" "x" "y" "z"

LETTERS
# [1] "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S"
# [20] "T" "U" "V" "W" "X" "Y" "Z"

month.abb
# [1] "Jan" "Feb" "Mar" "Apr" "May" "Jun" "Jul" "Aug" "Sep" "Oct" "Nov" "Dec"

month.name
# [1] "January"   "February"  "March"     "April"     "May"       "June"
#  [7] "July"      "August"    "September" "October"   "November"  "December"
