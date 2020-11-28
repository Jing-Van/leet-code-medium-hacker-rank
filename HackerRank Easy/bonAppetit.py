#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the bonAppetit function below.
def bonAppetit(bill, k, b):

    should_have = round((sum(bill) - bill[k])/2)
    diff = b - should_have
    print(diff)
    if (not diff):
        return "Bon Appetit"
    else:
        return diff
    
if __name__ == '__main__':
    nk = input().rstrip().split()

    n = int(nk[0])

    k = int(nk[1])

    bill = list(map(int, input().rstrip().split()))

    b = int(input().strip())

    bonAppetit(bill, k, b)
