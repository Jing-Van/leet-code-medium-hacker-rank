11. 
return result.toArray(new String[0]);

1. 
List<Integer> list =new ArrayList<>();

list.stream().mapToInt(i->i).toArray();
list.size();

String s;
s.length();
int[] arr;
arr.length;

2. 
s.charAt(i)==t.charAt(j)

3. ShiftArray
	public static int insertionSort(int[] arr)
	{
	    int totalShifts = 0;
	    int nSorted = 1; // the first n items are sorted
	    int n = arr.length; // total number of items in the array

	    for (int i = 1; i < n; ++i) { 
	        int key = arr[i]; 
	        int j = i - 1; 

	        /* Move elements of arr[0..i-1], that are 
	           greater than key, to one position ahead 
	           of their current position */
	        while (j >= 0 && arr[j] > key) { 
	            arr[j + 1] = arr[j]; 
	            j = j - 1; 
	            totalShifts++;
	        } 
	        arr[j + 1] = key;
	        System.out.println(arr[j+1]); 
	    } 
	    return totalShifts;
	}


4. led by example
show others how it works with example worked out

5. HACKERRANK pass rates trick
        // all passed after changed to -1;
        return (d== Integer.MAX_VALUE) ? -1 : minDistance;
// leetcode
6. python has integer round issue, java no problem

7. C++ size() for vector
vector<int> ans(cases.size());

8. 
Polymorphism could be static and dynamic both. 
Method Overloading is static polymorphism while,
Method overriding is dynamic polymorphism.

9. subString (begin, end) end won't be included

    private static String reverse (String s)
    {
        if (s.length() > 0)
            // included are 
            //                           (i+1, len-i-1)
            // i selected based i, 
            return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
        else
            return "";
    }

10. odd number length
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];


    }

11. 

	public static boolean isValidPalindrome(String str) {
		int len = str.length();

		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}

		return true;

	}    



12. 2nd way if odd
        if ((s.length() & 1) == 1)
            return -1;
        
13. 
Long.toBinaryString(n);
Long.parseLong(res, 2);        

14. 
String[] unsorted) {
        List<String> myStringList = Arrays.asList(unsorted);