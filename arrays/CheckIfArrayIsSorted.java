public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 34, 45, 67, 99, 90};
        boolean isSorted = checkIfSorted(numbers);
        System.out.println("Is the array sorted in ascending order? " + isSorted);
    }

    // Time: O(n), Space: O(1)
    public static boolean checkIfSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
