package com.example.ExamGuider.Service.ServiceImpl;

import com.example.ExamGuider.Entity.Exam;
import com.example.ExamGuider.Entity.Resource;
import com.example.ExamGuider.Repository.ExamRepository;
import com.example.ExamGuider.Repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;
    private final ExamRepository examRepository;

    public ResourceService(ResourceRepository resourceRepository, ExamRepository examRepository) {
        this.resourceRepository = resourceRepository;
        this.examRepository = examRepository;
    }

    public Resource addResource(Long examId, Resource resource) {
        Exam exam = examRepository.findById(examId)
                .orElseThrow(() -> new RuntimeException("Exam not found"));

        resource.setExam(exam);
        return resourceRepository.save(resource);
    }

    public List<Resource> getResources(Long examId) {
        return resourceRepository.findByExamId(examId);
    }
}