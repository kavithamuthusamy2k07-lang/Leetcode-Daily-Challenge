class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            boolean ans=false;
            for(int j:nums){
                if(j==i){
                    ans=true;
                    break;
                }
            }
            if(!ans)l.add(i);
        }
        return l;
    }
}
