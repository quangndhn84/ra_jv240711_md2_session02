package ra.loop;

public class Foreach_Demo {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7,};
        //Tinh tong cac phan tu cua mang numbers
        int sumNumbers = 0;
        for (int element : numbers) {
            sumNumbers += element;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sumNumbers);
    }
}
