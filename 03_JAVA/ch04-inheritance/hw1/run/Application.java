package advanced.hw1.run;

import advanced.hw1.model.dto.EmployeeDTO;
import advanced.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] student = new StudentDTO[3];

        student[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (StudentDTO i : student) {
            System.out.println(i.information());
        }

        Scanner sc = new Scanner(System.in);
        EmployeeDTO[] employee = new EmployeeDTO[10];
        int i = 0;
        while(true){

            if (i==10){
                System.out.println("최대 10명까지 입력이 가능합니다.");
                break;
            }

            System.out.print("이름을 입력하세요 : ");
            String name = sc.nextLine();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("신장을 입력하세요 : ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("몸무게를 입력하세요 : ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("월급을 입력하세요 : ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("부서를 입력하세요 : ");
            String dept = sc.nextLine();



            employee[i] = new EmployeeDTO(name,age,height,weight,salary,dept);
            i++;


            System.out.print("계속 하시겠습니까?(Y/N) : ");
            String question = sc.nextLine();

            if (question.equals("Y")|| question.equals("y")){
                System.out.println("입력을 계속합니다.");
            }else if(question.equals("N") || question.equals("n")){
                System.out.println("입력을 종료합니다.");
                break;
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.println(employee[j].information());
        }


    }
}

/*

강개순
23
167.0
45.0
4
정보통신공학과
 */