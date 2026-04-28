//Question - Leetcode(217 Easy)
//Here use HashSet,when set already contains a value and you try adding the same value again it returns false    

class Solution { 
    public  boolean  containsDuplicate(int[] nums) {
      Set<Integer>  count  = new HashSet<>();
      for(int  num  :  nums){
        if(!count.add(num)) return true;
      }
    return false;    
    }
}
