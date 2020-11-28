#!/bin/ruby

require 'json'
require 'stringio'

# Complete the fairRations function below.
def fairRations(b)

  my_hash = {}
  b.each_with_index do | e,i |
    my_hash[i] = e.odd?
  end

  # {0=>false, 1=>true, 2=>false, 3=>true, 4=>false}
  # 2 3 4 5 6
  # 1 3 true odd
  return "NO" if my_hash.values.count(true).odd?
  loaves = 0
  open = false 
  first = -1
  my_hash.each do | k,v |
    if v
    #
    #   1
    # true
    # 3
    # true  
      if open
        loaves += 2 * (k-first-1) + 2
        open = false
        first = -1
      else
        open = true
        first = k
      end
    end
  end
  return loaves
  # 4
end


fptr = File.open(ENV['OUTPUT_PATH'], 'w')

N = gets.to_i

B = gets.rstrip.split(' ').map(&:to_i)

result = fairRations B

fptr.write result
fptr.write "\n"

fptr.close()
