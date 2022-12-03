import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            int val = num1++;
            if (val % 5 == 0 && val % 3 == 0){
                System.out.println("FizzBuzz");
            } else if (val % 3 == 0) {
                System.out.println("Fizz");
            } else if (val % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(val);
            }
        }
    }
}
