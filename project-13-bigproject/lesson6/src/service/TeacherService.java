package service;

import model.Teacher;
import model.Course;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public void assignCourse(Teacher teacher, Course course) {
        teacher.getTeachingCourses().add(course);
    }
}
