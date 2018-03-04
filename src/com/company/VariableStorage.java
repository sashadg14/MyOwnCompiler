package com.company;

import java.util.*;

/**
 * Created by Alex on 03.02.2018.
 */
public class VariableStorage{
    private int depth=-1;
    private List<LinkedHashMap<String,String>> hashMap = new LinkedList<>();
    private LinkedHashMap<String,String> totalHashMap =new LinkedHashMap<>();
    void increm(){
        depth++;
        hashMap.add(new LinkedHashMap<String, String>());
    }
    void decrem(){
        depth--;
        for(String s: hashMap.get(depth+1).keySet())
            totalHashMap.remove(s);
        hashMap.remove(depth+1).clear();
    }

    public void put(String key, String value) {
        hashMap.get(depth).put(key,value);
        totalHashMap.put(key,value);
    }
    public String get(String key) {
        return totalHashMap.get(key);
    }
}
