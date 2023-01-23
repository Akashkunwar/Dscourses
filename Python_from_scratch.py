# Smallest element in array
def minimum(array):
  try:
    fst = array[0]
    for x in array:
      if x<fst:
        fst = x
    return fst
  except:
    print('Invalid input or empty array while minimum')

# Largest element in array
def maximum(array):
  try:
    fst = array[0]
    for x in array:
      if x>fst:
        fst = x
    return fst
  except:
    print('Invalid input or empty array while maximum')

# Append element in list
def append(array, element):
  try:
    array = array + [element]
    return array
  except:
    print('Invalid input while append')

# Insert an element at specific position in an array
# First give list then element which is to be inserted then the position on which data is about to inserted
def insert(array, element, position):
  try:
    inserted = []
    pos = 0
    if length(array)==position:
      inserted = append(array, element)
      return inserted
    else:
      for x in array:
        if pos != position:
          inserted = append(inserted, x)
          pos +=1
        else:
          inserted = append(inserted, element)
          inserted = append(inserted, x)
          pos +=1
      return inserted
  except:
    print('invalid input while insert')

# Remove elements from the list
def remove(array, element):
  try:
    removed = []
    for x in array:
      if x != element:
        removed = append(removed,x)
    return removed
  except:
    print('Invalid input while removing element')

# Remove element from array by index
def pop(array, index):
  try:
    num = 0
    popped = []
    for x in array:
      if num!=index:
        popped = append(popped,x)
        num += 1
      else:
        num += 1
        continue
    return popped
  except:
    print('Invalid input while pop via index')

# Reverse the array
def reverse(array):
  try:
    rev = []
    for x in range(length(array)):
      rev = append(rev,array[-1])
      array = array[0:-1]
    return rev
  except:
    print('Invalid input while reverse')

# Find index of first specific element in an array
def index(array, element):
  try:
    num = 0
    for x in array:
      if x == element:
        return num
        break
      else:
        num += 1
  except:
    print('Invalid input while finding index')

# Find length of an array
def length(array):
  try:
    num = 0
    for x in array:
      num +=1
    return num
  except:
    print("Invalid inpur while finding length") 

# Sort an array in ascending order
def sort_inc(array):
  try:
    copy = array.copy()
    sorted = []
    while len(copy)>0:
      sorted = append(sorted, minimum(copy))
      copy = remove(copy, minimum(copy))
    return sorted
  except:
    print('Invalid input while sort_inc! Please input an array')

# Sort an array in descending order
def sort_des(array):
  try:
    copy = array.copy()
    sorted = []
    while len(copy)>0:
      sorted = append(sorted, maximum(copy))
      copy = remove(copy, maximum(copy))
    return sorted
  except:
    print('Invalid input while short_des! Please input an array')

# Combine element of 2 array in one
def extend(array1, array2):
  for x in array2:
    array1 = append(array1,x)
  return array1

# Sum of all elements in an array
def add(array):
  try:
    sum = 0
    for x in array:
      sum += x
    return sum
  except:
    print('Invalid input while add! Please input an array')

# Multiply all elements of an array
def product(array):
  try:
    mul = 1
    for x in array:
      mul = x*mul
    return mul
  except:
    print('Invalid input while product! Please input an array')

# Average of and array
def avg_array(array):
  try:
    sum = add(array)
    len = length(array)
    num = sum/len
    return num
  except:
    print('Invalid input while avg_array!')

f = open('hotel_data,txt', 'w')