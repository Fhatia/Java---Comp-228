package Question3;

public class Overload {

    public static int sum (int a, int b) {
        return a + b;
    }

    public static int multiply (int a, int b){
        return a * b;

    }

    public static int sum (int a, int b, int c){
        return a + b + c;

    }

    public static void main(String[] args) {
        int answer1 = sum(4, 25);
        System.out.println("Sum of 4 and 25 is: " + answer1);

        int answer2 = multiply(5, 10);
        System.out.println("Product 5 and 10 is: " + answer2);

        int answer3 = sum(2, 6, 9);
        System.out.println("Sum of 2, 6 and 9 is: " + answer3);
    }
}
