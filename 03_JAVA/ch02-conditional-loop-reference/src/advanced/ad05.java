package advanced;

public class ad05 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}
        };
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
            }
            average=sum/array[i].length;
            System.out.println("합은 : "+sum + " 평균은 : " + average);
            sum = 0;
            average=0;
        }

    }
}
