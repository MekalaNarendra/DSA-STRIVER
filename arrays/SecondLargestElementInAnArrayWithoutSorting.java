public class SecondLargestElementInAnArrayWithoutSorting {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    // Time: O(n), Space: O(1)
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
