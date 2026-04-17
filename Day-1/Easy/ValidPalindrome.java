//Question - Leetcode(125 Easy)
//skip all the characters in the start and end that are not alphanumeric(letter or digits) and compare characters at start and end
class Solution {
    public boolean isPalindrome(String s) {
    if(s.length()<2) return true;
    int start = 0;
    int end = s.length()-1;
    while(start<end){
      while(start<end && !Character.isLetterOrDigit(s.charAt(start))) start++;
      while(start<end && !Character.isLetterOrDigit(s.charAt(end))) end--;
      if(Character.toLowerCase(s.charAt(start))==Character.toLowerCase(s.charAt(end))){
           start++;
           end--;
           continue;
      }else{
        return false;
      }
    }
    return true;

    }
}
