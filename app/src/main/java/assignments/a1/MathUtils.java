package assignments.a1;

public class MathUtils {

    // Function to compute gcd of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    // Function to compute lcm of two numbers
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; // lcm(0, b) is defined as 0
        }
        return Math.abs(a / gcd(a, b) * b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(4, 6));   // Output: 12
        System.out.println(lcm(21, 6));  // Output: 42
        System.out.println(lcm(8, 0));   // Output: 0
    }
}