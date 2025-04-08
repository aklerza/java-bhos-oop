package service;

import model.Student;
import model.Course;
import model.Exam;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void enrollInCourse(Student student, Course course) {
        student.getEnrolledCourses().add(course);
    }

    public void addExam(Student student, Exam exam) {
        student.getExams().add(exam);
    }
}
