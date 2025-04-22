package advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.run();

        mycar.setTire1(new KumhoTire());
        mycar.setTire2(new KumhoTire());

        mycar.run();
    }
}
