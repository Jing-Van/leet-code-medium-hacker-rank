# Complete the stones function below.
def stones(n, a, b):
    return ' '.join(map(str,sorted({x*a+(n-1-x)*b for x in xrange(n)})))


# 2   3   4
# 3 0   1 2 0   2 1 0   3 0 0
# Expected Output

# 2 3 4
# 30 120 210 300