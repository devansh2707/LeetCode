class Solution {
    public int search(int[] A, int target) {
        
        int low=0;
        int high=A.length-1;
        
        while(low<=high){
            
            int mid=(low+high)/2;
        
            if(A[mid]==target){
                
                return mid;
                
                
            }
            else if(A[mid]<target){
                low=mid+1;
            }
            else if(A[mid]>target){
                high=mid-1;
            }
            
        }
        return -1;
        
    }
}