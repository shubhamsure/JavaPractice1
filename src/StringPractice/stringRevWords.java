package StringPractice;


public class stringRevWords {
    public static void main (String [] args){
         //Q1: "i.like.this.program.very.much";
        //expected op: much.very.program.this.like.i
        String op=revWords("i.like.this.program.very.much");
        System.out.println(op);
        //Q2: "Welcome to java"
        //op: "emocleW ot avaj"
        String op1=revWords1("Welcome to java");
        System.out.println(op1);
    }
    public static String revWords(String s) {
        String words[] = s.split("[.]");
        String revSen = "";
        for (int i = words.length - 1; i >= 0; i--) {
            revSen = revSen + "." + words[i];
        }
        return revSen;
    }
    public static String revWords1(String s){
        String revSen = "";
        String words[]=s.split(" ");
        for (String word :words){
            String revWord = "";
            for (int i=word.length()-1;i>=0;i--){
                revWord = revWord + word.charAt(i);
            }
            revSen = revSen + revWord + " ";
        }
        return revSen;
    }
}

