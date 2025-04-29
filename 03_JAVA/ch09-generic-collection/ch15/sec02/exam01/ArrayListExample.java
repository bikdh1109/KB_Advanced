package advanced.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board());
        list.add(new Board());
        list.add(new Board());
        list.add(new Board());
        list.add(new Board());

        System.out.println(list.size());

        System.out.println(list.get(3));

        for (int i = 0 ;i <list.size() ; i++){
            System.out.println(list.get(i).getContent() + " " + list.get(i).getSubject()+ " " + list.get(i).getWriter());
        }

        list.remove(2);
        list.remove(2);

        for (Board b : list){
            System.out.println(b.getContent() + " " + b.getSubject() + " " + b.getWriter());
        }


    }
}
