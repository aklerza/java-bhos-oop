package model;

import java.util.List;

public class Teacher extends Human {
    private List<Course> teachingCourses;

    public Teacher() {}

    public Teacher(int id, String name, String surname, String birthDate,
                   List<Course> teachingCourses) {
        super(id, name, surname, birthDate);
        this.teachingCourses = teachingCourses;
    }

    public List<Course> getTeachingCourses() { return teachingCourses; }
    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }
}