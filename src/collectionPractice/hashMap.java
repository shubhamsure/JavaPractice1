package collectionPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main (String [] args){
        HashMap <String,String> map = new HashMap<String,String>();
        map.put("A","Apple");
        map.put("B","Ball");
        map.put("C","CAT");
        map.put("D","DOG");
        map.put("E","Elephant");
        Set<Map.Entry<String,String>> setView = map.entrySet();
        for (Map.Entry<String,String> val: setView){
            System.out.println(val.getKey()+"="+val.getValue());
        }
    }
}
