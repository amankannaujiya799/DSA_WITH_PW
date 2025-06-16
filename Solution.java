public class Solution {
    public int majorityElement(int[] arr) {
        int a = 0, m = 0;
        for (int x : arr) {
            if (a == 0) {
                m = x;
                a = 1;
            } else {
                a += m == x ? 1 : -1;
            }
        }
        return m;
    }
} {
    
}
