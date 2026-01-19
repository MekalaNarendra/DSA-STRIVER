import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] numbers = {34, 67, 23, 89, 12, 90, 45};
        int k = 3;
        int kthLargest = findKthLargest(numbers, k);
        int kthLargest1 = findKthLargestbyOptimized(numbers, k);
        System.out.println("The " + k + "th largest element in the array is: " + kthLargest);
        System.out.println("The " + k + "th largest element in the array using optimized method is: " + kthLargest1);
    }

    private static int findKthLargestbyOptimized(int[] numbers, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : numbers) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();

    }

    // Time: O(n log n), Space: O(1)
    public static int findKthLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
