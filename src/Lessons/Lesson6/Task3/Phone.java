package Lessons.Lesson6;

public abstract class Phone {
    private String company;

    public Phone(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public abstract void ring();
    public abstract void call();
}
