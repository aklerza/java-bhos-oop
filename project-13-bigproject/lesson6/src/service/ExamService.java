package service;

import model.Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamService {
    private List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getAllExams() {
        return exams;
    }

    public List<Exam> getExamsByStudentId(int studentId) {
        List<Exam> result = new ArrayList<>();
        for (Exam exam : exams) {
            if (exam.getStudent().getId() == studentId) {
                result.add(exam);
            }
        }
        return result;
    }
}
