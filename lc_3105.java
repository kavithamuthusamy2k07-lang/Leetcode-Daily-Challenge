class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        //to find max len of sa
        int max=1,oriMax=1;
        int desc=1;
        int ascen=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){//2nd>1st //1<2
                desc=1;
                ascen++;
            }
            else if(nums[i]<nums[i-1]){//2nd<1st //1>2
              ascen=1;
              desc++;
            }
            else{
                ascen=1;
                desc=1;
            }
            max=Math.max(ascen,desc);
            oriMax=Math.max(max,oriMax);
        }
        return oriMax;
    }
}