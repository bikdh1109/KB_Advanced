package advanced.ch02.sec12;

public class TrapezoidArea {
    public static void main(String[] args) {
        int top = 5;
        int bottom = 10;
        int height = 7;

        double area = (top+bottom) * height / 2.0;
        System.out.println("사다리꼴의 넓이는 : " +area);
    }
}
