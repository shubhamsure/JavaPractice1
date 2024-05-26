package StringPractice;

public class reverseStringVariations {
    public static void main (String[] args){
        //Q1: given a string reverse only alphabets the digits should stay at the same position
        //eg: a1b2c3d op: d1c2b3a
        String s = "a1b2c3d";
        StringBuffer dig = new StringBuffer();
        StringBuffer alp = new StringBuffer();
        char [] sc = s.toCharArray();
        for(int i=0;i<=sc.length-1;i++){
            if(Character.isDigit(sc[i])){
                dig.append(sc[i]);
            }
            else{
                alp.append(sc[i]);
            }
        }
        alp.reverse();
        StringBuffer result = new StringBuffer();
        int count=0;
        for(int i=1;i<=alp.length()-1;i=i+2 ){
            alp.insert(i,dig.charAt(count));
            count++;
        }
        System.out.println(alp);
    }

}
