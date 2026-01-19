public class CheckIfArrayIsSortedAndRatated {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 1, 2};
        boolean isSortedAndRotated = checkIfSortedAndRotated(numbers);
        System.out.println("Is the array sorted and rotated? " + isSortedAndRotated);
    }

    // Time: O(n), Space: O(1)
    public static boolean checkIfSortedAndRotated(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
