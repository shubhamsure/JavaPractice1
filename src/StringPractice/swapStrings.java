package StringPractice;

public class swapStrings {
    //swap 2 strings with each other without using a temp variable
    public static void main (String[]args){
        String a = "Hello";
        String b = "World";

        a=a+b; //HelloWorld
        b=a.substring(0,a.length()-b.length()); //Hello
        a=a.substring(b.length()); //World
        System.out.println(a+" "+b);

    }
}
