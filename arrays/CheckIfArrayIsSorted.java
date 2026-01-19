public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {3,4,5,1,2};
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
