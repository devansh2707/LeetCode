//using hashset O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        int c=0;
        Set<Integer>hashset=new HashSet<>(); 
        for(int val:nums){
            hashset.add(val);
        }
        int long_streak=0;
        for(int num:nums){
            if(!hashset.contains(num-1)){
                int curr_num=num;
                int curr_streak=1;
                while(hashset.contains(curr_num+1)){
                    curr_num+=1;
                    curr_streak+=1;
                }
                long_streak=Math.max(long_streak,curr_streak);
            }
            
        }
        return long_streak;
        
                
    }
}