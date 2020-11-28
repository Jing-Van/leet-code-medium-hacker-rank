# Complete the chocolateFeast function below.
# all passed

def chocolateFeast(n, c, m):
    # Compute Answer
    x = n//c
    answer = x
    while True:
        w = x//m
        r = x%m
        answer += w
        x = w + r
        if x < m: break
    
    return answer