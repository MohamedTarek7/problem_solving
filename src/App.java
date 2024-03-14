public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int index = 0;
        int swapper = 0;
        for (int i = index; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                index = i;
                swapper = numbers[i];
            } else {
                swapper = numbers[i];
                numbers[i] = numbers[index];
                numbers[index] = swapper;
                index = i;
            }
        }
    }
}
