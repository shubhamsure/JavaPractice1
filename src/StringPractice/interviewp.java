package StringPractice;

import java.util.ArrayList;
import java.util.List;

public class interviewp {
    public static void main (String [] args){
//        StringBuffer sb = new StringBuffer("abba");
//        StringBuffer rev = new StringBuffer();
//        rev= sb.reverse();
//        if(sb.equals(rev)){
//            System.out.println("Givern sting is a palindrome");
//        }
//        else{
//            System.out.println("Not a palindrome");
//        }
        int num [] = {3,4,2,1,5};// => op :3
        int max=num[0];
        int secMax=num[0];
        for (int i=0;i<=num.length-1;i++){
            if(num[i]>max){
                secMax=max;
                max=num[i];
            }
            if(num[i] > secMax && num[i]!=max){
                secMax=num[i];
            }
        }
        System.out.println(max);
//        for (int j=0;j<=num.length-1;j++){
//            if(num[j] > secMax && num[j]!=max){
//                secMax=num[j];
//            }
//        }
        System.out.println(secMax);
    }
}
