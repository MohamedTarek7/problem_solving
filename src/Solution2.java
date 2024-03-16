public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Solution1.displayArray(numbers);

        int tracker = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                int swapper = numbers[i];
                numbers[i] = numbers[tracker];
                numbers[tracker] = swapper;
                tracker++;
            }
        }

        displayArray(numbers);
    }

    public static void displayArray(int[] arr) {
        int length = arr.length;
        System.out.print("\n{ ");

        for (int i = 0; i < length; i++) {
            System.out.print(i != length - 1 ? arr[i] + ", " : arr[i] + " ");
        }

        System.out.print("}\n");
    }
}
