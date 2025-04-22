package advanced.hw1.dice;

public class Dicer {
    public void throwDice(Dice dice){
        int num = dice.getNumber();
        System.out.println("주사위 숫자 : " + num);
    }
}
