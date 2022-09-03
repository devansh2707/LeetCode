class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length*2;
        int [] ans = new int [size] ;
        
        
        for(int i =0 ;i<nums.length ; i++ ){
            
                ans[i]=nums[i];
                ans[i+nums.length]=nums[i];
        }
                        
      
        return ans;
        
    }
}


// 1 2 3       i=2     length = 3
    
    
    
//     ans : 1 2 3