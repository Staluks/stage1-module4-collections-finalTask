package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> karte = new HashMap<>();
        for(Map.Entry<String, Integer> me : sourceMap.entrySet()){
           int k = me.getKey().length();
            Set<String> list = new HashSet<>();
            for(Map.Entry<String, Integer> keyList : sourceMap.entrySet()){
                if(keyList.getKey().length() == k){
                    list.add(keyList.getKey());
                }
            }
            karte.put(k, list);
        }
        return karte;
    }
}
