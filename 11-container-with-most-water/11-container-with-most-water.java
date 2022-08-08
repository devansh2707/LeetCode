class Solution {
    public int maxArea(int[] height) {
        int Max=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
       
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int width=j-i;
            int temp=h * width;
            Max=Math.max(temp,Max);
            if(height[i]<height[j])
                i++;
            else
                j--;
            
            
        }
        
        return Max;
        
        
    }
}