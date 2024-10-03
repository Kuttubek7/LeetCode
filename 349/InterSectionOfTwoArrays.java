// Leetcode. 349. Intersection of Two Arrays
import java.util.HashSet;

class InterSectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> has1 = new HashSet<Integer>();
        for(int k:nums1) {
            has1.add(k);
        }
        HashSet<Integer> has2 = new HashSet<Integer>();
        for(int k:nums2) {
            if(has1.contains(k)){
                has2.add(k);
            }
        }
        int result[] = new int[has2.size()];
        int j = 0;
        for(int x : has2) {
            result[j] = x;
            j++;
        }
        return result;
    }
}