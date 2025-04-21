package homework;

public class homework1 {
    public static void main(String[] args) {
        int multiple = 0;
        for (int i=1; i<=100;i++){
            if (i%3==0){
                multiple += i;
                System.out.printf("%d는 3의 배수입니다.\n",i);
            }
        }
        System.out.printf("3의 배수의 총합은 : %d 입니다.\n",multiple);
    }
}
