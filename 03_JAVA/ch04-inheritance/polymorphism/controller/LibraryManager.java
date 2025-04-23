package advanced.polymorphism.controller;

import advanced.polymorphism.model.dto.AniBook;
import advanced.polymorphism.model.dto.Book;
import advanced.polymorphism.model.dto.CookBook;
import advanced.polymorphism.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }



    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }

    public void insertMember(Member mem){
       this.mem = mem;
    }
    public Member myInfo(){
        System.out.println(mem.toString());
        return mem;
    }
    public Book[] selectAll(){
        return bList;
    }
    public Book[] searchBook(String keyword){
        Book[] newList = new Book[5];
        int count = 0;
        for (Book book : bList){
            if(book.getTitle().contains(keyword)){
                newList[count] = book;
                count++;
                if (count == 5) break;
            }
        }

        return newList;
    }
    public int rentBook(int index){
        int result = 0;

        Book rent = bList[index];
       if(rent instanceof AniBook){
           if(((AniBook) rent).getAccessAge()>mem.getAge()){
               return 1;
           }
       }
       if (rent instanceof CookBook){
           if(((CookBook) rent).isCoupon()){
               mem.setCouponCount(mem.getCouponCount()+1);
               return 2;
           }
       }

        return result;
    }

}
