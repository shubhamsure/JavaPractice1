package StringPractice;


public class stringRevWords {
    public static void main (String [] args){
         //"i.like.this.program.very.much";
        //expected op: much.very.program.this.like.i
        String op=revWords("i.like.this.program.very.much");
        System.out.println(op);
    }
    public static String revWords(String s) {
        String words[] = s.split("[.]");
        String revSen = "";
        for (int i = words.length - 1; i >= 0; i--) {
            revSen = revSen + "." + words[i];
        }
        return revSen;
    }
}

