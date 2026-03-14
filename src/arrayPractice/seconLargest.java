package arrayPractice;

import java.util.Arrays;

public class seconLargest {
    public static void main (String[]args){
        //find second largest and second smallest element from given integer array
        int a[]={10,24,-50,-88,987,988,0};
        int n=a.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("smallest"+a[0]);
        System.out.println("largest"+a[n-1]);

    }

    
}
