public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int largest = findLargest(numbers);
        int largest1 = findLargestByOptimizeMethod(numbers);

        System.out.println("The largest element in the array using optimized method is: " + largest1);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    // Time: O(n), Space: O(1)
    public static int findLargestByOptimizeMethod(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }
}
