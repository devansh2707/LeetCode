class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int []left=new int [nums.length+1];
        int []right=new int[nums.length+1];
        int [] ans=new int [nums.length];
        left[0]=1;
        right[right.length-1]=1;
        
        ans[nums.length-1]=left[nums.length-2];
        right[nums.length-1]=1;
        for(int i =1;i<=left.length-1 ;i++){
            
            left[i]=nums[i-1]*left[i-1];              //left array fill
        }
        
        
        for(int j=right.length-2;j>=0;j--){
            right[j]=nums[j]*right[j+1];            // right array fill
        }
        
        
        
        for(int i=0;i<=ans.length-1;i++){
            
            ans[i]=left[i] * right[i+1];
            
        }
        
        
        
        return ans;
        
    }
}