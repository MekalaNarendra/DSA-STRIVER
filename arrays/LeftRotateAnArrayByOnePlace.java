public class LeftRotateAnArrayByOnePlace {
    public static void main(String[] args) {
        int[] numbers = {12, 23, 34, 45, 67, 99};
        System.out.print("Array before left rotation by one place: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        leftRotateByOne(numbers);
        System.out.print("Array after left rotation by one place: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Time: O(n), Space: O(1)
    public static void leftRotateByOne(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = firstElement;
    }
}
