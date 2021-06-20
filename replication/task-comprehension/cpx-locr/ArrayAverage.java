class GeneseCpx {

    public static void main() {
        int[] numbers = {2, 4, 1, 9};
        System.out.print(compute(numbers));
    }

    public static float compute(int[] numbers) {
        int number1 = 0;
        int number2 = 0;

        while (number1 < numbers.length) {
            number2 = number2 + numbers[number1];
            number1 = number1 + 1;
        }

        float result = number2 / (float) number1;
        return result;
    }
}


//   0.5     int[] numbers = {2, 4, 1, 9};
//   0.5      int number1 = 0;
//   0.5      int number2 = 0;
//   3      while (number1 < numbers.length) {
//   5         number2 = number2 + numbers[number1];
//   2          number1 = number1 + 1;
//   3          number2 = number2 + numbers[number1];
//   0.5          number2 = number2 + numbers[number1];
//   0.5          number2 = number2 + numbers[number1];
//   2      float result = number2 / (float) number1;
//   0.5      return result;

// TOTAL = 18
