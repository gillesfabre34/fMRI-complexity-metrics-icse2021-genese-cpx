class GeneseCpx {

    public static void main() {
        int[] numbers = {2, 4, 1, 4, 9};
        System.out.print(compute(numbers));
    }

    public static int compute(int[] numbers) {
        Arrays.sort(numbers);

        int count = numbers.length;
        int result = 0;
        for (int i = count - 1; i >= 0; i--) {
            int current = count - i;
            if (numbers[i] >= current) {
                result = current;
            } else {
                break;
            }
        }

        return result;
    }

}


//         int[] numbers = {2, 4, 1, 4, 9};
//         Arrays.sort(numbers);
//         int count = numbers.length;
//         int result = 0;
//         for (int i = count - 1; i >= 0; i--) {
//             int current = count - i;
//             if (numbers[i] >= current) {  // 9 / 4
//                 result = current; // result = 4
//             int current = count - i;
//             if (numbers[i] >= current) {  // 4 / 3
//                 break;
//         return result;


