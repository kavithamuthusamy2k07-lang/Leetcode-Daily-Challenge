class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1=cost1,c2=cost2,c3=costBoth,n1=need1,n2=need2;
        long option1=n1*c1+n2*c2;//c1,c2
        long common=Math.min(n1,n2);
        long option2=common*c3+c1*(n1-common)+c2*(n2-common);//all c1,c2,cb
        long option3=c3*Math.max(n1,n2);//cb
        return Math.min(option1,Math.min(option2,option3));
    }
}