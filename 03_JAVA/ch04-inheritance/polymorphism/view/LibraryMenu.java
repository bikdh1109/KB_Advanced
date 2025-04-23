package advanced.polymorphism.view;
import advanced.polymorphism.controller.LibraryManager;
import advanced.polymorphism.model.dto.Book;
import advanced.polymorphism.model.dto.Member;
import java.util.Scanner;

public class LibraryMenu {
    Scanner sc = new Scanner(System.in);
    private LibraryManager lm = new LibraryManager();

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }

    public void mainMenu(){

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요(M/W) : ");
        String genderInput = sc.nextLine().trim();
        char gender = Character.toUpperCase(genderInput.charAt(0));

        lm.insertMember(new Member(name, age, gender));

        while(true){
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");

            System.out.print("원하는 메뉴 번호를 입력하세요 :");
            int choice =  sc.nextInt();
            sc.nextLine();

            if (choice==1){
                lm.myInfo();
            }else if(choice==2){
                selectAll();
            }else if(choice==3){
                searchBook();
            }else if(choice==4){
                rentBook();
            } else if (choice==0) {
                break;
            }
        }
    }
    public void selectAll(){
        Book[] bList = lm.selectAll();

        for (int i = 0 ; i<bList.length; i++){
            System.out.println(i + "번 도서 || " + bList[i].toString());
        }
    }
    public void searchBook(){
        System.out.print("검색할 제목의 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        Book[] result = lm.searchBook(keyword);

        boolean found = false;
            for (Book book : result){
                if(book != null){
                    System.out.println(book.toString());
                    found = true;
                }
            }
        if (!found){
            System.out.println("찾는 도서가 없습니다.");
            System.out.println();
        }

    }
    public void rentBook(){
        selectAll();

        System.out.print("대여할 도서 번호 선택 : ");
        int index = sc.nextInt();
        sc.nextLine();
        int result = lm.rentBook(index);

        if (result==0){
            System.out.println("성공적으로 대여되었습니다.");
            System.out.println();
        }else if(result==1){
            System.out.println("나이 제한으로 대여 불가능입니다.");
            System.out.println();
        }else if(result==2){
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
            System.out.println();
        }
    }
}
