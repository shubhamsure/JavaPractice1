package StringPractice;

public class dupCharacters {
    public static void main(String [] args){
        //Q3: Print duplicate characters given string
        //eg: Great responsibility op: r,e,t,s,i,
        String s = "Great responsibility";
        char sb[] = s.toCharArray();
        for (int i=0; i< sb.length; i++){
            int count =1;
            for (int j=i+1; j<sb.length; j++){
                if(sb[i]==sb[j] && sb[i]!=' '){
                    count++;
                    sb[j]='0';
                }
        }
            if (count >1 && sb[i]!='0'){
                System.out.print(sb[i]);                }
        }
    }
}
