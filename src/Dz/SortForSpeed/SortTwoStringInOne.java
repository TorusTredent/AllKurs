package Dz.SortForSpeed;

public class SortTwoStringInOne {

    public void sorting() {
        String[] s1 = {"doub", "voo", "integer"};
        String[] s2 = {"flottt", "gremlinga", "zemfira111111"};
        String[] s3 = new String[s1.length + s2.length];
        for (int i = 0; i < s1.length; i++) {
            s3[i] = s1[i];
        }
        int temp = s1.length;
        for (int i = 0; i < s2.length; i++) {
            s3[temp] = s2[i];
            temp++;
        }
        String count;
        int j;
        int i;
        long startTime = System.nanoTime();
        for (i = 0; i < s3.length; ++i) {
            for (j = i + 1; j < s3.length; ++j) {
                if (s3[i].length() > s3[j].length()) {
                    count = s3[i];
                    s3[i] = s3[j];
                    s3[j] = count;
                }
            }
        }
        long time = System.nanoTime() - startTime;
        System.out.println(time);
        for (i = 0; i < s3.length; i++) {
            System.out.print(s3[i] + " ");
        }
    }
}
