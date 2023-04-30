package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static String[] mergedStringArray(String[] names1, String[] names2){
        ArrayList<String> name12 = new ArrayList<String>();

        for (String ele : names1){
            if (!name12.contains(ele)){
                name12.add(ele);
            }
        }

        for (String ele : names2){
            if (!name12.contains(ele)){
                name12.add(ele);
            }
        }

//        String[] names3 = name12.parallelStream().toArray(String[]::new);
//        String[] myStringArray = {"hello", "hello", "moto"};
//        String[] filteredArray = new LinkedHashSet<String>(Arrays.asList(myStringArray))
//                .toArray(new String[0]);

        String[] names3 = new String[name12.size()];
        for (int i = 0; i < name12.size(); i++){
            names3[i] = name12.get(i);
        }
        return names3;
    }

    public static void main(String[] args) {
        String[] names1 = {"Ben","Kevin","Hart"};
        String[] names2 = {"Louise","Kevin","Dale"};
        System.out.println("Merged array: " + Arrays.toString(mergedStringArray(names1,names2)));
    }
}
