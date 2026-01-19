public class LeftRotateAnArrayByKPlaces {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.print("Array before left rotation by " + k + " places: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        leftRotateByKPlaces(numbers, k);
        System.out.print("\nArray after left rotation by " + k + " places: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Time: O(n), Space: O(1)
    public static void leftRotateByKPlaces(int[] arr, int k) {
        if (arr.length == 0 || k <= 0) {
            return;
        }

        k = k % arr.length; // In case k is greater than array length

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
