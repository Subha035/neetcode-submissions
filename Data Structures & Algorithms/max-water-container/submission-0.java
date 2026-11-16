class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxWater = Integer.MIN_VALUE;

        while(l < r){
            int w = r - l;
            int currentWater = Math.min(heights[l], heights[r]) * w;

            maxWater = Math.max(currentWater , maxWater);

            if(heights[l] > heights[r]){
                r--;
            } else{
                l++;
            }
        }
        return maxWater;
    }
}
