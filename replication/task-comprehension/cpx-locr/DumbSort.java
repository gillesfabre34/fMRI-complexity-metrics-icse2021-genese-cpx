class GeneseCpx {

    public static void main() {
        int a = 9;
        int b = 12;
        int c = 8;
        int d = 11;
        System.out.print(compute(a, b, c, d));
    }

    public static List<Integer> compute(int a, int b, int c, int d) {
        if (a > b) { int temp = b; b = a; a = temp; }
        if (c > d) { int temp = d; d = c; c = temp; }
        if (a > c) { int temp = c; c = a; a = temp; }
        if (b > d) { int temp = d; d = b; b = temp; }
        if (b > c) { int temp = c; c = b; b = temp; }

        return Arrays.asList(a, b, c, d);
    }
}

//   0.2      int a = 9;
//   0.2         int b = 12;
//   0.2         int c = 8;
//   0.2         int d = 11;
//   2      if (a > b) { }
//   2      if (c > d) { }
//   3.5      if (a > c) { int temp = c; c = a; a = temp; }
//   3.5      if (b > d) { int temp = d; d = b; b = temp; }
//   3      if (b > c) { }
//   1      return Arrays.asList(a, b, c, d);
// TOTAL 15.8
