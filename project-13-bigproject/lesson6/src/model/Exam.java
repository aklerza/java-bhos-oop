package model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Exam {
    private int id;
    @JsonManagedReference
    private Student student;
    private Course course;
    private double score;
    private String date;

    public Exam() {}

    public Exam(int id, Student student, Course course, double score, String date) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.score = score;
        this.date = date;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}