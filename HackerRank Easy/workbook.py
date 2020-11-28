#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the workbook function below.
# all passed
def workbook(n, k, arr):
    '''Return count of "special numbers" -> same problem number as page number.

    n: total chapters
    k: max problems per page
    a[i] total problems in chapter i+1 '''

    num_special=0
    cur_page=1

    for i in range(len(arr)):

        num_probs_in_chapter=arr[i]
        num_full_pages, leftover_probs = divmod(num_probs_in_chapter, k)
        #print('num_full_pages, leftover_probs', num_full_pages, leftover_probs)

        total_pages = num_full_pages + ( 1 if leftover_probs else 0 )
        # range(3,6) 3,4,5 thus +1
        problems_in_chapter=iter(range(1, arr[i]+1))

        for _ in range(total_pages):
            probs_on_page = [next(problems_in_chapter, None) for _ in range(k)]    
            if cur_page in probs_on_page:
                #print('found %d in %s' % (cur_page, str(probs_on_page)) )
                num_special+=1
            cur_page+=1        
    return num_special


'''

[1, 2, 3]
[4, None, None]
[1, 2, None]
[1, 2, 3]
[4, 5, 6]
[1, None, None]
[1, 2, 3]
[4, 5, 6]
[7, 8, 9]
[10, None, None]

'''
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = int(nk[0])

    k = int(nk[1])

    arr = list(map(int, input().rstrip().split()))

    result = workbook(n, k, arr)

    fptr.write(str(result) + '\n')

    fptr.close()
