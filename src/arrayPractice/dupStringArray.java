package arrayPractice;

import java.util.HashSet;
import java.util.Set;

public class dupStringArray {
    /*
    Given a string array find duplicate elements in it
     */
    public static void main (String [] args){
        String names []={"Java","Javascript","Ruby","C","Python","Java"};
        Set <String> s=new HashSet<String>();
        for(String name:names){
            if(s.add(name)==false){
                System.out.println(name);
            }
        }
    }
    
}
