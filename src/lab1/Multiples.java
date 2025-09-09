package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;

        while (i < n) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i += 1;
        }
        return count;
    }
}
