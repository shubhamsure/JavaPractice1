package arrayPractice;

public class smallestLargest {
    public static void main (String [] args){
        //Find the smallest and largest number from given integer array
        int a [] = {-10,24,-50,-88,987,988,0};
        int largest = a[0];
        int smallest = a[0];
        for (int i=1;i<a.length;i++) {
            if(a[i] > largest){
                largest=a[i];
            }
            else if(a[i] < smallest){
                smallest = a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
    
}
