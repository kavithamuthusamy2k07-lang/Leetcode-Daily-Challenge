package Strings;
import java.util.*;
public class LongestVowel {
    public static void main(String sae[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int max=0,count=0;
        sc.close();
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        max=Math.max(max,count);
        for(int i=k;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(max,count);
            if(max==k){
             System.out.print(max);
             return;
            }
        }
        System.out.print(max);
       
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='I'||c=='O'||c=='U'||c=='E';
    }
}
