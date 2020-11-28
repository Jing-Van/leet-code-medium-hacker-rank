class Solution {
public:
    int numSplits(string s) {
        int ul = 0, ur = 0, count = 0;
        vector<int> l(s.size(), 0), r(s.size(), 0);
        for (int i = 0, j = s.size() - 1; i < s.size(); i++, j--) {
            ul |= 1 << (int)(s[i] - 'a');
            ur |= 1 << (int)(s[j] - 'a');
            //It returns the numbers of set bits in an integer (the number of ones in the binary             //representation of the integer
            l[i] = __builtin_popcount(ul);
            r[j] = __builtin_popcount(ur);
        }
        // if split by 0, then right end start form 1, 
        // if split by 1, then right end start form 2;
        for (int i = 1; i < s.size(); i++) 
            if (l[i - 1] == r[i]) count++;
        return count;
    }
};