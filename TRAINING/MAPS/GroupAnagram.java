package TRAINING.MAPS;
import java.util.*;
class GroupAnagram {
    public ArrayList<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(String s:strs )
        {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);  // "aet"
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values()); //map.values is already an arraylist ( so arraylist of arraylist  )
    }
}