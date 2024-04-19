package Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>(); //key is sorted string, value is list of strings
        for(String s:strs)
        {
            char a[]= s.toCharArray(); //convert string to char array
            Arrays.sort(a); //sort the char array
            String sorted = new String(a); //convert char array back to string
            if(!map.containsKey(sorted)) //if sorted string is not present in map, add it
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s); //add the original string to the list of strings corresponding to the sorted string
        }
        List<List<String>> gpAnagrams = new ArrayList<>(map.values()); //return the list of lists of strings
        return gpAnagrams;
    }
}