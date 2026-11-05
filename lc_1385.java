class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
           int x=0;
           int n=arr1.length,m=arr2.length;
           for(int i=0;i<n;i++){
            boolean found=true;
            for(int j=0;j<m;j++){
                 if(Math.abs(arr1[i]-arr2[j])<=d){
                    found=false;
                    break;
                 }
            }
            if(found){
            x++;
            }

           }
           return x;
    }
}