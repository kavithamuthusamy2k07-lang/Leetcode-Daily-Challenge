class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];//ex ; 1,2,3->1,2,2->1,1,2->1,1,1;
        int n=nums.length;//(1-1)+(2-1)+(3-1) (or) (1+2+3)-(3*1);
        int sum=0;
        for(int i=0;i<n;i++){//sum of the minimum elements;
            min=Math.min(min,nums[i]);
            sum+=nums[i];
        }
        return sum-(min*n);//decrease the greatest ele by min until it equal
    }
}
/*Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.

In one move, you can increment n - 1 elements of the array by 1.

 

Example 1:

Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]*/
