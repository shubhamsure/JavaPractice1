package basics;

public class fibbonacciSeries {
    public static void main (String [] args){
        //print fibbonacci series until 10
        int a=0;
        int b=1;
        int next;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<10;i++){
            next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
    
}
