package Dz.Dz4.Cros_Null;

public class CreatCrosNull {

    public void createField(){
        create();
    }

    private void create(){
        int[][] arr = new int[3][3];
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
