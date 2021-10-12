package Lessons.Lesson7;

public enum Calculator {
    SUM{
        @Override
        public int action(int x, int y) {
            return x + y;
        }
    },
    DIFF{
        @Override
        public int action(int x, int y) {
            return x - y;
        }
    };
    public abstract int action(int x, int y);
}
