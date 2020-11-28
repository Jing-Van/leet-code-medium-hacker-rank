#!/bin/python3

import os
import sys


def LCS(a, b):
    na,nb=len(a),len(b)
    dp=[[0 for _ in range(nb)] for _ in range(na)]
    print("dp")
    print(dp)
    for i in range(na):
        for j in range(nb):
            if a[i]==b[j]: dp[i][j]=(dp[i-1][j-1] if i>=1 and j>=1 else 0)+1
            else: dp[i][j]=max(dp[i-1][j] if i>=1 else 0,dp[i][j-1] if j>=1 else 0)
    return dp

#
# Complete the tutzkiAndLcs function below.
#
# input
# aa
# baaa
# output
# dp
# [[0, 0, 0, 0], [0, 0, 0, 0]]
# dp
# [[0, 0, 0, 0], [0, 0, 0, 0]]
# dp=[[0 for _ in range(nb)] for _ in range(na)]

def tutzkiAndLcs(a, b):
    #
    # Write your code here.
    #

    na,nb=len(a),len(b)
    dp1=LCS(a,b)
    dp2=LCS(a[::-1],b[::-1])
    prev=dp1[-1][-1]
    res=set()
    print(prev)
    print(dp1)
    print(dp2)
    for i in range(0,len(a)+1):
        for j in range(len(b)):
            if (i,b[j]) in res: continue
            t=0
            if i!=0 and j!=0: t+=dp1[i-1][j-1]
            if i!=na and j!=nb-1: t+=dp2[na-1-i][nb-1-j-1]
            if t==prev: 
#                print(i,j)
                res.add((i,b[j]))
    return len(res)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    a = input()

    b = input()

    result = tutzkiAndLcs(a, b)

    fptr.write(str(result) + '\n')

    fptr.close()
