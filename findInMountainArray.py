# """
# This is MountainArray's API interface.
# You should not implement it, or speculate about its implementation
# """
#class MountainArray:
#    def get(self, index: int) -> int:
#    def length(self) -> int:

# Input: array = [1,2,3,4,5,3,1], target = 3
# Output: 2
# Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

class Solution:
  def findInMountainArray(self, target: int, arr: 'MountainArray') -> int:
    def binary_search(l, r, cond):
      while l < r:
        m = l + (r - l) // 2
        if cond(m): r = m
        else: l = m + 1
      return l
    
    n = arr.length()    
    p = binary_search(0, n - 1, lambda i: arr.get(i) > arr.get(i + 1))
    l = binary_search(0, p, lambda i: arr.get(i) >= target)
    if arr.get(l) == target: return l
    r = binary_search(p, n - 1, lambda i: arr.get(i) <= target)
    if arr.get(r) == target: return r
    return -1