package advanced.hw1.dice;

public class Application {
    public static void main(String[] args) {
        Dicer dicer = new Dicer();

        // Dice 타입으로 다형성 적용
        Dice dice1 = new HellDice();
        Dice dice2 = new SuperDice();

        System.out.println("🎲 HellDice로 주사위 던지기:");
        dicer.throwDice(dice1); // 항상 4 출력

        System.out.println("\n🎲 SuperDice로 주사위 던지기:");
        dicer.throwDice(dice2); // 1~10 사이의 랜덤 값 출력
    }
}
