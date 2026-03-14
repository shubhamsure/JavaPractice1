package basics;

public class reverseNum {
    public static void main (String [] args){
        /*
        Reverse the given integer number
         */
        int rev = 0;
        int num = 12345;
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10; 
        }
        System.out.println(rev);
    }
    
}
