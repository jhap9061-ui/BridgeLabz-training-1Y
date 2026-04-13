package Collectionframework;


import java.util.HashMap;

    public class FrequencyOfElements {
        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 1, 4, 2, 3, 3};

            HashMap<Integer, Integer> freqMap = new HashMap<>();

            for (int num : arr) {
                // If element exists, increment count; else set to 1
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            // Print frequencies
            for (int key : freqMap.keySet()) {
                System.out.println(key + " -> " + freqMap.get(key));
            }
        }


