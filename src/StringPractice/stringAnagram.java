package StringPractice;

import java.util.Arrays;

public class stringAnagram {
    public static void main (String [] args) {
        //we can make a different word from same letters of the string then its an anagram
        System.out.println(isAnagram("LISTEN","SILENT"));
    }
    public static boolean isAnagram(String s1, String s2) {
        char str1[] = s1.toCharArray();
        char str2[] = s2.toCharArray();

        int n1 = str1.length;
        int n2 = str2.length;
        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        int i;
        for (i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}
