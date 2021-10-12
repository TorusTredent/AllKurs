package Lessons.Lesson7.ConsoleCalculator;

public class MathOperations extends Variables implements Operations{
    private double record;

    public MathOperations(double x, double y, double record) {
        super(x, y);
        this.record = record;
    }


    @Override
    public void sum(double x, double y) {
        record = x + y;
    }

    @Override
    public void subtract(double x, double y) {
        record = x - y;
    }

    @Override
    public void diff(double x, double y) {
        record = x / y;
    }

    @Override
    public void multiply(double x, double y) {
        record = x * y;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }
}
