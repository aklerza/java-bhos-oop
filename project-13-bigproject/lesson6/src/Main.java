import model.*;
import service.*;
import util.JsonUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            StudentService studentService = new StudentService();
            TeacherService teacherService = new TeacherService();
            CourseService courseService = new CourseService();
            ExamService examService = new ExamService();

            Teacher teacher1 = new Teacher(1, "Abbas", "Sixemirli", "2005-04-01", new ArrayList<>());
            Teacher teacher2 = new Teacher(2, "Elnur", "Karimzada", "2001-03-15", new ArrayList<>());
            teacherService.addTeacher(teacher1);
            teacherService.addTeacher(teacher2);

            Course course1 = new Course(1, "Math", "Calculus & Statistics", teacher1, new ArrayList<>());
            Course course2 = new Course(2, "Physics", "Mechanics", teacher1, new ArrayList<>());
            Course course3 = new Course(3, "OOP", "C++", teacher2, new ArrayList<>());
            courseService.addCourse(course1);
            courseService.addCourse(course2);
            courseService.addCourse(course3);

            Student student1 = new Student(1, "Elvin", "Aliyev", "2005-01-10", new ArrayList<>(), new ArrayList<>());
            Student student2 = new Student(2, "Nigar", "Gahramanova", "2004-07-12", new ArrayList<>(), new ArrayList<>());
            studentService.addStudent(student1);
            studentService.addStudent(student2);
            
            studentService.enrollInCourse(student1, course1);
            studentService.enrollInCourse(student1, course2);
            studentService.enrollInCourse(student2, course2);
            studentService.enrollInCourse(student2, course3);

            courseService.enrollStudent(course1, student1);
            courseService.enrollStudent(course2, student1);
            courseService.enrollStudent(course2, student2);
            courseService.enrollStudent(course3, student2);

            // Exams
            Exam exam1 = new Exam(1, student1, course1, 85.5, "2025-01-05");
            Exam exam2 = new Exam(2, student1, course2, 90.0, "2025-02-10");
            Exam exam3 = new Exam(3, student2, course2, 70.0, "2025-01-15");
            Exam exam4 = new Exam(4, student2, course3, 88.0, "2025-02-18");

            examService.addExam(exam1);
            examService.addExam(exam2);
            examService.addExam(exam3);
            examService.addExam(exam4);

            studentService.addExam(student1, exam1);
            studentService.addExam(student1, exam2);
            studentService.addExam(student2, exam3);
            studentService.addExam(student2, exam4);

            JsonUtil.writeListToFile(studentService.getAllStudents(), "students.json");
            JsonUtil.writeListToFile(teacherService.getAllTeachers(), "teachers.json");
            JsonUtil.writeListToFile(courseService.getAllCourses(), "courses.json");
            JsonUtil.writeListToFile(examService.getAllExams(), "exams.json");

            System.out.println("Data written successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}