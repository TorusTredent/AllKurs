package Dz.Dz4;

public class Main {
    public static void main(String[] args) {
            int[][] arr = new int[5][5];
            int count = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(count + " ");
                    arr[i][j] = count;
                    count++;
                }
                System.out.println();
        }
    }
}
