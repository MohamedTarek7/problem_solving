package test;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        display_array_elements(even_numbers(arr));
    }

    public static void display_array_elements(int[] arr) {
        System.out.print("{ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("}");
    }

    public static int[] even_numbers(int start, int end) {

        int[] result;

        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                result.
            }
        }

        int index = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }
}
