package model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;

public class Student extends Human {
    @JsonBackReference
    private List<Course> enrolledCourses;
    @JsonBackReference
    private List<Exam> exams;

    public Student() {}

    public Student(int id, String name, String surname, String birthDate,
                   List<Course> enrolledCourses, List<Exam> exams) {
        super(id, name, surname, birthDate);
        this.enrolledCourses = enrolledCourses;
        this.exams = exams;
    }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }
    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public List<Exam> getExams() { return exams; }
    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
