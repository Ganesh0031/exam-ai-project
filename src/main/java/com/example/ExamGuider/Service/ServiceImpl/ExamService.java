package com.example.ExamGuider.Service.ServiceImpl;

import com.example.ExamGuider.Entity.Exam;
import com.example.ExamGuider.Repository.ExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }

    public Exam addExam(Exam exam) {
        return examRepository.save(exam);
    }
}
