package StringPractice;

import java.util.Arrays;

public class longestCommonPrefix {
    public static void main (String [] args){
        String [] st = {"club","clap","clove"};
        //expected op: cl
        System.out.println(longestCommonPrefix(st));
    }
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        // Sort the array
        Arrays.sort(strs);

        // Get the first and last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        // Start comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }


        return result.toString();
    }
}
