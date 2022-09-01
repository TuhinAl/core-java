package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
	
	 public static List<String> findRepeatedDnaSequences(String s) {
	        int len = s.length();
	        Map<String, Integer> map = new HashMap<>();
	        List<String> result = new ArrayList<>();
	        int i = 0;
	        while(i < len-9) {
	        	String subString = s.substring(i,i+10);
	        	if(!map.containsKey(subString)) {
	        		map.put(subString, 1);
	        	}else {
	        		map.put(subString, map.get(subString)+1);
	        	}
	        	i++;
	        }
	        
	        Set<Map.Entry<String, Integer>> mapToList = map.entrySet();
	        mapToList.stream().filter(value -> value.getValue() >= 1)
	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        
	        mapToList.stream().filter(p -> p.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	        for(Map.Entry<String, Integer> maps : mapToList) {
	        	if(maps.getValue() > 1) {
	        		result.add(maps.getKey());
	        	}
	        }
	        System.out.println(result);
	     return result;   
	    }
	 
	 public static void main(String[] args) {
		Solution.findRepeatedDnaSequences("AAAAAAAAAAA");
	}
}
