public class RightRotateAnArrayByKPlaces {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 34, 45, 67, 99};
        int k = 2; // Number of places to rotate
        System.out.print("Array before right rotation by " + k + " places: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        rightRotateByKPlaces(numbers, k);
        System.out.print("\nArray after right rotation by " + k + " places: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Time: O(n), Space: O(1)
    public static void rightRotateByKPlaces(int[] arr, int k) {
        if (arr.length == 0) {
            return;
        }

        k = k % arr.length; // In case k is greater than array length

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
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
