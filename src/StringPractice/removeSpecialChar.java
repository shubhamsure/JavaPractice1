package StringPractice;

public class removeSpecialChar {
    //Given a string remove special character from it
    public static void main (String [] args){
        String s="abcdABCD123456!@#$%^";
        s=s.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
