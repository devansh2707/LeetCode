class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int num2=-1;
        int c1=0;
        int c2=0;
        int count1=0;
        int count2=0;
        ArrayList<Integer>list=new ArrayList<Integer>();
        ArrayList<Integer>list1=new ArrayList<>();

        for(int val:nums){
            if(val==num1)
                c1++;
            else if(val==num2)
                c2++;
            else if(c1==0){
                num1=val;
                c1=1;
            }
            else if(c2 == 0){
                num2 = val;
                c2 = 1;
            }
            else{
                c1--;
                c2--;
            }
                
        }
        for(int i=0;i<nums.length;i++){
            
            if(num1==nums[i]){
                count1++;
                
            }
        }
      if(count1>((nums.length)/3) && num1!=num2){
            list.add(num1);
            }
      
        
        for(int i=0;i<nums.length;i++){
            
            if(num2==nums[i]){
                count2++;
                
            }
        }
        
        if(count2>((nums.length)/3) && num1 != num2){
            list.add(num2);
            }
        
    if(num1==num2){
        list1.add(-1);
        return list1;
    }

            
        return list;
        
        
    }
}