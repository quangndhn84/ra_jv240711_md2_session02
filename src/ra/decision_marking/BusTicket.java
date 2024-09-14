package ra.decision_marking;

import java.util.Scanner;

public class BusTicket {
    public static void main(String[] args) {
        //B1: Khai bao 1 hang so chua gia xe bus
        final float TICKET = 7000;
        //B2: Nhap vao tuoi cua nguoi di xe bus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao tuoi nguoi di xe bus:");
        int age = Integer.parseInt(scanner.nextLine());
        //B3: Tinh ve di xe bus va in ra man hinh
        if (age < 6 || age > 60) {
            System.out.println("Mien phi ve xe bus");
        } else if (age < 18) {
            System.out.println("Ve xe bus: " + TICKET * 0.5);
        } else {
            System.out.println("Ve xe bus: " + TICKET);
        }
    }
}
