1. 
num_full_pages, leftover_probs = divmod(num_probs_in_chapter, k)
2. 
len_list = [1, 5, 9, 'x','y','z', 20, 25]
print ("Number of items in the list = ", len(len_list))
3. built in 
 lists, tuples, sets, and dictionaries

4. 
 array module or a NumPy package.

import array as arr
import numpy as np
array module requires all array elements to be of the same type. Moreover, to create an array, you'll need to specify a value type. In the code below, the "i" signifies that all elements in array_1 are integers:

array_1 = arr.array("i", [3, 6, 9, 12])
print(array_1)
print(type(array_1))
array('i', [3, 6, 9, 12])
<class 'array.array'>
NumPy arrays support different data types. To create a NumPy array,

array = np.array([3, 6, 9, 12])
division = array/3
print(division)
print (type(division))

5. len applies to all built in data structures

6. 
x = range(3, 6)

for n in x:
  print(n)

	3
	4
	5

7. 
 
print(ord('5'))    # 53
print(ord('A'))    # 65
print(ord('$'))    # 36
The ord() function returns an integer representing the Unicode character.
