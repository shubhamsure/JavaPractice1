package StringPractice;

import java.util.ArrayList;
import java.util.List;

public class duplicateCharacter {
    public static void main (String [] args){
        //Q1.find out how any times a character is repeated in the given string
        // eg: aaabbbc , a is repeated 3 times
        System.out.println(charCount("Java programming java oops",'a'));
        //Q2. Count words in given string
        //eg: Welcome to java, op: 3
        System.out.println(wordCount("Welcome to java"));
    }
    public static int charCount(String s, char ch){
        String c = Character.toString(ch);
        int count =s.length();
        int co = s.replace(c,"").length();
        int result = count-co;
        return result;
    }
    public static int wordCount(String s){
        int count =1;
        for (int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != ' ' && s.charAt(i+1) == ' '){
                count++;
            }
        }
        return count;
    }
}
