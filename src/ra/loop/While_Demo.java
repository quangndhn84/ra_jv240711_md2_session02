package ra.loop;

public class While_Demo {
    public static void main(String[] args) {
        //In ra va tinh tong 20 so nguyen chan dau tien tinh tu 1
        //B1: Khai bao bien dem so nguyen chan, tong cac nguyen chan
        int cntEvent = 0;
        int sumEvents = 0;
        //B2: Su dung vong lap while de in 20 so chan dau tien va tinh tong
        int number = 1;
        System.out.println("20 so chan dau tien tinh tu 1 la:");
        while (cntEvent < 20) {
            if (number % 2 == 0) {
                System.out.printf("%d\t", number);
                cntEvent++;
                sumEvents += number;
            }
            number++;
        }
        //B3: In ra tong
        System.out.printf("\nTong 20 so nguyen chan dau tien la: %d\n", sumEvents);
    }
}
