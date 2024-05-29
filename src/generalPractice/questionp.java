package generalPractice;

import java.util.Arrays;

public class questionp {
    public static void main (String [] args){
        int a [] = {100,50,10,20,-5,30,40};
        int result [] = new int[a.length];
        /*
        Interate the array and compare the current element with LHS element and,
        1. replace the current element with -5 if the LHS element is less than current element
        2. replace the current element with -20 if the LHS element is greater than the current element
        3. If the element does not have any LHS element to compare with replace with -20
        OP: {-20,-20,-20,-5,-20,-5,-5}
         */
        for (int i=0;i<=a.length-1;i++){
            if(i==0){
                result[i]=-20;
            }
            else if(a[i-1] < a[i]){
                result[i]=-5;
            }
            else if(a[i-1] > a[i]){
                result[i]=-20;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
