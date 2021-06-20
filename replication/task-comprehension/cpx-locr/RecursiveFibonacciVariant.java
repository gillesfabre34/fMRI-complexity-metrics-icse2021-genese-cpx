class GeneseCpx {

    public static void main() {
        int number = 4;
        System.out.print(compute(number));
    }

    public static int compute(int number) {
        if (number <= 1) {
            return 1;
        }

        return compute(number - 2) + compute(number - 4);
    }
}

//         int number = 4;
//         if (number <= 1) { // n = 4
//         return compute(number - 2) + compute(number - 4);
//         if (number <= 1) { // n = 2
//         return compute(number - 2) + compute(number - 4);
//         if (number <= 1) { // n = 0
//             return 1;
//         if (number <= 1) { // n = -2
//             return 1;
//         if (number <= 1) { // n = 0
//             return 1;
//         return compute(number - 2) + compute(number - 4);
