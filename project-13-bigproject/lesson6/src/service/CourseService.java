package service;

import model.Course;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public void assignTeacher(Course course, Teacher teacher) {
        course.setTeacher(teacher);
    }

    public void enrollStudent(Course course, Student student) {
        course.getStudents().add(student);
    }
}