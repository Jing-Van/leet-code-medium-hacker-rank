#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the sockMerchant function below.
def sockMerchant(n, ar):
    
    pairs = 0
    color = set()
    for i in range(len(ar)):
        if ar[i] not in color:
            color.add(ar[i])
        else:
            pairs += 1 
            color.remove(ar[i])
    return pears
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
