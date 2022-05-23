package buoi7_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> dssp = new HashMap<String, Integer>();
        
        dssp.put("iPhone11", 13);
        dssp.put("iPhone12", 17);
        dssp.put("iPhone13", 30);
        dssp.put("SamSung", 10);
        
        System.out.println(dssp.get("iPhone11"));
        
        Set<String> keys = dssp.keySet();
        
        for (String key: keys) {
            Integer i = dssp.get(key);
            System.out.println(key + ":" +i);
        }
    }
}
