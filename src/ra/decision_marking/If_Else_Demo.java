package ra.decision_marking;

import java.util.Scanner;

public class If_Else_Demo {
    public static void main(String[] args) {
        //1. Nhập vào 1 số nguyên, kiểm tra số vừa nhập có  là số chẵn hay số lẻ và in ra là số chẵn
        /*
         * B1: Đọc và hiểu yêu cầu
         * B2: Phân tích: đầu vào, đầu ra
         * B3: Các giải pháp và lựa chọn giải pháp phù hợp
         * B4: Các bước giải quyết vấn đề
         * B5: Thực hiện code theo các bước đã thiết kế
         *
         * */
        //B1: Nhập 1 số nguyên từ bàn phím
        //-1.1. Khoi tao doi tuong Scanner
        Scanner scanner = new Scanner(System.in);
        //-1.2. Thong bao nhap
        System.out.println("Nhap vao mot so nguyen:");
        //-1.3. Nhap so nguyen va luu vao 1 bien number
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Kiêm tra số nguyên có phải số chẵn không --> in ra thông báo
        //-2.1. Su dung cau lenh dieu kien de kiem tra so chan - if
        if (number % 2 == 0) {
            //-2.2. Neu la so chan thong bao ra
            System.out.printf("%d la so chan\n", number);
        } else {
            System.out.printf("%d la so le\n", number);
        }

        //2. In ra so du trong phep chia 3, su dung cau lenh dieu kien if
        if (number % 3 == 1) {
            System.out.printf("%d chia 3 du 1\n", number);
        } else if (number % 3 == 2) {
            System.out.printf("%d chia 3 du 2\n", number);
        } else {
            System.out.printf("%d chia het cho 3\n", number);
        }

        //3. Nhap vao 1 so nguyen tu ban phim, in ra so du trong phep chia 5: 1 if - 3 else-if - 1 else
    }


}
