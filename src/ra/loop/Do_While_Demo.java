package ra.loop;

import java.util.Scanner;

public class Do_While_Demo {
    public static void main(String[] args) {
        //Nhap cac so tu ban phim, tinh tong cac so, ket thuc khi nhap 0
        int sumNumbers = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap vao 1 so:");
            number = Integer.parseInt(scanner.nextLine());
            sumNumbers += number;
        } while (number != 0);
        System.out.println("Tong cac so vua nhap la: " + sumNumbers);
    }
}
