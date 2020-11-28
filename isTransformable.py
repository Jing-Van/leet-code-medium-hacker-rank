# A double-ended queue, or deque, supports adding
# and removing elements from either end. The more
# commonly used stacks and queues are degenerate forms of deques,
# where the inputs and outputs are restricted to a single end.

class Solution:
  def isTransformable(self, s: str, t: str) -> bool:
    idx = defaultdict(deque)
    for i, c in enumerate(s):
      idx[int(c)].append(i)
    print(idx)
    # defaultdict(<class 'collections.deque'>, {8: deque([0]), 4: deque([1]),
    # 5: deque([2]), 3: deque([3]), 2: deque([4])})
    for c in t:
      d = int(c)
      if not idx[d]: return False
      for i in range(d):
        if idx[i] and idx[i][0] < idx[d][0]: return False
      idx[d].popleft()
    return True