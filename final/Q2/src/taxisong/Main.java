package taxisong;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }//end of main

    public static List<List<String>> anagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }//end of anagrams
}//end of Main
