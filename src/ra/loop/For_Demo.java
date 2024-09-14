package ra.loop;

public class For_Demo {
    public static void main(String[] args) {
        //1. Tinh tong 10 so nguyen dau tien tu 1
        //B1: Khai bao bien tong voi gia tri khoi tao  la 0
        int sumNumbers = 0;
        //B2: Su dung vong lap for lap 10 lan de tinh tong
        for (int i = 1; i <= 10; i++) {
            sumNumbers += i;
        }
        //B3: In ra tong
        System.out.println("Tong 10 so nguyen dau tien la: " + sumNumbers);
        //2. Su dung vong for tim diem trung binh trong khoang 0-10
        int i = 0, j = 10;
        for (; i < j; i++, j--) {

        }
        System.out.println("Diem trung binh trong khoang 0-10 la: " + i);
    }
}
