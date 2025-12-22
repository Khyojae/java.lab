package ch17.sec06.exam01;

public class Student {
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
