# Assigning variables
aa = "hello"
aa

bb <- "hye" #Most prefered
bb

cc <<- "halo"
cc

"hola" -> dd
dd

"Haya" ->> ee
ee

# integer is decleared by putting capital L at end of number
a <- 10L
typeof(a)

# double
b <- 12.43
typeof(b)

# character
c <- "kunwar"
typeof(c)

# logical
d <- FALSE
typeof(d)

# complex
e <- 4 + 9i
typeof(e)

temp <- "hello"

# To show all the variable till now
ls()
# "a" "b" "c" "d" "e" "temp"

# Removing variable
rm(temp)

# show list
ls()
# "a" "b" "c" "d" "e"
