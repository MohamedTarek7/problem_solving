public class Solution1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        displayArray(numbers);

        int index_of_current_odd_number = 0;
        int swapper = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                if (swapper != 0) {
                    continue;
                }
                index_of_current_odd_number = i;
                swapper = numbers[i];
                continue;
            }
            numbers[index_of_current_odd_number] = numbers[i];
            numbers[i] = swapper;
            swapper = 0;
            i = index_of_current_odd_number;
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
