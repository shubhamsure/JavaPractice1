package basics;

public class countEvenOddDgts {
    //count number of even and odd digits in the given number
    public static void main (String []args){
        int num = 123456;
        int eCount=0,oCount=0;
        while(num!=0){
            int cNum=num%10;
            num=num/10;
            if(cNum%2==0){
                eCount++;
            }
            else{
                oCount++;
            }
        }
        System.out.println(eCount+" "+oCount);
    }
}
