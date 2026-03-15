package basics;

public class largestOfThree {
    public static void main (String[]args){
        int a=100,b=200,c=300;
        int largest = a>b?a:b;
        largest = c>largest?c:largest;
        System.out.println(largest);
    }
}
