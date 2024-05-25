package StringPractice;

public class stringPalindrome {
    public static void main (String [] args){
        //Q1: abba => true , abbgh => false
        boolean status = false;
        String s = "abba";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev)){
            status = true;
        }
        System.out.println(status);
    }
}
