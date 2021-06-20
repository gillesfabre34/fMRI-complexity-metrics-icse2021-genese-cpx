class GeneseCpx {

    public static void main() {
        String word = "Magdeburg";
        System.out.print(compute(word));
    }

    public static int compute(String word) {
        char[] letters = {'a', 'e', 'i', 'o', 'u'};
        int result = 0;

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (word.charAt(i) == letters[j]) {
                    result++;
                }
            }
        }

        return result;
    }
}

//  0.5       String word = "Magdeburg";
//  0.5       char[] letters = {'a', 'e', 'i', 'o', 'u'};
//  0.5       int result = 0;
//  2.5       for (int i = 0; i < word.length(); i++) {
//  2.5           for (int j = 0; j < letters.length; j++) {
//  5.5               if (word.charAt(i) == letters[j]) { 0 / 0 => M / a
//  1               if (word.charAt(i) == letters[j]) { 0 / 1 => M / e
//  1               if (word.charAt(i) == letters[j]) { 0 / 2, 3, 4 => M / i, o, u
//  1               if (word.charAt(i) == letters[j]) { 1 / 0 => a / a
//  0.5                   result++;
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => a / e, i, o, u
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => g / a, e, i, o, u
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => d / a, e, i, o, u
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => e / a, e, i, o, u
//  0.5                   result++;
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => b / a, e, i, o, u
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => u / a, e, i, o, u
//  0.5                   result++;
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => r / a, e, i, o, u
//  0.5               if (word.charAt(i) == letters[j]) { 0 / 1, 2, 3, 4 => g / a, e, i, o, u
//  0.5       return result;
// TOTAL 18
