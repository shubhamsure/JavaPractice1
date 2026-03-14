package arrayPractice;

public class missingNumber {
    public static void main (String []args){
        /*
        Given 2 integer arrays. one array has a number missing. Print the missing number
        */
       int a[]={1,2,3,4,5};
       int b[]={1,2,4,5};
       int sum = 0,sum1 = 0;
       for (int i=0;i<a.length;i++) {
        sum = sum +a[i];
       }
       for (int i=0;i<b.length;i++) {
        sum1 = sum1 +b[i];
       }
       int miss=sum-sum1;
       System.out.println(miss);

    }
    
}
