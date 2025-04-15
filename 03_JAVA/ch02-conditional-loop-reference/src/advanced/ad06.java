package advanced;

import java.util.Scanner;

public class ad06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice=0;
        int amount =0;
        while (true){
            System.out.println("-------------------------");
            System.out.println("1.예금 |2.출금 |3.잔고|4.종료");
            System.out.println("-------------------------");

            System.out.print("선택>");
            choice = sc.nextInt();

            if (choice==1){
                System.out.print("예금액>");
                amount = sc.nextInt();
            } else if (choice==2) {
                System.out.print("출금액>");
                amount -= sc.nextInt();

            } else if (choice==3) {
                System.out.println("잔고>"+amount);

            }else if (choice==4){
                System.out.println("프로그램 종료");
                break;
            }
        }
        sc.close();
    }
}
