//Question - Leetcode(169 Easy)
//Ath the End the element with frequency = n/ 2 will be left as candidate
class Solution {
    public int majorityElement(int[] nums) {    
     int count = 0;
     int candidate = 0;
     for(int num : nums){
        if(count == 0) candidate = num;

        if(num == candidate) count++;
        else count--;
     }
    return candidate; 
    }
}
