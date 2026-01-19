public class RemoveDuplicatesFromTheSortedArrayII {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 2, 2, 3, 3, 3, 4};
        int newLength = removeDuplicates(numbers);

        System.out.println("The length of the array after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // Time: O(n), Space: O(1)
    public static int removeDuplicates(int[] arr) {
        if (arr.length <= 2) {
            return arr.length;
        }

        int uniqueIndex = 2;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex - 2]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
