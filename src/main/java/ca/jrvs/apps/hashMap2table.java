package ca.jrvs.apps;
/**
 * check if two hashmap tables are identical aka same key-value pairs
 */

import java.util.HashMap;

public class hashMap2table {

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        map1.put("1","a");
        map1.put("2", "b");
        map1.put("3", "c");
        
        map2.put("1","a");
        System.out.println("1) Table 1 = Table 2 =>"  + sameTableCheck(map1,map2));

        map2.put("2","b");
        map2.put("4","d");
        System.out.println("2) Table 1 = Table 2 =>"  + sameTableCheck(map1,map2));

        map2.put("3","c");
        map1.put("4","d");
        System.out.println("2) Table 1 = Table 2 =>"  + sameTableCheck(map1,map2));

    }

    private static boolean sameTableCheck(HashMap<String, String> map1, HashMap<String, String> map2) {
        if (map1.size() != map2.size() || map1.isEmpty() || map2.isEmpty())
            return false;

        return map1.entrySet().stream()
                .allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
    }
}
