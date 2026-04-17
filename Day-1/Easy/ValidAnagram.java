//Question - Leetcode(242 Easy)
class Solution {
    public boolean isAnagram(String s, String t) {
       int [] nums = new int[26];
       for(char ch : s.toCharArray()){
        nums[ch-'a']++;
       } 
       for(char ch : t.toCharArray()){
        nums[ch-'a']--;
       }
    return Arrays.stream(nums).allMatch(n->n==0);
    }
}
