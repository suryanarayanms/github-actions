package com.prep.prep.playarea;

public class MainClass {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

            // Check if nums[i] appeared before
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, store it
            if (!isDuplicate) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Optional: print the unique values
        for (int k = 0; k < index; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println(index);

        // return index; // total unique count
    }

}
