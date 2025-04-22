package advanced.ch08.sec11.exam01;

public class Car {
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    public Tire getTire1() {
        return tire1;
    }

    public void setTire1(Tire tire1) {
        this.tire1 = tire1;
    }

    public Tire getTire2() {
        return tire2;
    }

    public void setTire2(Tire tire2) {
        this.tire2 = tire2;
    }

    public void run(){
        tire1.roll();
        tire2.roll();
    }
}
