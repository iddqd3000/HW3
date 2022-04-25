package com.company;

public class Student {
    private String name;
    private int quizScore;
    private int quizCounter;

    public Student(String name, int quizScore) {
        this.name = name;
        this.quizScore = quizScore;
        quizCounter = 1;
    }

    public String getName() {
        return name;
    }

    public int getQuizCounter() {
        return quizCounter;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public void addQuiz(int Score) {
        quizScore += Score;
        ++quizCounter;
    }

    public int getTotalScore() {
        return quizScore;
    }

    public double getAverage() {
        double avg = (double) quizScore /  quizCounter;
        return avg;
    }


}
 class StudentTester{
    public static void main(String[] args) {
        Student Alex = new Student("Alex", 13);
        System.out.println(Alex.getName());
        System.out.println(Alex.getQuizScore());
        System.out.println(Alex.getQuizCounter());
        Alex.addQuiz(16);
        System.out.println(Alex.getTotalScore());
        Alex.addQuiz(14);
        System.out.println(Alex.getQuizCounter());
        System.out.println(Alex.getTotalScore());
        System.out.println(Alex.getAverage());
    }
}


