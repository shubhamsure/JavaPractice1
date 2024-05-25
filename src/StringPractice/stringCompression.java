package StringPractice;

public class stringCompression {
    public static void main (String [] args){
        //Q1: AAABBBBCC => A3B4C2
        System.out.println(compression("AAABBBBCC"));

    }
    public  static String compression(String s){
        StringBuffer sb = new StringBuffer();
        int length = s.length();
        int count = 1;
        for (int i=0; i<length;i++){
            if(i==length-1) {
                sb.append(s.charAt(i) + "" + count);
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i)+""+count);
                count=1;
            }
        }
        String result=sb.toString();

        return result;
    }

}
