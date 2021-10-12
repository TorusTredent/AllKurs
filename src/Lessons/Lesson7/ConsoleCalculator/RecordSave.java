package Lessons.Lesson7.ConsoleCalculator;

public class RecordSave {
    private double[] arr;
    private int count = 0;


    public RecordSave(double[] arr) {
        this.arr = arr;
    }

    public void saveRecording(double record){
        arr[count] =  record;
        if(count == 4){
            count = 0;
        }else count++;
    }

    public double returnLastRecord(){
        if(count == 0){
            return arr[4];
        }
        return arr[count-1];
    }

    public double[] getArr() {
        return arr;
    }

}
