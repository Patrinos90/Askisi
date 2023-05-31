package gr.upatras.junit.first;

public class Askisi1 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        int result = Subtraction(num1, num2);

        System.out.println("Result: " + result);
        checkSign(result);
    }

    public static int Subtraction(int a, int b) {
        return a - b;
    }

    public static void checkSign(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } 
    }
}