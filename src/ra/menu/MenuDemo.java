package ra.menu;

import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        //In ra menu va thuc hien cac chuc nang theo menu
        /*
         * **********************MENU******************
         * 1. Pho bo Kobe
         * 2. Pha ga Viet Nam
         * 3. Xoi trung thit
         * 4. Banh my pate
         * 5. My tom khong nguoi lai
         * 6. Thoat
         * */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*******************MENU*****************");
            System.out.println("1. Pho bo Kobe");
            System.out.println("2. Pho ga Viet Nam");
            System.out.println("3. Xoi trung thit");
            System.out.println("4. Banh my Pate");
            System.out.println("5. My tom khong nguoi lai");
            System.out.println("6. Thoat");
            System.out.print("Lua chon cua ban:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Ban vua chon pho bo kobe");
                    break;
                case 2:
                    System.out.println("ban vua chon pho ga Viet Nam");
                    break;
                case 3:
                    System.out.println("Ban vua chon xoi trung thit");
                    break;
                case 4:
                    System.out.println("Ban vua chon banh my Pate");
                    break;
                case 5:
                    System.out.println("Ban vua chon my tom khong nguoi lai");
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-6");
            }
        } while (true);
    }
}
