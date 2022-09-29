# Data frames
a <- data.frame("number"=c(1:3), "name"=c("Akash", "Vyom", "Kunwar"), "Age"=c(21:23), stringsAsFactors = FALSE) # Creating Dataframe
a
#   number   name Age
# 1      1  Akash  21
# 2      2   Vyom  22
# 3      3 Kunwar  23

class(a)
# "data.frame"

a$name # Accessing columns of dataframe by name
# [1] "Akash"  "Vyom"   "Kunwar"
a["name"] # or
a[2]
#     name
# 1  Akash
# 2   Vyom
# 3 Kunwar

a[2,3] # Accesing elements of dataframe
# 22
a[2,2]
# "Vyom"

str(a) # Structure of Dataframe
# 'data.frame':   3 obs. of  3 variables:  
#  $ number: int  1 2 3
#  $ name  : chr  "Akash" "Vyom" "Kunwar"  
#  $ Age   : int  21 22 23

a[2,3] <- 30 # Modifying values of the dataframe
a
#   number   name Age
# 1      1  Akash  21
# 2      2   Vyom  30
# 3      3 Kunwar  23

a <- rbind(a, list(4, "Prakash", 22))
a
#   number    name Age
# 1      1   Akash  21
# 2      2    Vyom  30
# 3      3  Kunwar  23
# 4      4 Prakash  22

a <- cbind(a, "grade" = c("A+","A","D","B"))
a
#   number    name Age grade
# 1      1   Akash  21    A+
# 2      2    Vyom  30     A
# 3      3  Kunwar  23     D
# 4      4 Prakash  22     B

a[1,4] <- "C" # Changing values
a
#   number    name Age grade
# 1      1   Akash  21     C
# 2      2    Vyom  30     A
# 3      3  Kunwar  23     D
# 4      4 Prakash  22     B

# Deleting column of a dataframe
a["grade"] <- NULL # or
a$grade <- NULL
a
#   number    name Age
# 1      1   Akash  21
# 2      2    Vyom  30
# 3      3  Kunwar  23
# 4      4 Prakash  22

# Deleting rows of a dataframe
a <- a[-4,] # Deleting 4th row of column
a
#   number   name Age
# 1      1  Akash  21
# 2      2   Vyom  30
# 3      3 Kunwar  23