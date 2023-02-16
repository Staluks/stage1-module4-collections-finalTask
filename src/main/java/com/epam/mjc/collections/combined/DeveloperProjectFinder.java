package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Set<String>> me : projects.entrySet()){
            if(me.getValue().contains(developer)){
                result.add(me.getKey());
            }
        }
        result.sort(new ListComparator());
        return result;
    }
}
class ListComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2){
        if(o1 == null){
            return -1;
        }
        if(o2 == null){
            return 1;
        }
        if(o2.length()==o1.length()){
            return o2.compareTo(o1);
        }
        return o2.length()-o1.length();
    }
}
