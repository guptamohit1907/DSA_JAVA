package com.leetcode.java.dsacode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args) {

    }

    public String destCity(List<List<String>> paths) {
        Set<String> hasOutgoing = new HashSet();
        for (int i = 0; i < paths.size(); i++) {
            hasOutgoing.add(paths.get(i).get(0));
        }
        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }
        return "";
    }

//    public String destCity(List<List<String>> paths) {
//        HashSet<String> cities = new HashSet<>();
//        HashMap<String, String> mp = new HashMap<>();
//
//        for (List< String> path : paths){
//            cities.add(path.get(0));
//            cities.add(path.get(1));
//            mp.put(path.get(0),path.get(1));
//        }
//        String dest = "";
//        for (String city : cities){
//            if (!mp.containsKey(city)){
//                dest = city;
//                break;
//            }
//        }
//        return dest;
//    }
//    public String destCity(List<List<String>> paths) {
//        for (int i = 0; i < paths.size(); i++) {
//            String candidate = paths.get(i).get(1);
//            boolean good = true;
//            for (int j = 0; j < paths.size(); j++) {
//                if (paths.get(j).get(0).equals(candidate)) {
//                    good = false;
//                    break;
//                }
//            }
//            if (good) {
//                return candidate;
//            }
//        }
//        return "";
//    }
}
