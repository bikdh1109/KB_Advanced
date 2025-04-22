package advanced.hw1.dice;

public class SuperDice extends Dice {

    int min;
    int max;

    public SuperDice(){
        super();
        min = 1;
        max = 10;
    }

    @Override
    public int getNumber() {
        int num = (int)(Math.random()*max) + min;
        return num;
    }

}
