class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
       for(int i=1;i<=nums.length-1;i++){
         if(nums[i]>max){
            max=nums[i];
        }
       }
       int c=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==max){
            continue;
        }
           while(nums[i]!=max){
            nums[i]++;
            c++;
            //c+=max-nums[i];
            
        }
       }
       return c;
    }
}