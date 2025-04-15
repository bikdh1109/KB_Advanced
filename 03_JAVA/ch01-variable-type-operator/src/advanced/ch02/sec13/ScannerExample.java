package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("x값 입력:");
//        int x = sc.nextInt();
//        System.out.print("y값 입력:");
//        int y = sc.nextInt();
//
//        System.out.printf("x+y: %d",x+y);

        while (true){
            System.out.print("입력 문자열: ");
            String str = sc.nextLine();

            if (str.equals("q")){
                System.out.println("종료");
                break;
            }

            System.out.printf("출력 문자열: %s\n",str);
        }

        sc.close();
    }
}
