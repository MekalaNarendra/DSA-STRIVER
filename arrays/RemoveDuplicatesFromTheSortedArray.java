public class RemoveDuplicatesFromTheSortedArray {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(numbers);


        System.out.println("The length of the array after removing duplicates is: " + newLength);
        System.out.print("The array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    // Time: O(n), Space: O(1)
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int uniqueIndex = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
