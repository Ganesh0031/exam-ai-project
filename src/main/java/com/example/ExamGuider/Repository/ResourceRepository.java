package com.example.ExamGuider.Repository;

import com.example.ExamGuider.Entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource,Long> {
    List<Resource> findByExamId(Long examId);
}
