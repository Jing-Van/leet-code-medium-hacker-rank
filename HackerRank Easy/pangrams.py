'''
Counter({' ': 9, 'e': 7, 'r': 4, 't': 4, 'p': 3, 'o': 3, 'u': 3, 'i': 3, 'l': 2, 'y': 2, 'd': 2, 'n': 2, 'W': 1, 'm': 1, 'j': 1, 'g': 1, 'a': 1, 'q': 1, 'v': 1, 'b': 1, 'c': 1, 'k': 1, 's': 1, 'f': 1, 'h': 1, 'x': 1, 'z': 1})
'''

#!/bin/python3

import math
import os
import random
import re
import sys
from collections import Counter
# Complete the pangrams function below.
def pangrams(s):
	//    set
    l=len(Counter(s.lower()))
    print(l)
    return ("pangram" if l == 27 else "not pangram")
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = pangrams(s)

    fptr.write(result + '\n')

    fptr.close()

