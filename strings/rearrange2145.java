class Solution {
    public int[] rearrangeArray(int[] nums) {
        int length = nums.length;

        ArrayList<Integer> arraypositive = new ArrayList<>();
        ArrayList<Integer> arraynegative = new ArrayList<>();
        ArrayList<Integer> numsresult = new ArrayList<>();
        int[] result = new int[length];

        for (int index = 0; index < length; index = index + 1) {
            if (nums[index] >= 0) {
                arraypositive.add(nums[index]);
            } else {
                arraynegative.add(nums[index]);
            }
        }

        // Adjusting loop bounds and logic for merging arrays
        for (int index = 0; index < length; index = index + 1) {
            if (index % 2 == 0 && index / 2 < arraypositive.size()) {
                numsresult.add(arraypositive.get(index / 2));
            } else if (index / 2 < arraynegative.size()) {
                numsresult.add(arraynegative.get(index / 2));
            }
        }

        // Copying elements from ArrayList to array
        for (int i = 0; i < length; i++) {
            result[i] = numsresult.get(i);
        }

        return result;
    }
}
