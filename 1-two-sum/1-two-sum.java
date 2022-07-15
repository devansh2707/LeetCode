class Solution {
    public int[] twoSum(int[] nums, int target) {
       // [3,2,4] 6
       int fi=0;
        int si=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int first=nums[i];      //3
            int second=target-first;        //3
            fi=i;
            for(int j=0;j<nums.length;j++){
               if(i==j)
                   continue;
                if(second==nums[j]){
                    
                    si=j;
                    flag=true;
                    break;
                    
                }
                
            }
            if(flag){
                break;
            }
            
        }
        int [] arr=new int[2];
        arr[0]=fi;
        arr[1]=si;
        return arr;
        
        }
    }

