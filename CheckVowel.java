package Strings;
import java.util.*;
public class CheckVowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                System.out.println("yes");
                break;
            }
            else{
                System.out.println("No");
            }
        }
         sc.close();
        
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}
