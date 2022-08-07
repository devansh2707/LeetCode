class Solution {
    public int maxArea(int[] height) {
        
        int distance=0 ;
        int h=0;
        int first=0;
        int maxarea=Integer.MIN_VALUE;
        int last=height.length-1;
        while(first<last){
            distance =last-first;
            h=Math.min(height[last],height[first]);
            int temparea=distance * h;
            
            if(temparea>maxarea){
                maxarea=temparea;
                
            }
            if(height[first]<height[last]){
              first++;  
            }
            else{
                last--;
                
            }
            
        }
        return maxarea;
        
    }
}