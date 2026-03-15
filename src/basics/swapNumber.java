package basics;

public class swapNumber {
    //Given 2 integer variables swap them without using temp variable.
    public static void main (String[]args){
        int a=10,b=20;
        a=a+b;//30
        b=a-b;//30-20 b=10
        a=a-b;
        System.out.println(a+" "+b);
    }
}
