
# Author: Huahua
class Solution:
  def canDistribute(self, nums: List[int], 
                    quantity: List[int]) -> bool:    
    cnts = list(Counter(nums).values())
    print(cnts)
    m = len(quantity)
    n = len(cnts)

    print(m,n)

    # [1, 1, 1, 1]
    # 1 4 
    # m=1 n=4;
    sums = [0] * (1 << m)
    # [0, 0]
    print(range(1<<m))
    range(0, 2)
    for mask in range(1 << m):
      for i in range(m):
        if mask & (1 << i): sums[mask] += quantity[i]
    
    # [0, 2]
    @lru_cache(None)
    def dp(mask: int, i: int) -> bool:
      if not mask: return True
      if i < 0: return False
      
      cur = mask
      while cur:
        if sums[cur] <= cnts[i] and dp(mask ^ cur, i - 1):
          return True
        cur = (cur - 1) & mask
      
      return dp(mask, i - 1)
    
    return dp((1 << m) - 1, n - 1)