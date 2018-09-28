package andi.com;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        languages.put("java", "object oriented");
        languages.put("python", "interpreted object oriented");
        languages.put("algo", "algorithm oriented");
        languages.put("basic", "for beginners");
        languages.put("sql", "databases");

        System.out.println(languages.get("java"));

        // only one key, cannot be changed, but value is overwritten
        languages.put("java", "overwritten");
        System.out.println(languages.get("java"));

        if(languages.containsKey("java"))
            System.out.println("java is already in map");
        else
            languages.put("java", "new value");

        System.out.println("===================================");

        // looping over map via keySet (as long as key is there ...)
        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
