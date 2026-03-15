package StringPractice;

public class countCharOcc {
    //given a string count the number of a specific character occurence.
    public static void main (String[]args){
        String s="Java is a programming langauge";
        int total_count=s.length();
        int r_count = s.replace("a","").length();
        int f_count=total_count-r_count;
        System.out.println(f_count);


    }
}
