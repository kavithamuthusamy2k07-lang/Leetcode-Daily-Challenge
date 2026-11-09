class Solution {
    public int maxNumberOfBalloons(String text) {
    int fre[]=new int[26];
    for(char ch:text.toCharArray()){
        fre[ch-'a']++;
    }
    int b=fre['b'-'a'];
    int a=fre['a'-'a'];
    int l=fre['l'-'a']/2;
    int o=fre['o'-'a']/2;
    int n=fre['n'-'a'];

       
    return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}
