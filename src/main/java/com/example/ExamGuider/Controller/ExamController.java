package com.example.ExamGuider.Controller;

import com.example.ExamGuider.Entity.Exam;
import com.example.ExamGuider.Service.ServiceImpl.ExamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {

    private final ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping
    public List<Exam> getAll() {
        return examService.getAllExams();
    }

    @PostMapping
    public Exam add(@RequestBody Exam exam) {
        return examService.addExam(exam);
    }
}