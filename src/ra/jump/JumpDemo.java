package ra.jump;

public class JumpDemo {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen tu 1-5 la:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
//                break;//1 2
                continue;//1 2 4 5
            }
            System.out.printf("%d\t", i);
        }
        System.out.printf("\n");
        int sum = addTwoNumbers(5, 7);
        System.out.println("Tong 2 so la: " + sum);
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber) {
        int sumNumber = firstNumber + secondNumber;
        return sumNumber;
    }
}
