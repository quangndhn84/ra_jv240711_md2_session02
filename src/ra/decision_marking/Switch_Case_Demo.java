package ra.decision_marking;

import java.util.Scanner;

public class Switch_Case_Demo {
    public static void main(String[] args) {
        //Nhap vao 1 so nguyen tu 0-chin, phien am so do
        //B1: Nhap vao 1 so nguyen tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen:");
        int number = Integer.parseInt(scanner.nextLine());
        //B2. Phien am so do
        switch (number) {
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            default:
                System.out.println("Chin");

        }
    }
}
