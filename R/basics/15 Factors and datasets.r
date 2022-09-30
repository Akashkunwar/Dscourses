# Factors
a <- factor(c("pass","fail","inprocess")) # Creating factors
a
# [1] pass      fail      inprocess
# Levels: fail inprocess pass

class(a)
# Factor

a[4]<-"pass" # You can add only those elements which are in the factors
a

a[5]<-"no" # Can't add any elemert which is not in it
a

a[2] # Accessing elements in the factors

b<-c("a", "b", "c")
class(b)
# [1] "character"

b
# [1] "a" "b" "c"

b<-factor(b)
class(b)
# [1] "factor"

b
# [1] a b c
# Levels: a b c

is.factor(b)
# TRUE

a
# [1] pass      fail      inprocess pass      <NA>
# Levels: fail inprocess pass

is.ordered(a)
# FALSE

a <- as.ordered(a) # To order factor
# [1] pass      fail      inprocess pass      <NA>
# Levels: fail < inprocess < pass

is.ordered(a)
# TRUE

# Predifined Datasets in R
data()
View(cars)
class(cars)
