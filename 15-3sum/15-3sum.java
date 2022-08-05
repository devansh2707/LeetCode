class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++){
            
            if(i==0 || nums[i-1]!=nums[i])
                twoSums(i+1,nums.length-1,nums,0-nums[i]);
        }
        return ans;
    }
    void twoSums(int i , int j , int []nums , int target){
        
        
        int a=nums[i-1];
        while(i<j){
            
            if(nums[i]+nums[j]>target){
                j--;
            }
            
            else if(nums[i]+nums[j]<target){
                i++;
            }
            else{
                List<Integer> list=new ArrayList<Integer>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(a);
                ans.add(list);
                while(i<j && nums[i]==nums[i+1])
                    i++;
                
                while(i<j && nums[j]==nums[j-1])
                    j--;
                i++;j--;
            }
        }
        
    }
}