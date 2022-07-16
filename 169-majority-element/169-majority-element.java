class Solution {
    public int majorityElement(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int mid;
        int first=0;
        int last=nums.length-1;
        
        while(first < last){
            mid = (first + last) / 2 ;
            if(nums[mid] == nums[first]){
                 return nums[mid];
            }
            else {
                
                first++;
                
            }
            if(nums[mid] == nums[last]){
                return nums[mid];
            
            }
            else{
                last--;
            }
            
            
            
        }
        
      return 0;  
    }
    
}