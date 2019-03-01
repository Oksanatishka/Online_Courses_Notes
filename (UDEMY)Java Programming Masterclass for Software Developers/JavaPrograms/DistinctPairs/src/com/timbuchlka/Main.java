package com.timbuchlka;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1, 2, 3, 6, 7, 8, 9, 1), 10));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1, 2, 3, 6, 7, 8, 9, 1, 9, 1, 2, 8), 10));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1, 1, 1, 1, 2, 3, 6, 7, 8, 9, 1, 9, 1, 2, 8), 10));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1, 3, 46, 1, 3, 9), 47));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1, 5, 3, 4, 2), 3));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(1), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0), 1));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,0), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,0,0), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,0,0), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,0,0,0), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,0,0,0,0), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0,1,0,1), 1));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(0, 0, 0, 3, 2, 5, 4), 0));
        System.out.println("Count of pairs with given sum is "
                + numberOfPairs(Arrays.asList(7,6,12,3,9,3,5,1), 12));
    }

    public static int numberOfPairs(List<Integer> a, int k) {
        if (a == null || a.size() == 0 || k < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < a.size(); i++) {
              int target = k - a.get(i);
              if (map.containsKey(target)) {
//                  System.out.println("target " + target);
                  count++;
                  if (target == a.get(i) && map.get(target) == 1) {
                      count--;
                  }
                  map.remove(target);
                  map.remove(a.get(i));
              }
        }

        return (int)Math.ceil((double) count);
    }
}
