import java.util.*;

class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        Map<Integer, Set<Integer>> map = new HashMap<>();

        // Store reserved seats row-wise
        for (int[] seat : reservedSeats) {
            map.putIfAbsent(seat[0], new HashSet<>());
            map.get(seat[0]).add(seat[1]);
        }

        // Rows without any reservation can have 2 families
        int count = (n - map.size()) * 2;

        // Check only rows having reserved seats
        for (Set<Integer> seats : map.values()) {

            boolean left = true;    // 2,3,4,5
            boolean right = true;   // 6,7,8,9
            boolean middle = true;  // 4,5,6,7

            // Check 2-5
            for (int i = 2; i <= 5; i++) {
                if (seats.contains(i)) {
                    left = false;
                    break;
                }
            }

            // Check 6-9
            for (int i = 6; i <= 9; i++) {
                if (seats.contains(i)) {
                    right = false;
                    break;
                }
            }

            // Check 4-7
            for (int i = 4; i <= 7; i++) {
                if (seats.contains(i)) {
                    middle = false;
                    break;
                }
            }

            if (left && right) {
                count += 2;
            } 
            else if (left || right || middle) {
                count += 1;
            }
        }

        return count;
    }
}