public class Divisibilityof3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                count++;
            }
        }
        System.out.println("The sum of the numbers between 1 and 100 which are divisible by 3 is " + sum);
        System.out.println("Total numbers between 1 and 100 which are divisible by 3 is " + count);
    }
}
