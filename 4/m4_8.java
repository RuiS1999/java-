public class m4_8 {
    public static void main(String []args) {
        int[] [] scores = new int[3][4];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                scores[i][j] = new java.util.Random().nextInt(100);
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j];
                count++;
            }
            System.out.println("");
        }
        System.out.println(sum);
        System.out.println(count);
        for (int i = 0; i < 3; i++) {
            float sumI = 0; 
            float avgI = 0;
            for (int j = 0; j < 4; j++) {
                sumI += scores[i][j];
            }
            avgI = sumI / scores[i].length;
            System.out.println(i + "列目の合計は" + String.format("%.0f", sumI));
            System.out.println(i + "列目の平均は" + avgI);
        }
    }
}